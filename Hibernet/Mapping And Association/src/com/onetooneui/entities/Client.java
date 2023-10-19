package com.onetooneui.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		//em.getTransaction().begin();
		/*
		 * Student s1 = new Student("Amol"); Address homeAddress = new Address();
		 * homeAddress.setStreet("Mumbai Naka"); homeAddress.setCity("Nashik");
		 * homeAddress.setState("Maharashtra"); homeAddress.setZipCode("422011");
		 * 
		 * //inject address into student s1.setAddress(homeAddress);
		 * 
		 * //persist only student, no need to persist Address explicitly em.persist(s1);
		 */
		/*
		 * Student s2=new Student("Neha"); Address addr=new Address();
		 * addr.setAddressId(102); addr.setCity("Pune"); addr.setState("MH");
		 * addr.setStreet("Balewadi"); addr.setZipCode("411022"); s2.setAddress(addr);
		 * em.persist(s2); em.getTransaction().commit();
		 * System.out.println("Added one student with address to database.");
		
		
		
		Student s=em.find(Student.class, 7);
		Address a1=s.getAddress();
		a1.setCity("Mumbai");
		s.setAddress(a1);
		em.merge(s);
		em.getTransaction().commit();
		
		System.out.println("Updated one student with address to database.");
		
		 */
		Query q1=em.createQuery("select stud from Student stud where stud.studentId>7");
		@SuppressWarnings({ "unused", "unchecked" })
		List<Student> l1=q1.getResultList();
		
		for(Student l:l1)
		{
			System.out.println(l.getName()+", "+l.getStudentId()+", "+l.getAddress().getCity());
		}
		em.close();
		factory.close();
	}
}
