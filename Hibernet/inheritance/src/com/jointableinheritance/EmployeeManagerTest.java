package com.jointableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeManagerTest {

	public static void main(String[] args) 
	{
		try
		{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		Emp e1=new Emp();
		e1.setEmpid(104);
		e1.setName("Amit");
		e1.setSalary(45000);
		em.getTransaction().begin();
		em.persist(e1);
		em.getTransaction().commit();
		System.out.println("Employee record added....");
		
		Mgr m1=new Mgr();
		m1.setEmpid(108);
		m1.setName("Priya");
		m1.setSalary(80000);
		m1.setDeptname("Computer");
		em.getTransaction().begin();
		em.persist(m1);
		em.getTransaction().commit();
		System.out.println("Manager record added....");
		}
		catch(Exception e)
		{
			System.out.println("Error.."+e.getMessage());
		}

	}

}
