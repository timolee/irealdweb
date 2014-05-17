package com.ireald.wp.core.mybaits.dialect;

public class MysqlDialect extends Dialect
{

    /*
     * (non-Javadoc)
     * @see
     * org.mybatis.extend.interceptor.IDialect#getLimitString(java.lang.String,
     * int, int)
     */
    @Override
    public String getLimitString(String sql, int offset, int limit)
    {

        sql = sql.trim();
        StringBuffer pagingSelect = new StringBuffer(sql.length() + 100);

        pagingSelect.append(sql);

        pagingSelect.append(" limit ").append(offset - 1).append(" , ").append(limit);

        return pagingSelect.toString();
    }

}
