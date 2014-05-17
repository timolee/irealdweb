package com.ireald.wp.mapper.test;
import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.ireald.wp.domain.User;
@RunWith(value = SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class UserMapperTest{
   @Resource private com.ireald.wp.mapper.UserMapper userMapper;
   @Test
   public void insertTest(){
	  /*for(int i=0;i<100;i++){
	   User u=new User();
	   u.setUser_id(java.util.UUID.randomUUID().toString().replace("-", ""));
	   u.setLoginid(java.util.UUID.randomUUID().toString().replace("-", ""));
	   this.userMapper.insertSelective(u);
	  }*/
   }
   
 /*  @Test
   public void queryByVoTest(){
	   java.util.List<User> list = this.userMapper.queryByVo(new RowBounds(1, 20), new User());
	   System.out.println("size:"+list.size());
	   for(User u:list){
		   System.out.println(org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(u));
	   }
   }*/
   
}
