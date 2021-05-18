package ex04.jdbc;

import java.sql.*;

public class GiftInsert {
	public static void main(String[] args) 
			throws ClassNotFoundException,  SQLException {
		Class.forName("oracle.jdbc.OracleDriver");  
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "kingsmile";		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url, uid, pwd);  
		//3. ���( DML - Insert  )
		Statement stmt = conn.createStatement();
		//insert into gift values(13, '����2', 3000, 9000);
		//String sql = "insert into gift values(14, '����3', 2000, 5000) ";
		String sql = 
				"insert into gift values(" + args[0] + ", ' " + args[1] + " ', " + args[2] + ", " + args[3] +" ) ";
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result + " ������ �߰� ������");
	
		//4. �ڿ���ȯ( �ݱ� )
		stmt.close();		conn.close();
	}
}







