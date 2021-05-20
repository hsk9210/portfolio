package com.test.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	static {
		try {
			//oracle.jdbc.driver.OracleDriver  -- 
			//음... root-context.xml에서 받아올 수도 있기는 한데, 인터넷 소스로 대체한 코드 사용함.
			//책 그대로 하면 오히려 안된다 이런;;
			Class.forName("jdbc:oracle:thin:@localhost:1521:XE");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "book_ex";
		String password = "book_ex";
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			log.info(conn);
			
		} catch (Exception e) {
			// TODO: handle exception
			fail(e.getMessage());
			//e.printStackTrace();
		}
	}
	

}
