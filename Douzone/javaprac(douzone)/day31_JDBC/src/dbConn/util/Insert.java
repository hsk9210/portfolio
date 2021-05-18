package dbConn.util;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class Insert {

	public Insert() {
		// TODO Auto-generated constructor stub
	}
	
	public static void insert() throws SQLException, UnsupportedEncodingException {
		String dcode, dname, pdept, area; dcode=dname=pdept=area=null;
		String modeDept;
		int numjob=0, num = 0;
		Scanner sc = new Scanner(System.in);
		String sql = "";
		
		Connection conn = new ConnectionHelper().getConnection("oracle","kingsmile","oracle");
		conn.setAutoCommit(false); //자동 commit 끄기. 이미 main에서 꺼진 상태이지만...
		Statement stmt = conn.createStatement();
		 PreparedStatement pstmt = null; ResultSet rs=null;
		
		System.out.println("DCODE: "); dcode= sc.next();
		System.out.println("DNAME: "); dname= sc.next();
		System.out.println("PDEPT: "); pdept= sc.next();
		System.out.println("AREA:  "); area = sc.next();
//		sql= "insert into dept2 values('"+dcode+"', '" 
//				+ new String(dname.getBytes("utf-8"), "utf-8") +"','"
//				+ new String(pdept.getBytes("utf-8"), "utf-8") +"','"
//				+ new String(area.getBytes("utf-8"), "utf-8") +"'"
//				+ ")";
		sql= "insert into dept2 values('"+dcode+"', '" 
				+ dname +"','"
				+ pdept +"','"
				+ area +"'"
				+ ")";
		stmt.executeQuery(sql);
		conn.commit(); //autoCommit이 꺼졌을 때 커밋. 중요.
		System.out.println(dname+" 추가.");
		
		
	}
	
	
	///////////////
	
	
	
	
	

}
