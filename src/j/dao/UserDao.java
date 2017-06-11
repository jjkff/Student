package j.dao;

import j.model.User;

import java.util.List;

public interface UserDao {

	public void add(User user);
	public void update(User user);
	public void delete(int id);
//	public void delete_isactive(User user);
	public User queryById(int id);
	public List<User> queryAll();
//	public List<User> queryAll_isactive();
//	public List<User> loadByUsername(String username);
	
//	public User loadByUsername(String username);
	public int getAllRowCount();
	
	public List<User> selectUserfromheadUserTable();
	
	
	
	//ÅúÁ¿²Ù×÷
	public void bacthinsert(List<User> users);
	public void bacthdelete(List<Integer> ids);
	public void batchupdates(List<User> users);
	
	
	
}
