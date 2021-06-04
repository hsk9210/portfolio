package com.hsk9210.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;


@Log4j
public class JDBCTests {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void testConnection() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "book_ex", "book_ex");
			log.info(conn);
			System.out.println("위에 연결된 커넥션 객체가 나오면 성공");
		} catch (Exception e) {
			// TODO: handle exception
			fail(e.getMessage());
			//e.printStackTrace();
			
		}
	}

}
