package com.cg.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPAQueryDemo {
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		try
		{
			EntityManagerFactory factory=	Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em=factory.createEntityManager();
	   
	   /*M22_Student s1= new M22_Student();
	   s1.setUid(101);
	   s1.setName("Aniket");
	   
	   em.getTransaction().begin();
	   em.persist(s1);
	   em.getTransaction().commit();
	   System.out.println("student added....");*/
	   
	/*   M22_Student s2= new M22_Student();
	   s2.setUid(102);
	   s2.setName("Virendra");
	   
	   em.getTransaction().begin();
	   em.persist(s2);
	   em.getTransaction().commit();
	   System.out.println("student added....");
	  */ 
	   
	   Query q1=em.createQuery("select m from M22_Student m where m.uid>=105");
	   List<M22_Student> l1= q1.getResultList();
	   System.out.println("List of students with UID >=105");
	   for(M22_Student ss:l1)
		   System.out.println(ss);
	   
	   String nm="v";
	   q1=em.createQuery("select m from M22_Student m where m.name LIKE :pnm");
	   q1.setParameter("pnm", nm+"%");
	   l1= q1.getResultList();
	   System.out.println("List of students whose name contains pr");
	   for(M22_Student ss:l1)
		   System.out.println(ss);
	   
	  /* s=em.find(M22_Student.class, 102);
	   if (s!=null)
	   {
		   System.out.println(s);
	   		s.setName("m22 batch student");
	   		em.getTransaction().begin();
	   		em.merge(s);
	   		em.getTransaction().commit();
	 	   System.out.println("student updated....");
	 	   
	 	  em.getTransaction().begin();
	   		em.remove(s);
	   		em.getTransaction().commit();
	 	   System.out.println("student deleted....");
	 	   
	 	   
	   }
	   else
		   //System.out.println("Invalid student UID");
		   throw new StudentNotFoundException();
	   */
	   
	   
		}
		catch(Exception e) {}
	}

}
