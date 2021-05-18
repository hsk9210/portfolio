package ex04.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainEntry {
	//필드 선언부
	Connection conn = null; ResultSet rs = null; 
	PreparedStatement pstmt=  null;	Statement stmt = null;
	//연결부
	private Connection oracle11g() {
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
	} //연결부 fin
	
	///////////////////////// 만들어서 붙이기.
	private void update() {}
	
	private void delete() {}
	////////////////////////
	
	public static void main(String[] args) {
		MainEntry self = new MainEntry();
			//4가지 선택지를 콘솔창에 제시.
			System.out.print("insert num: 1.select 2.update 3.insert 4.delete \n num?: ");
			Scanner input = new Scanner(System.in);
			int sel = input.nextInt();
			
			//선택한 번호에 따라 4가지로 분기점.
			switch (sel) {
			case 1: //select문
				self.select();

				break; //select fin.
				
			case 2: //update
				//만들기
				break;
			
			case 3: //insert
				self.insert();
				break;
				
			case 4: //delete
				//만들기
				break;
				

			default:
				System.out.println("wrong input. exit.");
				break;
			}

	}
	
	
	private void select() {
		Scanner input = new Scanner(System.in);
		System.out.println("gift 테이블에서 찾을 품목 이름은 ?: ");
		String gname = input.next(); //입력부
		String sql = "select * from gift where gname = ?";
		try {
			Connection conn = oracle11g();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gname);
			rs = pstmt.executeQuery();
			//출력부.
			while(rs.next()){     
				
				String col1 = rs.getString("gno");
				String col2 = rs.getString("gname");
				String col3 = rs.getString("g_start");
				String col4 = rs.getString("g_end");

			System.out.println(col1 + "\t" +col2 + "\t" +col3 + "\t" +col4 + "\t");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	private void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n목록에서 Update할 번호 입력 : ");
		int n = sc.nextInt();
		System.out.println("변경할 상품명 입력 : ");
		String name = sc.next();
		try {
			Connection conn = oracle11g();
			pstmt = conn.prepareStatement("update gift set gname = ? where gno = ?");
			// setXXX(문장에서 ?의 순서, 실제데이터); 
			pstmt.setString(1, name); 
			pstmt.setInt(2, n);
			pstmt.executeUpdate();
			System.out.println(name + "(으)로 수정 완료됨");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	
		

}
