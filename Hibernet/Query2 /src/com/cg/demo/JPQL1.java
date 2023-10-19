package com.cg.demo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


public class JPQL1 {
   public static void main( String[ ] args ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA-PU" );
      EntityManager entitymanager = emfactory.createEntityManager();

      //Scalar function
      Query query = entitymanager.
      createQuery("Select e.ename from Employee2 e");
      @SuppressWarnings("unchecked")
	List<String> list = query.getResultList();

      for(String e:list) {
         System.out.println("Employee NAME :"+e);
      }
      
      //Aggregate function
      Query query1 = entitymanager.createQuery("Select MAX(e.salary) from Employee2 e");
      Double result = (Double) query1.getSingleResult();
      System.out.println("Max Employee Salary :" + result);
      
      double low=12000, high=50000;
    // Query query2 = entitymanager.createQuery("select e from Employee2 e where salary BETWEEN :low AND :high");
      TypedQuery<Employee2> query2=entitymanager.createQuery("select e from Employee2 e where salary BETWEEN :low AND :high",Employee2.class);
		
		query2.setParameter("low", low);
		query2.setParameter("high", high);
		
		List<Employee2> empList = query2.getResultList();
		for(Employee2 e1:empList)
			System.out.println(e1);
		
      
   }
}