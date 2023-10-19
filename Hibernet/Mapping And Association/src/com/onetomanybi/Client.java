package com.onetomanybi;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Department d1=new Department();
		d1.setDeptId(101);
		d1.setDeptName("Sales");
		
		Employee e1=new Employee();
		e1.setEmpId(1);
		e1.setEmpName("Vishal");
		e1.setDepartment(d1);
		
		Employee e2=new Employee();
		e2.setEmpId(2);
		e2.setEmpName("Dhruv");
		e2.setDepartment(d1);
		
		Employee e3=new Employee();
		e3.setEmpId(3);
		e3.setEmpName("Ankit");
		e3.setDepartment(d1);
		
		Set<Employee> s1=new HashSet<Employee>();
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		
		d1.setEmployees(s1);
		
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(d1);
		
		em.getTransaction().commit();
		System.out.println("Employee and Department record added...");
	
	}

}
