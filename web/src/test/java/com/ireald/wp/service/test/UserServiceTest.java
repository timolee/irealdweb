package com.ireald.wp.service.test;

import static org.junit.Assert.*;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ireald.wp.domain.User;
import com.ireald.wp.enums.StatusType;
import com.ireald.wp.service.UserService;

@RunWith(value = SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class UserServiceTest {
	@Resource private UserService userService;
	private final String  userId="1";
	@Before
	public void setUp() throws Exception {
		User user=new User();
		user.setUser_id(userId);
		user.setLoginid("timolee");
		user.setUsername("timolee");
		user.setAdmin(true);
		user.setCreate_date(new Date());
		user.setDeleted(false);
		user.setEmail("timo.li.icon@gmail.com");
		user.setMobile_phone_number("13780215544");
		user.setPinyin("xxx000");
		user.setSerialno(1);
		user.setPlainPassword("123456");
		user.setStatus(StatusType.ENABLE);
		userService.add(user);
	}

	@After
	public void tearDown() throws Exception {
		userService.deleteById(userId);
	}

	@Test
	public void testUpdateUser() {
		//fail("Not yet implemented");
	}

	@Test
	public void testAddUser() {
		User user=new User();
		user.setUser_id("2");
		user.setLoginid("timolee");
		user.setUsername("timolee");
		user.setAdmin(true);
		user.setCreate_date(new Date());
		user.setDeleted(false);
		user.setEmail("timo.li.icon@gmail.com");
		user.setMobile_phone_number("13780215544");
		user.setPinyin("xxx000");
		user.setSerialno(1);
		user.setPlainPassword("123456");
		user.setStatus(StatusType.ENABLE);
		int ret=userService.add(user);
		assertEquals(1, ret);
	}
	
	@Test
	public void testFindByIdString() {
		User user=userService.findById(userId);
		System.out.println("testFindByIdString:"+ReflectionToStringBuilder.toString(user));
		assertNotNull(user);
	}

	@Test
	public void testFindByPagePageOfUser() {
		//fail("Not yet implemented");
	}

	@Test
	public void testFindUserByLoginId() {
		User user1=userService.findUserByLoginId("timolee");
		System.out.println("testFindUserByLoginId:"+ReflectionToStringBuilder.toString(user1));
		assertNotNull(user1);
	}

	@Test
	public void testFindUserWithRolesByLoginId() {
		userService.deleteById("2");
	}
	

}
