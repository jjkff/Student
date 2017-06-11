package j.dao;

import java.util.List;

import j.model.User;




import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	public void add(User user) {
		SqlSession sqlSession =	this.getSqlSession();
		sqlSession.insert("j.dao.UserDao.add", user);	
	}

	public List<User> queryAll() {
		List<User> users = this.getSqlSession().selectList("j.dao.UserDao.queryAll");
		return users;
	}

	public void delete(int id) {
		this.getSqlSession().delete("j.dao.UserDao.delete",id);

	}
	
	

	

	public User queryById(int id) {
		return this.getSqlSession().selectOne("j.dao.UserDao.queryById", id);
	}

	public void update(User user) {
	  this.getSqlSession().update("j.dao.UserDao.update", user);
	}
	
	//关联查询： 一对多
	public List<User> selectUserfromheadUserTable(){
	   return this.getSqlSession().selectList("j.dao.UserDao.selectUserfromheadUserTable");
	}
	
	
	public void bacthinsert(List<User> users){
	  this.getSqlSession().insert("j.dao.UserDao.bacthinsert", users);
	}
	
	public void bacthdelete(List<Integer> ids){
	  this.getSqlSession().delete("j.dao.UserDao.batchdelete", ids);
	}
	
	public void batchupdates(List<User> users){
	  this.getSqlSession().delete("j.dao.UserDao.batchupdatess", users);
	}
	
	public int getAllRowCount(){
	  return  this.getSqlSession().selectOne("j.dao.UserDao.getAllRowCount");
	}

	
}
