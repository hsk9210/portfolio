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

public class GOGAKSelect {

	public GOGAKSelect() {
		// TODO Auto-generated constructor stub
	}

	public static void printdata(ResultSet rs) {
		int num = 1;
		try {
			ResultSetMetaData rsmd = null;//table info get interface
			//resultset metadate structure get
			//metadata := attribute info
			rsmd  = rs.getMetaData();
			
			int colCount = rsmd.getColumnCount();//number of column
			
			System.out.println("SEQ \t gno \t gname \t jumin \t point");
			
			while (rs.next()) {
				System.out.print(num+" 번  ");
				num++;
				for(int i=1;i<=colCount;i++) {
					switch (rsmd.getColumnType(i)) {
					
					case Types.NUMERIC:
						System.out.print(rsmd.getColumnName(i)+" : "+rs.getInt(i)+" ");
						break;
					case Types.INTEGER:
						System.out.print(rsmd.getColumnName(i)+" : "+rs.getInt(i)+" ");
						break;
					case Types.VARCHAR:
						System.out.print(rsmd.getColumnName(i)+" : "+rs.getString(i)+" ");
						break;
					case Types.FLOAT:
						System.out.print(rsmd.getColumnName(i)+" : "+rs.getFloat(i)+" ");
						break;
					case Types.CHAR:
						System.out.print(rsmd.getColumnName(i)+" : "+rs.getString(i)+" ");
						break;
											

					default:
						System.out.print(rsmd.getColumnName(i)+" : "+rs.getType()+" ");
						if(rs.getType()==0) {
							System.out.print(" ");
						}
						break;
					}
					
				}
				System.out.println();
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) throws SQLException, UnsupportedEncodingException {
		// TODO gno number, ganme varchar, jumin char, point number
		String gno, gname, jumin, point; gno=gname=jumin=point=null;
		String modeDept;
		int numjob=0, num = 0;
		Scanner sc = new Scanner(System.in);
		String sql = "";
		
		Connection conn = new ConnectionHelper().getConnection("oracle","kingsmile","oracle");
		conn.setAutoCommit(false); //자동 commit 끄기
		Statement stmt = conn.createStatement();
		ResultSet rs = null; PreparedStatement pstmt = null;
		while (true) {
			System.out.println("원하는 기능 선택: ");
			System.out.println("GOGAK 1.select, 2.insert, 3.update, 4.delete, 5.rollback 6.connection close -by oracleDB");
			numjob = sc.nextInt();
			
			switch (numjob) {
			case 1:
				rs = stmt.executeQuery("select * from GOGAK order by gno");
				printdata(rs);				
				break;
			case 2: //insert를 떼어내서 클래스 메소드로 만든다면?
				GOGAKInsert gogakinsert= new GOGAKInsert();
				gogakinsert.insert(); //이안에 키보드 scan부터 commit까지 이동.
				break;
			case 3: //update
				rs = stmt.executeQuery("select * from GOGAK");
				printdata(rs);
				System.out.println("update대상 gno?: ");
				gno = sc.next();
				System.out.println("수정할 gname?: ");
				gname = sc.next();
				sql = "update GOGAK set gname=? where gno = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, gname);
				pstmt.setString(2, gno);
				pstmt.executeUpdate();
				conn.commit();
				System.out.println(gno+" 정보 변경.");
				
				break;
			case 4: //delete
				rs = stmt.executeQuery("select * from GOGAK");
				printdata(rs);
				System.out.println("삭제할 gno?: ");
				gno =sc.next();
				sql = "delete from GOGAK where gno = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, gno);
				pstmt.executeUpdate();
				conn.commit();
				System.out.println(gno+" 에 해당 데이터 삭제.");
										
				break;
			
			case 5:
				conn.rollback();
				System.out.println("롤백 수행.");
				break;
			case 6:
				ConnectionCloseHelper.close(conn);
				ConnectionCloseHelper.close(pstmt);
				ConnectionCloseHelper.close(stmt);
				ConnectionCloseHelper.close(rs);
				break;
			

			default:
				System.out.println("이외의 입력시 종료됩니다.");
				System.exit(0);
				break;
			}
		}
		
		
		
		
	}

}
