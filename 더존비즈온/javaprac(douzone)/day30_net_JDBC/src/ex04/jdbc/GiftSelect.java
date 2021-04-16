package ex04.jdbc;

import java.sql.*;

public class GiftSelect {
	public static void main(String[] args) 
			throws ClassNotFoundException,  SQLException {
		Class.forName("oracle.jdbc.OracleDriver");  // ClassNotFoundException
		//2. Connection & Open
						 //driver:@IP:portNumber:SID(or ���������ͺ��̽���)
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "kingsmile";
		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url, uid, pwd);  
		//3. ���( DML - Select  )
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");   // ctrl + shift + x
		System.out.println("��ǰ��ȣ\t ��ǰ��\t ������\t �ְ�");
		
		while( rs.next() ) {
			int gno = rs.getInt(1);   // int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}
		//4. �ڿ���ȯ( �ݱ� )
		rs.close();		stmt.close();		conn.close();
	}
}







