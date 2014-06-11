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

import com.ireald.wp.core.mybaits.paging.Page;
import com.ireald.wp.domain.Dept;
import com.ireald.wp.domain.Role;
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
		user.setLoginid("timoli");
		user.setUsername("timoli");
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
		User user=new User();
		user.setUser_id("2");
		user.setLoginid("timoli2");
		user.setUsername("timoli2");
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
		user=userService.findById("2");
		user.setUsername("abc");
		userService.update(user);
		user=userService.findById("2");
		assertEquals("abc", user.getUsername());
		userService.deleteById("2");
	}

	@Test
	public void testAddUser() {
		User user=new User();
		user.setUser_id("2");
		user.setLoginid("timoli2");
		user.setUsername("timoli2");
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
		userService.deleteById("2");
		
	}
	
	@Test
	public void testFindByIdString() {
		User user=userService.findById(userId);
		System.out.println("testFindByIdString:"+ReflectionToStringBuilder.toString(user));
		assertNotNull(user);
	}

	@Test
	public void testFindByPagePageOfUser() {
		Page<User> page=new Page<User>(1, 2);
		page=userService.findByPage(page);
		System.out.println("testFindByPagePageOfUser:"+page);
		if(page.getResult()!=null){
			for(User u:page.getResult()){
			System.out.println(ReflectionToStringBuilder.toString(u));
			}
		}
	}

	@Test
	public void testFindUserByLoginId() {
		User user1=userService.findUserByLoginId("timolee");
		System.out.println("testFindUserByLoginId:"+ReflectionToStringBuilder.toString(user1));
		assertNotNull(user1);
	}

	@Test
	public void testFindUserWithRolesByLoginId() {
		User user1=userService.findUserWithRolesByLoginId("admin");
		System.out.println("testFindUserWithRolesByLoginId:"+ReflectionToStringBuilder.toString(user1));
		if(user1.getRoles()!=null){
			System.out.println("findRoles!");
			for(Role r:user1.getRoles()){
				System.out.println(ReflectionToStringBuilder.toString(r));
			}
		}
		assertNotNull(user1);
	}
	
	@Test
	public void testFindUserWithDeptsByLoginId(){
		User user1=userService.findUserWithDeptsByLoginId("timolee");
		System.out.println("testFindUserWithDeptsByLoginId:"+ReflectionToStringBuilder.toString(user1));
		if(user1.getDepts()!=null){
		   for(Dept d:user1.getDepts()){
			   System.out.println(ReflectionToStringBuilder.toString(d));
		   }
		}
	}
		
}
