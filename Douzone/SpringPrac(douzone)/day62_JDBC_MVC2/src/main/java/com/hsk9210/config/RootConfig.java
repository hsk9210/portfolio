package com.hsk9210.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = {"com.hsk9210.config"})
@MapperScan(basePackages = {"com.hsk9210.mapper"})
//@ComponentScan(basePackages = {"com.hsk9210.controller"}) //Servletconfig.java에 있다
public class RootConfig {
	String driverClassName= "oracle.jdbc.OracleDriver";
	String jdbcUrl= "jdbc:oracle:thin:@localhost:1521:xe";
	String username= "kingsmile";
	String password= "oracle";
	
	String jdbcUrl2="jdbc:log4jdbc:oracle:thin:@localhost:1521:xe";
	
	@Bean
	public DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		//hikariConfig.setDriverClassName(driverClassName);
		//hikariConfig.setJdbcUrl(jdbcUrl);
		hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		hikariConfig.setJdbcUrl(jdbcUrl2);
		hikariConfig.setUsername(username);
		hikariConfig.setPassword(password);
		
		HikariDataSource dataSource = new HikariDataSource(hikariConfig);
		
		return dataSource;
	}
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		DataSource dataSource = dataSource();
		sqlSessionFactory.setDataSource(dataSource);
		return sqlSessionFactory.getObject();
		
	}
	

}
