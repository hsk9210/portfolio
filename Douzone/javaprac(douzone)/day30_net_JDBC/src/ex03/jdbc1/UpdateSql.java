package ex03.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateSql {

	public UpdateSql() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kingsmile"; //유저유저
		String password = "oracle"; //비번비번
		Connection conn = null; ResultSet rs = null; PreparedStatement pstmt=  null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			
			System.out.println("jdbc driver 로딩 성공");
			conn= DriverManager.getConnection(url, user, password);
			System.out.println("오라클 연결 성공");
			
			
			System.out.println("목록에서 update할 번호: ");
			int num = new Scanner(System.in).nextInt();
			System.out.println("변경할 상품명 gname?: ");
			String name = new Scanner(System.in).nextLine();
			
			String sql = "update gift set gname=? where gno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name); pstmt.setInt(2, num);
			int updatedRows = pstmt.executeUpdate();
 
			System.out.println("커밋된 행: "+updatedRows);
			
			rs = stmt.executeQuery("select * from gift");
			//System.out.println(rs.get);
			

			

			
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 연결 실패");
		} finally {
			try {
				//rs.close();
				//pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
