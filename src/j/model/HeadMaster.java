package j.model;

import java.util.List;

public class HeadMaster {

	public HeadMaster(){}

	private int hid ;
	private String hname;
	private String isactive;
	private String pass;
	
	private List<HeadUser> headUsers;
	
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
  
	public List<HeadUser> getHeadUsers() {
		return headUsers;
	}
	public void setHeadUsers(List<HeadUser> headUsers) {
		this.headUsers = headUsers;
	}

}
