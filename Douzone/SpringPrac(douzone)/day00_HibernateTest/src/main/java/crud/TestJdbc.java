package crud;

import javax.security.auth.login.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class TestJdbc {
	  public static void main(String[] args) {

	    SessionFactory factory = new org.hibernate.cfg.Configuration()
	        .configure("hibernate.cfg.xml")
	        .addAnnotatedClass(Student.class)
	        .buildSessionFactory();

	    Session session = factory.getCurrentSession();

	    try {
	      Student tempStudent = new Student("Paul", "Wall", "paul@gmail.com");
	      
	      session.beginTransaction();
	      
	      session.save(tempStudent);
	      
	      session.getTransaction().commit();
	      
	    } finally {
	      factory.close();
	    } 
	    
//	    String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=Asia/Seoul";
//	    String user = "hbstudent";
//	    String password = "hbstudent";
	//    
//	    try {
//	      System.out.println("Connecting to Database: " + jdbcUrl);
//	      Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
//	      
//	      System.out.println("connection successful!!!");          
//	      
//	    } catch (Exception e) {
//	      e.printStackTrace();
//	    }    
	  }
	}
