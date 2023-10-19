package service;

import dao.ProductDao;
import dao.ProductDaoImpl;
import entities.Product;

public class ProductServiceImpl implements ProductService
{
    private ProductDao dao;
    public ProductServiceImpl()
    {
    	dao=new ProductDaoImpl();
    }
    
	@Override
	public Product getProductById(int id)
	{
		return dao.getProductById(id);
	}

	@Override
	public void addProduct(Product product) {
		dao.beginTransaction();
		dao.addProduct(product);
		dao.commitTransaction();
		System.out.println("Product added..");
	}

	@Override
	public void updateProduct(Product product) {
		dao.beginTransaction();
		dao.updateProduct(product);
		dao.commitTransaction();
		System.out.println("Product updated..");
		
	}

	@Override
	public void removeProduct(Product product) {
		dao.beginTransaction();
		dao.removeProduct(product);
		dao.commitTransaction();
		System.out.println("Product deleted..");
		
	}

}
