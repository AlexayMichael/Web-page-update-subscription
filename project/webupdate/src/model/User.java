package model;

//暂定存储这些数据。

public class User {
	private String usename;
	private String passwords;
	private String subtime;
	private String email;
	private String phone;
	private String webs;
	private String interests;
	
	
	public User(String usename, String passwords, String subtime, String email, String phone, String webs,
			String interests) {
		super();
		this.usename = usename;
		this.passwords = passwords;
		this.subtime = subtime;
		this.email = email;
		this.phone = phone;
		this.webs = webs;
		this.interests = interests;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getPasswords() {
		return passwords;
	}
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	public String getSubtime() {
		return subtime;
	}
	public void setSubtime(String subtime) {
		this.subtime = subtime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebs() {
		return webs;
	}
	public void setWebs(String webs) {
		this.webs = webs;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	
}
