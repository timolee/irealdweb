package com.ireald.wp.mapper;

import com.ireald.wp.core.mybaits.mapper.BaseMapper;
import com.ireald.wp.domain.UserAssoDept;

public interface UserAssoDeptMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dept
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int insert(UserAssoDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dept
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int insertSelective(UserAssoDept record);
}