package j.test;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


import j.dao.UserDao;

import j.model.User;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
	ApplicationContext ctx ;
	UserDao ud;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("hello.xml");
		ud =	(UserDao) ctx.getBean("userDao");
	}
	
	@Test
	public void testAdd(){
		User user = new User();
		user.setUsername("xx");
		user.setPassword("xx");
		ud.add(user);	
	}
	@Test
	public void testQueryAll(){
		List<User> users = ud.queryAll();
		System.out.println(ud);
		int i =	users.size();
		System.out.println(i);
	}

	@Test
	public void testQueryById(){
		User user = ud.queryById(1);
		System.out.println(user);
	}
	
	@Test
	public void testUpdate(){
		User user = new User();
		user.setId(53);
		user.setUsername("jjjajsjs");
		user.setPassword("1121211");
		user.setIsactive("1");
		ud.update(user);
	}
	@Test
	public void testDelete(){
		ud.delete(61);
	}

	@Test
	public void testBatchInsert(){
		User u1 = new User();
		u1.setUsername("������");
		User u2 = new User();
		u2.setUsername("�����");
		List<User> users = new ArrayList<User>();
		users.add(u1);
		users.add(u2);
		ud.bacthinsert(users);	
	}
	@Test
	public void testBatchDelete(){
		int id1 = 60;
		int id2 = 62;
		int id3 = 63;
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(id1);ids.add(id2);ids.add(id3);
		ud.bacthdelete(ids);
	}
	
	@Test
	public void testBatchUpdate(){

		User user2 = new User();
		user2.setId(70);
		user2.setUsername("aeeee");
		
		User user = new User();
		user.setId(71);
		user.setUsername("axsx");
		
		List<User> users =  new ArrayList<User>();
		users.add(user);
		users.add(user2);
		ud.batchupdates(users);
		
	}
	@Test
	public void testBatchUpdates(){
		 List<User> users=new ArrayList<User>();  
	        	User u=new User();  
	        	u.setUsername("admin");  
	        	u.setId(51);  
	        	
	        	User u2 = new User();
	        	u2.setId(52);
	        	u2.setUsername("admin2");
	        	users.add(u);  
	            users.add(u2);
	     ud.batchupdates(users);  
	    
	}
	
	@Test
	public void testgetAllRowCount(){
	   System.out.println(ud.getAllRowCount());	
	}
	
	@Test 
	public void testSelectUserfromheadUserTable(){
	   List<User> users = ud.selectUserfromheadUserTable();
	   System.out.println();
	   for(User user:users){
		   System.out.println(user.getNickname());
	   }
	   
	}
}
