package com.ireald.wp.service.test;

import static org.junit.Assert.*;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ireald.wp.core.utils.Identities;
import com.ireald.wp.domain.Dept;
import com.ireald.wp.domain.Role;
import com.ireald.wp.service.DeptService;
@RunWith(value = SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class DeptServiceTest {
   @Autowired private DeptService deptService;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddDept() {
		/*Dept dept=new Dept();
		dept.setDept_id(Identities.uuid2());
		dept.setCode("00ae7c009b6d4c1bad59c19c6b97d707."+dept.getDept_id());
		dept.setFullname("ireald 公司>销售部");
		dept.setPid("00ae7c009b6d4c1bad59c19c6b97d707");
		dept.setName("销售部");
		dept.setSerailno(1);
		deptService.add(dept);*/
		//fail("Not yet implemented");
	}

	@Test
	public void testDeleteByIdString() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByIdString() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByPagePageOfDept() {
		fail("Not yet implemented");
	}

	@Test
	public void testAssoUserToDept() {
		/*String userId="bdba3e4cd7a64786bc91bb3e8cb3ebfc";
		String deptId="175514807e1142449d8dd30b3fa91d98";
		assertEquals(1, deptService.assoUserToDept(userId, deptId));*/
		//fail("Not yet implemented");
	}
	
	@Test
	public void testAssoRoleToDept(){
		/*String deptId="d78c723187c04e40998909d459a61804";
		String roleId="df4bc9a6e78c4c18bf346a9954b79c1d";
		assertEquals(1, deptService.assoRoleToDept(roleId, deptId));*/
	}
	
	@Test
	public void testFindDeptWithRoleById(){
		String deptId="d78c723187c04e40998909d459a61804";
		Dept dept=deptService.findDeptWithRoleById(deptId);
		System.out.println("testFindDeptWithRoleById: "+ReflectionToStringBuilder.toString(dept));
		if(dept!=null&&dept.getRoles()!=null){
			for(Role r:dept.getRoles()){
				System.out.println("role:"+ReflectionToStringBuilder.toString(r));
			}
		}
	}

}
