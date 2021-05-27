package com.boraji.tutorial.spring;

import java.util.Arrays;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class MainEntryOfHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//		Session session = sessionFactory.openSession();
//
//		session.beginTransaction();
//		
//		//테스트 용도로 조인 없이 개별 조회 ㄱㄱ
//		Query q = session.createQuery("select emp_name from Employee");
		
		/*
		Query query = entityManager.createQuery(
			"select p " +
			"from Person p " +
			"where p.name like :name" )
		.setParameter( "name", "J%" );
		*/
		/*//유동적으로 파리미터 조절이 가능. 어플리케이션 단위 조절이라 매핑보다 기능 추가 범위가 넒어짐.
		q.setParameter(param, value);
		q.setParameter(param, value);
		q.setParameter(param, value);
		q.setParameter(param, value);
		*/
//		System.out.println(q.executeUpdate());

		// Select all records at table of Employee
//		Query query = session.createQuery("FROM Employee");
//
//		List<Employee> empList = query.list();
//
//		for (Employee emp: empList) {
//			System.out.println(emp);
//		}

		// Select specific record at table of Employee
//		query = session.createQuery("FROM Employee WHERE empId = :id");
//		query.setParameter("id", 1);
//		Employee employee = (Employee) query.uniqueResult();
//		System.out.println(employee);

		// Inner join between Employee and Address
//		query = session.createQuery("select e.empName, a.city, a.addressLine1 from Employee e INNER JOIN e.address a");
//		List<Object[]> addrList = query.list();
//		for (Object[] arr: addrList) {
//			System.out.println(Arrays.toString(arr));
//		}

//		session.getTransaction().commit();

//		HibernateUtil.getSessionFactory().close();
	}

}
