package com.ireald.wp.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ireald.core.security.utils.Digests;
import com.ireald.core.utils.Encodes;
import com.ireald.wp.core.mybaits.mapper.BaseMapper;
import com.ireald.wp.core.mybaits.paging.Page;
import com.ireald.wp.core.mybaits.service.BaseService;
import com.ireald.wp.domain.User;
import com.ireald.wp.mapper.UserMapper;

@Service
@Transactional
public class UserService extends BaseService<User,String> {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;
	
	@Autowired private UserMapper userMapper;
	
	@Override
	public BaseMapper getMapper() {
		// TODO Auto-generated method stub
		return userMapper;
	}

	@Override
	public int update(User entity) {
		if (StringUtils.isNotBlank(entity.getPlainPassword())) {
			entryptPassword(entity);
		}
		return userMapper.updateByPrimaryKey(entity);
	}

	@Override
	public int add(User entity) {
		if (StringUtils.isNotBlank(entity.getPlainPassword())) {
			entryptPassword(entity);
		}
		return userMapper.insert(entity);
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public Page<User> findByPage(Page<User> page) {
		if(page!=null){
			long total=userMapper.countAll();
			page.setTotal(total);
			RowBounds rowBounds=new RowBounds(page.getStartRow(), page.getEndRow());
			page.setResult(userMapper.countAllbyPage(rowBounds));
		}
		return page;
	}
	
	public User findUserByLoginId(String loginId){
		return userMapper.selectByLoginId(loginId);
	}
	
	public User findUserWithRolesByLoginId(String loginId) {
		return userMapper.selectWithRolesByLoginId(loginId);
	}
	
	/**
	 * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
	 */
	private void entryptPassword(User user) {
		byte[] salt = Digests.generateSalt(SALT_SIZE);
		user.setSalt(Encodes.encodeHex(salt));
		byte[] hashPassword = Digests.sha1(user.getPlainPassword().getBytes(), salt, HASH_INTERATIONS);
		user.setPassword(Encodes.encodeHex(hashPassword));
	}
	
}
