package action;
import model.User;
import java.sql.*;
import com.opensymphony.xwork2.ActionSupport;
public class AddUser extends ActionSupport{
	private String user;
	private String pass;
	private String subtime;
	private String email;
	private String phone;
	private String webs;
	private String interests;
	private int warring=0;
	public String execute() throws Exception {	
		String url = "jdbc:mysql://127.0.0.1:3306/test_user";
		String dbuser="root";
		String password="";
		User newUser = new User(user,pass,subtime,email,phone,null,null);
		try {
			Class.forName("com.mysql.jdbc.Driver");
            System.out.println("初始化完成");
			String sql;
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			System.out.println("开始连接数据库");
			conn = DriverManager.getConnection(url,dbuser,password);
            System.out.println("链接完成");
			sql = "select * from tbl_user where username=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, newUser.getUsename());
			rs = stmt.executeQuery();
			if(rs.next())
			{
				warring=1;
				System.out.println("用户名重复");
				return "error";
			}
			sql = "select * from tbl_user where email=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, newUser.getEmail());
			rs = stmt.executeQuery();
			if(rs.next())
			{
				warring=2;
				System.out.println("邮箱已经注册过");
				return "emailerror";
			}
			sql = "select * from tbl_user where phone=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, newUser.getPhone());
			rs = stmt.executeQuery();
			if(rs.next())
			{
				warring=3;
				System.out.println("手机已经注册过");
				return "phoneerror";
			}
			sql = "INSERT INTO tbl_user(username, passwords, subtime, email, phone,webs,interests) VALUES (?,?,?,?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, newUser.getUsename());
			stmt.setString(2, newUser.getPasswords());
			stmt.setString(3, newUser.getSubtime());
			stmt.setString(4, newUser.getEmail());
			stmt.setString(5, newUser.getPhone());
			stmt.setString(6, null);
			stmt.setString(7, null);
			stmt.executeUpdate();
			
            rs.close();
            stmt.close();
            conn.close();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
            System.out.println("连接失败!");
			e.printStackTrace();
		}
		return "success";
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
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
	public int getWarring() {
		return warring;
	}
	public void setWarring(int warring) {
		this.warring = warring;
	}

	

	
	

}
