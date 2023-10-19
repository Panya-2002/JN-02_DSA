package com.manytomanybi;

import java.util.Date;
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
		
		Set<Product> ps=new HashSet<Product>();
		Set<Order> os=new HashSet<Order>();
		
		Order o1=new Order();
		o1.setOrderId(103);
		o1.setPurchaseDate(new Date());
		o1.setProducts(ps);
		
		Order o2=new Order();
		o2.setOrderId(104);
		o2.setPurchaseDate(new Date(2000,10,2));
		o2.setProducts(ps);
		
		os.add(o1);
		os.add(o2);
		
		Product p1=new Product();
		p1.setProductId(3);
		p1.setProductName("Pen");
		p1.setOrders(os);
		
		Product p2=new Product();
		p2.setProductId(4);
		p2.setProductName("Folder");
		p2.setOrders(os);
		
		ps.add(p1);
		ps.add(p2);

		em.persist(p1);
		em.persist(p2);
		em.persist(o1);
		em.persist(o2);
		
		em.getTransaction().commit();
		System.out.println("Product and Order record added...");
		
		em.close();
		factory.close();
	
	}

}
