package com.test.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.test.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//java RootConfig 설정 사용의 경우에는...
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class DataSourceTests {
	@Setter(onMethod_ = {@Autowired})
	private DataSource dataSource;
//	@Setter(onMethod_ = {@Autowired})
//	private SqlSessionFactory sqlSessionFactory;
	@Test
	public void testConnection() {
		try {
			Connection conn = dataSource.getConnection();
			log.info(conn);
			
		} catch (Exception e) {
			// TODO: handle exception
			fail(e.getMessage());
		}
	}
//	@Test
//	public void testMyBatis() {
//		try {
//			SqlSession session = sqlSessionFactory.openSession();
//			Connection conn = session.getConnection();
//			log.info(conn);
//			log.info("-----------");
//			log.info(session);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			fail(e.getMessage());
//		}
//	}
}
