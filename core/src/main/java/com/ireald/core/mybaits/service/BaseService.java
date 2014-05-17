package com.ireald.core.mybaits.service;

import com.ireald.core.mybaits.mapper.BaseMapper;
import com.ireald.core.mybaits.paging.Page;

public abstract class BaseService<T,PK> {
	
	public abstract BaseMapper getMapper();
	
	public abstract  int update(T entity);

	public abstract int add(T entity);
	
	public abstract int deleteById(PK id);
	
	public abstract T findById(PK id);
	
	public abstract Page<T> findByPage(Page<T> page);
	
}
