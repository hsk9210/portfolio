package ex04.jdbc;

import java.sql.*;
import java.util.Scanner;

public class GiftUpdate {
	public static void main(String[] args) 
			throws ClassNotFoundException,  SQLException {
		Class.forName("oracle.jdbc.OracleDriver");  
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "kingsmile";		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url, uid, pwd);  
		
		//3. Select
		Statement stmt = conn.createStatement();
		PreparedStatement pstmt = null;   ////////////////////// delete from  gift where gno = ? ;   setXXX(����, ������);
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");   // ctrl + shift + x
		System.out.println("��ǰ��ȣ\t ��ǰ��\t ������\t �ְ�");
		
		while( rs.next() ) {
			int gno = rs.getInt(1);   // int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}
		//3. ���( DML - Update  ) ////////// ���ڵ� ������Ʈ /////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		System.out.println("\n��Ͽ��� Update �� ��ȣ ? ");
		int num = sc.nextInt();
		System.out.println("������ ��ǰ�� ? ");
		String name = sc.next();
		//pstmt = conn.prepareStatement("update gift set gname= ? where gno =  " + num);
		pstmt = conn.prepareStatement("update gift set gname= ? where gno =  ? ");
		pstmt.setString(1, name);    // pstmt.setString(1, "���ڷ�"); 
		pstmt.setInt(2, num);
		pstmt.executeUpdate();   
		System.out.println(name + " ���� �Ϸ��!!");
		
		//g_end ���� �����ϱ�
		System.out.println("��������, �ְ��� �� �ٲٽðڽ��ϱ�? ��....? ");
		int g_ss = sc.nextInt();
		int g_ee = sc.nextInt();
		pstmt = conn.prepareStatement("update gift set g_start = ?, g_end = ?, gname = ? where gno = ?" );
		pstmt.setInt(1, g_ss);
		pstmt.setInt(2, g_ee);
		pstmt.setString(3, "kingsmile");
		pstmt.setInt(4, 7);
		pstmt.executeUpdate();   
		System.out.println(7 + "�� ���� �Ϸ��!!");
		
		/////////////////////////////////////////////////////////////
		rs = stmt.executeQuery("SELECT * FROM GIFT");   
		System.out.println("��ǰ��ȣ\t ��ǰ��\t ������\t �ְ�");
		
		while( rs.next() ) {
			int gno = rs.getInt(1);   // int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}
		
		//4. �ڿ���ȯ( �ݱ� )
		stmt.close();		conn.close();
	}
}







