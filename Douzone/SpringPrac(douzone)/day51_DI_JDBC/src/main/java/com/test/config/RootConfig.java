package com.test.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/*
 * rootx-context.xml에서
 * hikaricp connection pool 설정을 잡는게 코딩노가다라
 * 여기에 추가하는 쪽으로 방법 선회함. 
 */

@Configuration
@ComponentScan(basePackages = {"org.zerock.sample"})
public class RootConfig {
	// https://github.com/brettwooldridge/HikariCP#rocket-initialization
	@Bean
	public javax.sql.DataSource dataSource() {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");
		config.setUsername("book_ex");
		config.setPassword("book_ex");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		HikariDataSource ds = new HikariDataSource(config);
		
		return ds;
	}
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception{
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		return  ((SqlSessionFactoryBean) sqlSessionFactory()).getObject();
	}
	
	
}
