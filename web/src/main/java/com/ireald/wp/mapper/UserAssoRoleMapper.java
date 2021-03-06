package com.ireald.wp.mapper;

import com.ireald.wp.core.mybaits.mapper.BaseMapper;
import com.ireald.wp.domain.UserAssoRole;

public interface UserAssoRoleMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int deleteByPrimaryKey(String user_role_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int insert(UserAssoRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int insertSelective(UserAssoRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    UserAssoRole selectByPrimaryKey(String user_role_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int updateByPrimaryKeySelective(UserAssoRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int updateByPrimaryKey(UserAssoRole record);
    
    
}