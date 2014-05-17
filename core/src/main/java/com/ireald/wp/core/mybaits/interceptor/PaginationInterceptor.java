package com.ireald.wp.core.mybaits.interceptor;

import java.sql.Connection;
import java.util.Properties;
import java.util.regex.Pattern;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ireald.wp.core.mybaits.dialect.DB2Dialect;
import com.ireald.wp.core.mybaits.dialect.Dialect;
import com.ireald.wp.core.mybaits.dialect.Mssql12Dialect;
import com.ireald.wp.core.mybaits.dialect.Mssql58Dialect;
import com.ireald.wp.core.mybaits.dialect.MysqlDialect;
import com.ireald.wp.core.mybaits.dialect.OracleDialect;

@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }) })
public class PaginationInterceptor implements Interceptor {
	// 日志对象
	private static Logger logger = LoggerFactory.getLogger(PaginationInterceptor.class);
	private static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
	private static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
	private final static String SQL_SELECT_REGEX = "(?is)^\\s*SELECT.*$";
    private final static String SQL_COUNT_REGEX = "(?is)^\\s*SELECT\\s+COUNT\\s*\\(\\s*(?:\\*|\\w+)\\s*\\).*$";
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		StatementHandler statementHandler = (StatementHandler) invocation
				.getTarget();
		MetaObject metaStatementHandler = MetaObject.forObject(
				statementHandler, DEFAULT_OBJECT_FACTORY,
				DEFAULT_OBJECT_WRAPPER_FACTORY);
		//分离代理对象链(由于目标类可能被多个拦截器拦截，从而形成多次代理，通过下面的两次循环可以分离出最原始的的目标类)
		while (metaStatementHandler.hasGetter("h")) {
			Object object = metaStatementHandler.getValue("h");
			metaStatementHandler = MetaObject.forObject(object,
					DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY);
		}
		// 分离最后一个代理对象的目标类
		while (metaStatementHandler.hasGetter("target")) {
			Object object = metaStatementHandler.getValue("target");
			metaStatementHandler = MetaObject.forObject(object,
					DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY);
		}
		String originalSql = (String) metaStatementHandler.getValue("delegate.boundSql.sql");
		// 只有为select查询语句时才进行下一步
		if (originalSql.matches(SQL_SELECT_REGEX)&& !Pattern.matches(SQL_COUNT_REGEX, originalSql)){
			RowBounds rowBounds = (RowBounds) metaStatementHandler.getValue("delegate.rowBounds");
			Configuration configuration = (Configuration) metaStatementHandler.getValue("delegate.configuration");
			// 分页参数存在且不为默认值时进行分页SQL构造
			if (rowBounds != null && rowBounds != RowBounds.DEFAULT) {
				Dialect.Type databaseType = null;
				try {
					databaseType = Dialect.Type.valueOf(configuration
							.getVariables().getProperty("dialect").toUpperCase());
				} catch (Exception e) {
					// ignore
				}
				if (databaseType == null) {
					throw new RuntimeException(
							"the value of the dialect property in configuration.xml is not defined : "
									+ configuration.getVariables().getProperty(
											"dialect"));
				}
				Dialect dialect = null;
				switch (databaseType) {
				case ORACLE:
					dialect = new OracleDialect();
					break;
				case DB2:
					dialect = new DB2Dialect();
					break;
				case MYSQL:
					dialect = new MysqlDialect();
					break;
				case MSSQL58:
					dialect = new Mssql58Dialect();
					break;
				case MSSQL12:
					dialect = new Mssql12Dialect();
					break;
				default:
					break;
				}
				// 重写sql
				metaStatementHandler.setValue("delegate.boundSql.sql", dialect
						.getLimitString(originalSql, rowBounds.getOffset(),
								rowBounds.getLimit()));
				// 采用物理分页后，就不需要mybatis的内存分页了，所以重置下面的两个参数
				metaStatementHandler.setValue("delegate.rowBounds.offset",
						RowBounds.NO_ROW_OFFSET);
				metaStatementHandler.setValue("delegate.rowBounds.limit",
						RowBounds.NO_ROW_LIMIT);
				if (logger.isDebugEnabled()) {
					BoundSql boundSql = statementHandler.getBoundSql();
					logger.debug("生成分页SQL : " + boundSql.getSql());
				}	 	
			}
		}
		return invocation.proceed();
	}

	
	@Override
	public Object plugin(Object target) {
		// 当目标类是StatementHandler类型时，才包装目标类，否者直接返回目标本身,减少目标被代理的次数
		if (target instanceof StatementHandler) {
			return Plugin.wrap(target, this);
		} else {
			return target;
		}
	}

	@Override
	public void setProperties(Properties arg0) {
	
	}
	
}
