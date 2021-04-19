package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionHelper {
	//필드 선언부

	//연결부
	/*
	 * 다른 클래스에서 아래 코드 구현을 하지 않도록 설계
	 */
	public static Connection getConnection(String dbName) {
		
		Connection conn = null; ResultSet rs = null; 
		PreparedStatement pstmt=  null;	Statement stmt = null;
		
		if(dbName =="oracle") {
			try {
				
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "kingsmile"; //유저유저
				String password = "oracle"; //비번비번
				//선언부 fin.		
				Class.forName(driver);
				conn= DriverManager.getConnection(url, user, password);
				stmt = conn.createStatement();
				System.out.println("오라클 연결 성공.");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				return conn;			
			}
		} else if (dbName.equals("mysql")) {
			try {
				
				String driver = "comm.mysql ~~~~.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "kingsmile"; //유저유저
				String password = "oracle"; //비번비번
				//선언부 fin.		
				Class.forName(driver);
				conn= DriverManager.getConnection(url, user, password);
				stmt = conn.createStatement();
				System.out.println("오라클 연결 성공.");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				return conn;			
			}
		} 
		//연결부 fin
		
		return conn;
	}
	//오버로딩된 메소드: uer, password도 매개변수로 입력 가능하게.
	public static Connection getConnection(String dbName, String user, String password) {
		
		Connection conn = null; ResultSet rs = null; 
		PreparedStatement pstmt=  null;	Statement stmt = null;
		
		if(dbName =="oracle") {
			try {
				
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				//선언부 fin.		
				Class.forName(driver);
				conn= DriverManager.getConnection(url, user, password);
				stmt = conn.createStatement();
				System.out.println("오라클 연결 성공.");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				return conn;			
			}
		} else if (dbName.equals("mysql")) {
			try {
				
				String driver = "comm.mysql ~~~~.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				//선언부 fin.		
				Class.forName(driver);
				conn= DriverManager.getConnection(url, user, password);
				stmt = conn.createStatement();
				System.out.println("오라클 연결 성공.");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				return conn;			
			}
		} 
		//연결부 fin
		
		return conn;
	}
		
	
	

	public ConnectionHelper() {
		// TODO Auto-generated constructor stub
	}

}
