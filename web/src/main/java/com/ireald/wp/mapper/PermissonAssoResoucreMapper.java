package com.ireald.wp.mapper;
import com.ireald.wp.core.mybaits.mapper.BaseMapper;
import com.ireald.wp.domain.PermissonAssoResoucre;

public interface PermissonAssoResoucreMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permisson_resoucre
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int deleteByPrimaryKey(String permisson_resoucre_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permisson_resoucre
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int insert(PermissonAssoResoucre record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permisson_resoucre
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int insertSelective(PermissonAssoResoucre record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permisson_resoucre
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    PermissonAssoResoucre selectByPrimaryKey(String permisson_resoucre_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permisson_resoucre
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int updateByPrimaryKeySelective(PermissonAssoResoucre record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permisson_resoucre
     *
     * @mbggenerated Sat May 17 15:14:35 CST 2014
     */
    int updateByPrimaryKey(PermissonAssoResoucre record);
}