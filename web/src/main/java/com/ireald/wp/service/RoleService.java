package com.ireald.wp.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ireald.wp.core.mybaits.mapper.BaseMapper;
import com.ireald.wp.core.mybaits.paging.Page;
import com.ireald.wp.core.mybaits.service.BaseService;
import com.ireald.wp.core.utils.Identities;
import com.ireald.wp.domain.Role;
import com.ireald.wp.domain.UserAssoRole;
import com.ireald.wp.mapper.RoleMapper;
import com.ireald.wp.mapper.UserAssoRoleMapper;

@Service
@Transactional
public class RoleService extends BaseService<Role,String> {

	@Autowired private RoleMapper roleMapper;
	
	@Autowired  private UserAssoRoleMapper userAssoRoleMapper;
	
	@Override
	public BaseMapper getMapper() {
		// TODO Auto-generated method stub
		return roleMapper;
	}

	@Override
	public int update(Role entity) {
		// TODO Auto-generated method stub
		return roleMapper.updateByPrimaryKey(entity);
	}

	@Override
	public int add(Role entity) {
		// TODO Auto-generated method stub
		return roleMapper.insert(entity);
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return roleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Role findById(String id) {
		// TODO Auto-generated method stub
		return roleMapper.selectByPrimaryKey(id);
	}
	
	public Role findWithPremissionById(String id){
		return roleMapper.selectWithPremissonByPrimaryKey(id);
	}
	
	public Role findWithResourceById(String id){
		return roleMapper.selectWithResourceByPrimaryKey(id);
	}

	@Override
	public Page<Role> findByPage(Page<Role> page) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int assoUserToRole(String userId,String roleId){
		if(StringUtils.isNoneBlank(userId)&&StringUtils.isNoneBlank(roleId)){
			UserAssoRole userAssoRole=new UserAssoRole();
			userAssoRole.setUser_role_id(Identities.uuid2());
			userAssoRole.setRole_id(roleId);
			userAssoRole.setUser_id(userId);
			return userAssoRoleMapper.insert(userAssoRole);
		}else{
			return 0;
		}
	}
	
  

}
