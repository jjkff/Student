package j.service;



import java.util.List;

import javax.annotation.Resource;


import j.dao.UserDao;

import j.model.User;



import org.springframework.stereotype.Service;
@Service("userService")
public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public void addUser(User user) {
		userDao.add(user);		
	}
	
	public List<User> queryAll(){
		return userDao.queryAll();
	}
	
	public User queryById(int id){
		return userDao.queryById(id);
	}
	
	public void updateUser(User user){
		 userDao.update(user);
	}
	
	public void delete(int id){
		 userDao.delete(id);
	}

}
