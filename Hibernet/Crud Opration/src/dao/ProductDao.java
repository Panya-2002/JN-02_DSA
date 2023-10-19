package dao;

import entities.Product;

public interface ProductDao 
{
	public abstract Product getProductById(int id);
    public abstract void addProduct(Product product);
    public abstract void updateProduct(Product product);
    public abstract void removeProduct(Product product);
    public abstract void beginTransaction();
    public abstract void commitTransaction();    
}
