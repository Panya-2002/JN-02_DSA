package exceptions;

public class ProductNotFoundException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ProductNotFoundException()
	{
		super();
	}
	public String toString()
	{
		return "Invalid Product ";
	}
}
