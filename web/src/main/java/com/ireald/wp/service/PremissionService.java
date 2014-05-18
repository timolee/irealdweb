package com.ireald.wp.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ireald.wp.core.mybaits.mapper.BaseMapper;
import com.ireald.wp.core.mybaits.paging.Page;
import com.ireald.wp.core.mybaits.service.BaseService;
import com.ireald.wp.domain.Premission;
import com.ireald.wp.domain.RoleAssoPermisson;
import com.ireald.wp.mapper.PremissionMapper;
import com.ireald.wp.mapper.RoleAssoPermissonMapper;
@Service
@Transactional
public class PremissionService extends BaseService<Premission,String> {

	@Autowired private PremissionMapper premissionMapper;
	@Autowired private RoleAssoPermissonMapper roleAssoPermissonMapper;
	
	@Override
	public BaseMapper getMapper() {
		// TODO Auto-generated method stub
		return premissionMapper;
	}

	@Override
	public int update(Premission entity) {
		// TODO Auto-generated method stub
		return premissionMapper.updateByPrimaryKey(entity);
	}

	@Override
	public int add(Premission entity) {
		// TODO Auto-generated method stub
		return premissionMapper.insert(entity);
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return premissionMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Premission findById(String id) {
		// TODO Auto-generated method stub
		return premissionMapper.selectByPrimaryKey(id);
	}
	
	public Premission findWithResourceById(String id) {
		// TODO Auto-generated method stub
		return premissionMapper.selectWithResourceByPrimaryKey(id);
	}

	@Override
	public Page<Premission> findByPage(Page<Premission> page) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int assoRoleToPremission(String role_id,String permisson_id){
		if(StringUtils.isNotBlank(role_id)&&StringUtils.isNoneBlank(permisson_id)){
			RoleAssoPermisson roleAssoPermisson=new RoleAssoPermisson();
			roleAssoPermisson.setRole_permisson_id(java.util.UUID.randomUUID().toString().replace("-", ""));
			roleAssoPermisson.setRole_id(role_id);
			roleAssoPermisson.setPermisson_id(permisson_id);
			return roleAssoPermissonMapper.insert(roleAssoPermisson);
		}else{
			return 0;
		}
	}

}
