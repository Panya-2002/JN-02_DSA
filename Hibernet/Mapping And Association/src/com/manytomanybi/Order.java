package com.manytomanybi;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_master")
public class Order implements Serializable{
	@Id
	private int orderId;
	private Date purchaseDate;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="order_product",joinColumns={@JoinColumn(name="order_id")},inverseJoinColumns={@JoinColumn(name="product_id")})

	Set<Product> products;

	public int getOrderId() {
		return orderId;
	}




	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}




	public Date getPurchaseDate() {
		return purchaseDate;
	}




	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}




	public Set<Product> getProducts() {
		return products;
	}




	public void setProducts(Set<Product> products) {
		this.products = products;
	}




	private static final long serialVersionUID = 1L;

}
