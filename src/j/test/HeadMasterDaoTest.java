package j.test;


import j.dao.HeadMasterDao;
import j.model.HeadMaster;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HeadMasterDaoTest {
 
	ApplicationContext ctx ;
	HeadMasterDao headMasterDao;
	
	@Before
	public void setUp() throws Exception {
		 ctx = new ClassPathXmlApplicationContext("hello.xml");
		 headMasterDao = (HeadMasterDao)ctx.getBean("headMasterDao");
	}
	
	@Test
	public void testSelectHeadMasterfromheadUserTable(){
	    List<HeadMaster> lists =  headMasterDao.selectHeadMasterfromheadUserTable();
	    for(HeadMaster h:lists){
	    	System.out.println(h.getHname());
	    }
	}

	
	
}
