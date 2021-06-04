package com.hsk9210.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hsk9210.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@ContextConfiguration(classes = RootConfig.class)
@Log4j
public class DataSourceTests {
	//@Setter(onMethod_ = {@Autowired})
	@Inject
	private DataSource dataSource;
	
	//@Setter(onMethod_ = {@Autowired})
	//@Inject
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testConnection() {
		try(Connection conn = dataSource.getConnection()) {
			
			log.info(conn);
			System.out.println("JDBC 연결 성공적.");
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			fail(e.getMessage());
		}
	}
	
	
	@Test
	public void testMybatisConn() {
		try {
			SqlSession session = sqlSessionFactory.openSession();
			Connection conn = session.getConnection();
			log.info(session);
			log.info(conn);
			conn.close();
			session.close();
			System.out.println("MyBatis 연결 성공적 2");
		} catch (Exception e) {
			// TODO: handle exception
			fail(e.getMessage());
		}
	}
	
	
	

}
