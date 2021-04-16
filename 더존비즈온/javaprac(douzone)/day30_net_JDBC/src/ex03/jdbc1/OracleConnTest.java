/*
 * java 의 경우.
 */

package ex03.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnTest {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kingsmile"; //유저유저
		String password = "oracle"; //비번비번
		Connection conn = null; ResultSet rs = null;
		try {
			Class.forName(driver);
			
			System.out.println("jdbc driver 로딩 성공");
			conn= DriverManager.getConnection(url, user, password);
			System.out.println("오라클 연결 성공");
//			Statement stmt = conn.createStatement();
//			stmt.executeQuery("select * from professor");
			// delete from gitt where gno = '나사장';
			String sql = "delete from gift where gno = 11";
			int deletedRowCount = conn.createStatement().executeUpdate(sql);
			if(deletedRowCount>=1) {
				System.out.println("지워진다면(rowDeleted) 이 콘솔문이 나옵니다.");
			}
			
//			int index = 0;
//			int a1[] = new int[100];
//			String a2[] = new String[100];
//			while (rs.next()) {
//				a1[index]= rs.getInt(1);
//				a2[index] = rs.getString(2);				
//				index++;
//			}
//			for(int i=0;i<index;i++) {
//				System.out.println(a1[i] +" "+ a2[i]);
//			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 연결 실패");
		} finally {
			try {
				//rs.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


/*
 * NodeJS의 경우.
 */
/*

const oracledb = require('oracledb');

oracledb.getConnection({
    user: 'user명 입력',
    password: '비밀번호 입력',
    host: 'localhost', 
    database: 'xe'
}, function (err, conn) {
    if(err){
        console.log('접속 실패', err);
        return;
    }
    console.log('접속 성공');
});

*/