package client;

import java.util.Scanner;

import entities.Product;
import exceptions.ProductNotFoundException;
import service.ProductService;
import service.ProductServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
		ProductService service=new ProductServiceImpl();
		int ch=5;
		try (Scanner sc = new Scanner(System.in)) 
		{
			int product_Id;
			 String product_name;
			 int quantity;
			int rate;
			Product p1;
			do
			{
				System.out.println("------------------Product Menu-------------");
				System.out.println("1. Insert Product");
				System.out.println("2. Update Product");
				System.out.println("3. Delete Product");
				System.out.println("4. Display Product");
				System.out.println("5. Exit");
				System.out.println("Enter Choice(1..5) ");
				ch=sc.nextInt();
					switch(ch)
				{
					case 1:
							System.out.println("Enter Product Id, name, quantity and rate ");
							product_Id=sc.nextInt();
							product_name=sc.next();
							quantity=sc.nextInt();
							rate=sc.nextInt();
							p1=new Product();
							p1.setProduct_Id(product_Id);
							p1.setProduct_name(product_name);
							p1.setQuantity(quantity);
							p1.setRate(rate);
							service.addProduct(p1);
							break;
					case 2:
							System.out.println("Enter Product Id and updated rate ");
							product_Id=sc.nextInt();
							rate=sc.nextInt();
							p1=service.getProductById(product_Id);
							if (p1==null)
							//	System.out.println("Product not found");
								throw new ProductNotFoundException();								
							else
							{
								p1.setRate(rate);
								service.updateProduct(p1);
							}
							break;
					case 3:	System.out.println("Enter Product Id to be delete ");
							product_Id=sc.nextInt();
							p1=service.getProductById(product_Id);
							if (p1==null)
								//System.out.println("Product not found");
								throw new ProductNotFoundException();
							else
							{
								service.removeProduct(p1);
							}
							break;
					case 4:	System.out.println("Enter Product Id to be search...");
							product_Id=sc.nextInt();
							p1=service.getProductById(product_Id);
							if (p1==null)
								throw new ProductNotFoundException();
								//System.out.println("Product not found");
							else
							{
								System.out.println("product id "+p1.getProduct_Id()+"\tProduct name "+p1.getProduct_name()+"\tQuantity "+p1.getQuantity()+"\tRate "+p1.getRate());
							}
							
							break;
					case 5: System.exit(0);
					
				}						
			}while(ch!=5);
		}
		catch(Exception e) {
			System.out.println("Error..."+e.getMessage());
		}
	}

}
