package dbConn.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionCloseHelper {
	
	public static void close(Connection conn) {
		if( conn!=  null) {
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public static void close(Statement stmt) {
		if( stmt!=  null) {
			try {
				stmt.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public static void close(PreparedStatement pstmt) {
		if( pstmt!=  null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public static void close(ResultSet rs) {
		if( rs!=  null) {
			try {
				rs.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	

	public ConnectionCloseHelper() {
		// TODO Auto-generated constructor stub
	}

}
