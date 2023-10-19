package service;

import entities.Product;

public interface ProductService {
	public abstract Product getProductById(int id);
    public abstract void addProduct(Product product);
    public abstract void updateProduct(Product product);
    public abstract void removeProduct(Product product);
}
