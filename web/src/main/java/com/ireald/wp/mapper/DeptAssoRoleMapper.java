package com.ireald.wp.mapper;

import com.ireald.wp.core.mybaits.mapper.BaseMapper;
import com.ireald.wp.domain.DeptAssoRoleKey;

public interface DeptAssoRoleMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int deleteByPrimaryKey(DeptAssoRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int insert(DeptAssoRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int insertSelective(DeptAssoRoleKey record);
}