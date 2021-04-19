package dbConn.util;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GOGAKInsert {

	public GOGAKInsert() {
		// TODO Auto-generated constructor stub
	}

	public static void insert() throws SQLException, UnsupportedEncodingException {
		String gno, gname, jumin, point; gno=gname=jumin=point=null;
		String modeDept;
		int numjob=0, num = 0;
		Scanner sc = new Scanner(System.in);
		String sql = "";
		
		Connection conn = new ConnectionHelper().getConnection("oracle","kingsmile","oracle");
		conn.setAutoCommit(false); //자동 commit 끄기. 이미 main에서 꺼진 상태이지만...
		Statement stmt = conn.createStatement();
		 PreparedStatement pstmt = null; ResultSet rs=null;
		
		System.out.println("gno: "); gno= sc.next();
		System.out.println("gname: "); gname= sc.next();
		System.out.println("jumin: "); jumin= sc.next();
		System.out.println("point:  "); point = sc.next();
//		sql= "insert into gogak values('"+gno+"', '" 
//				+ new String(gname.getBytes("utf-8"), "utf-8") +"','"
//				+ new String(jumin.getBytes("utf-8"), "utf-8") +"','"
//				+ new String(point.getBytes("utf-8"), "utf-8") +"'"
//				+ ")";
		sql= "insert into gogak values('"+gno+"', '" 
				+ gname +"','"
				+ jumin +"','"
				+ point +"'"
				+ ")";
		stmt.executeQuery(sql);
		conn.commit(); //autoCommit이 꺼졌을 때 커밋. 중요.
		System.out.println(gname+" 추가.");
		
		
	}
	
	
	///////////////

}
