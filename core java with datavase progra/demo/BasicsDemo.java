package com.tns.demo;

public class BasicsDemo {

	public static void main(String[] args) {
		int i=1;
		/*for(i=1;i<=10;i++);
		System.out.println("Hello"+i);*/
		
		/*for(i=1;i<=10;i++)
			System.out.println("Hello"+i);*/
		
		/*for(i=1;i<=10;i+=2)
			System.out.println("Hello"+i);*/
		
		/*for(i=0;i<=10;i+=2)
			System.out.println("Hello"+i);*/
		
		/*for(;i<10;i++)
			System.out.println("Hello"+i);*/
		
		
		/*for(;i<10;)
			System.out.println("Hello"+i);*/
		
		/*for(;i<=10;)
			System.out.println("Hello"+i++);*/
		
		/*for(;i<=10;)
			System.out.println("Hello"+(++i));*/
		
		/*for(i=10;i>=1;i--)
			System.out.println("Hello"+i);*/
		
		/*for(i=10;i>=1;i--);
			System.out.println("Hello"+i);
			
			for(i=10;i>=1;i--);
			{
				System.out.println("Hello"+i);
			}*/
		
			i=0;
			/*
			 * if(i>5); System.out.println(i+" greater than 5");
			 */
			i=10;
			/*
			 * if(i>5) System.out.println(i+" greater than 5"); else
			 * System.out.println(i+" less than 5");
			 */
				
			/*
			 * if(i>5); System.out.println(i+" greater than 5"); else
			 * System.out.println(i+" less than 5");
			 */
			
			
			/*for(i=1;i<=10;i++)
			{
				System.out.println("Hello "+i);
				if(i==5)
					break;
			}*/
		
			/*
			 * for(i=1;i<=10;i++) { if(i==5) break; System.out.println("Hello "+i); }
			 */
			for(i=1;i<=10;i++)
			{
				System.out.println("Hello "+i);
				if(i==5)
					continue;
			}

			for(i=1;i<=10;i++)
			{
				if(i==5)
					continue;
				System.out.println("Hello "+i);
			}
			i=0;
			while(true)
			{
				if(i>5)
					break;
				System.out.println("Hello");
				i++;
			}
	}

}
