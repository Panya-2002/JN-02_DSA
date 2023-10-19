package com.singleinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeManagerTest {

	public static void main(String[] args) {
		try
		{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
				
		Employee e1=new Employee();
		e1.setEmpid(202);
		e1.setName("Neha");
		e1.setSalary(32000);
		em.getTransaction().begin();
		em.persist(e1);
		em.getTransaction().commit();
		System.out.println("Employee record added....");
	
		Manager m1=new Manager();
		m1.setEmpid(200);
		m1.setName("Neetu");
		m1.setSalary(78000);
		m1.setDeptname("Purchase");
		em.getTransaction().begin();
		em.persist(m1);
		em.getTransaction().commit();
		System.out.println("Manager record added....");
		}
		catch(Exception e)
		{
			System.out.println("Error..."+e.getMessage());
		}
	}

}
