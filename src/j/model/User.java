package j.model;

import java.util.List;

public class User {
	public User(){}

	private int id;
	private String username;
	private String password;
	private String email;
	private String nickname;
	private String isactive;
	
	//中间表：一对多的关系
	private List<HeadUser> headUsers;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

    public List<HeadUser> getHeadUsers() {
		return headUsers;
	}
    public void setHeadUsers(List<HeadUser> headUsers) {
		this.headUsers = headUsers;
	}

}
