package action;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.javafx.collections.MappingChange.Map;
public class Signin extends ActionSupport{
	private String signuser;
	private String signpass;
	public String execute() throws Exception {	
		String url = "jdbc:mysql://127.0.0.1:3306/test_user";
		String dbuser="root";
		String password="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
            System.out.println("��ʼ�����");
			String sql;
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			System.out.println("��ʼ�������ݿ�");
			conn = DriverManager.getConnection(url,dbuser,password);
            System.out.println("�������");
			sql = "select * from tbl_user where username='"+getSignuser()+"' and passwords='"+getSignpass()+"'";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			if(rs.next())
			{
				ActionContext actionContext = ActionContext.getContext();
		        java.util.Map<String, Object> session = actionContext.getSession();
		        session.put("UserID", "signuser");
				System.out.println("��¼�ɹ�");
				return "loginin";
			}
            rs.close();
            stmt.close();
            conn.close();
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
            System.out.println("����ʧ��!");
			e.printStackTrace();
		}
		System.out.println("��¼ʧ��");
		return "loginerror";
	}
	public String getSignuser() {
		return signuser;
	}
	public void setSignuser(String signuser) {
		this.signuser = signuser;
	}
	public String getSignpass() {
		return signpass;
	}
	public void setSignpass(String signpass) {
		this.signpass = signpass;
	}
	
	
}
