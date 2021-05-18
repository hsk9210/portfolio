package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainEntry {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url,uid,pwd; url=uid=pwd=null;
		Connection conn = null;
		Statement stmt = null;
		
		try {
			url = "jdbc:oracle:thin:@localhost:1521:xe";
			uid = "kingsmile";
			pwd = "oracle";
			
			conn = DriverManager.getConnection(url, uid, pwd);
			stmt = conn.createStatement();
			String sql = "create table busanIT("
					+ "name varchar2(20),"
					+ "age number"
					+ ")";
			System.out.println(sql.toString());
			stmt.executeQuery("drop table busanIT");
			ResultSet rs= stmt.executeQuery(sql);
			
//			while (rs.next()) {
//				System.out.println("name: "+rs.getString(1));
//				System.out.println("age: "+rs.getInt(2));
//			}
			stmt.executeQuery("insert into busanIT values('aa',4)");
			ResultSet rs2 = stmt.executeQuery("select * from busanIT");
			while (rs2.next()) {
				System.out.println("name: "+rs2.getString("name"));
			}
			
			stmt.close();
			conn.close();			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			
		}

	}

}
