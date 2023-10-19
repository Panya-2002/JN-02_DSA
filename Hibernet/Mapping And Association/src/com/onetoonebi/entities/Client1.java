package com.onetoonebi.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Client1 {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		  Student1 s1 = new Student1("Nikita","7876788671"); 
		  Address1 a1 = new Address1();
		  a1.setStreet("MG Road"); 
		  a1.setCity("Nagpur");
		  a1.setState("Maharashtra"); 
		  a1.setZipCode("410015");
		  s1.setAddress(a1);
		  a1.setStudent(s1);
		  //inject address into student s1.setAddress(homeAddress);
		  
		  //persist only student, no need to persist Address explicitly em.persist(s1);
		 
		
		 
		  em.persist(s1); em.getTransaction().commit();
		  System.out.println("Added one student with address to database.");
		
		 
		
		
	
		em.close();
		factory.close();
	}
}
