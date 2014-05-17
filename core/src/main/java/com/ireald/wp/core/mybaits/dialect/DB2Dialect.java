package com.ireald.wp.core.mybaits.dialect;

public class DB2Dialect extends Dialect
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

        pagingSelect
                .append("SELECT * FROM (SELECT PAGE_B.*, ROWNUMBER() OVER() AS RN FROM ( ");

        pagingSelect.append(sql);

        pagingSelect.append(" ) AS PAGE_B )AS PAGE_A WHERE PAGE_A.RN BETWEEN ").append(offset).append(" AND ").append(offset + limit - 1);

        return pagingSelect.toString();
    }

}