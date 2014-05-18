package com.ireald.wp.service.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ireald.wp.domain.Premission;
import com.ireald.wp.service.PremissionService;
@RunWith(value = SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class PremissionServiceTest {
	@Resource PremissionService premissionService;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUpdatePremission() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddPremission() {
		//fail("Not yet implemented");
		/*Premission premission=new Premission();
		premission.setPermisson_id(java.util.UUID.randomUUID().toString().replace("-", ""));
		premission.setDescription("*");
		premission.setPermisson("*");
	    premission.setName("所有");
	    premission.setIs_show(true);
	    premissionService.add(premission);*/
	}
	
	@Test
	public void testAssoRoleToPremission(){
	  /* String roleId="df4bc9a6e78c4c18bf346a9954b79c1d";
	   String premissionId="13708a9b7d6f4f8bb39941d175d483bc";
	   premissionService.assoRoleToPremission(roleId, premissionId);*/
	}
	
	@Test
	public void testFindWithResourceById(){
		String premissionId="43679ca6a35041a9a0c4e0b4be6fc9a4";
		Premission p=premissionService.findWithResourceById(premissionId);
		assertNotNull(p);
		for(com.ireald.wp.domain.Resource r:p.getResources()){
			System.out.println(ReflectionToStringBuilder.toString(r));
		}
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
	public void testFindByPagePageOfPremission() {
		fail("Not yet implemented");
	}

}
