package dao;

import javax.persistence.EntityManager;

import entities.Product;

public class ProductDaoImpl implements ProductDao 
{
    private EntityManager em;
    public ProductDaoImpl()
    {
    	em=JPAUtil.getEntityManager();
    }
	@Override
	public Product getProductById(int id) {
		return em.find(Product.class, id);
	}

	@Override
	public void addProduct(Product product) {
		em.persist(product);
	}

	@Override
	public void updateProduct(Product product) {
		em.merge(product);
	}

	@Override
	public void removeProduct(Product product) {
		em.remove(product);
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

}
