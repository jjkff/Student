package j.service;

import java.util.List;

import j.model.User;

public interface UserService {

	 public void addUser(User user);
	 public List<User> queryAll();
	 public User queryById(int id);
	 public void updateUser(User user);
	 public void delete(int id);
	
}
