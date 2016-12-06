package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


//此处仍然需要更改，添加功能。	


public class Addwebs extends ActionSupport{
	private String userurl;
	private Object username;
	public String execute() throws Exception {	
		
		String url = "jdbc:mysql://127.0.0.1:3306/test_user";
		String dbuser="root";
		String password="";
		ActionContext actionContext = ActionContext.getContext();
        java.util.Map<String, Object> session = actionContext.getSession();
        username=session.get("UserID");
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
			sql = "update tbl_user set webs='"+getUserurl()+"^' where username='"+username+"'";
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
			System.out.println("网页添加成功");
            stmt.close();
            conn.close();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
            System.out.println("连接失败!");
			e.printStackTrace();
		}
		return "addsuccess";
	}
	public String getUserurl() {
		return userurl;
	}
	public void setUserurl(String userurl) {
		this.userurl = userurl;
	}

}
