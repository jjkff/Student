package j.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybaitisUtil {

	private static SqlSessionFactory factory;
	
	static{
		
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			
			factory = new SqlSessionFactoryBuilder().build(is);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	//获得SQLSession
	public static SqlSession getSQLSession(){
	   return factory.openSession();
	}
	//使用完关闭SQLSession
	public static void closeSQlSession(SqlSession session){
		if(session!=null)session.close();
	}
	
}
