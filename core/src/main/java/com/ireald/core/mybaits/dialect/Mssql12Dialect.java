package com.ireald.core.mybaits.dialect;

public class Mssql12Dialect extends Dialect
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
        pagingSelect.append(" OFFSET " ).append(offset).append(" ROW FETCH NEXT ").append(limit).append(" ROWS ONLY ");

        return pagingSelect.toString();
    }

}