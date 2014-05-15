package com.ireald.core.mybaits.dialect;

public class Mssql58Dialect extends Dialect
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
        String order = "";
       
        StringBuffer pagingSelect = new StringBuffer(sql.length() + 100);

        pagingSelect
                .append("select * from (select row_number()over(order by tempcolumn)temprownumber,* ")
                .append(" from (select top ").append(offset + limit - 1).append(" tempcolumn=0,* from ( ");
        
        // 暂不支持多排序结果合并查询
        // 判断是否order....结尾, 分页中排序需要拆分sql
        if (sql.toLowerCase().matches(".+order[^)]+$"))
        {
            order = sql.substring(sql.lastIndexOf("order"));
            sql = sql.substring(0, sql.lastIndexOf("order"));
        }

        pagingSelect.append(sql);
        pagingSelect.append(" ) d " ).append(order).append(" ) t )tt where temprownumber>=").append(offset);

        return pagingSelect.toString();
    }

}
