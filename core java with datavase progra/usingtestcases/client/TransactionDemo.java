//Program to Demonstrate Database Transaction 
package com.tns.testcasedatabaseexample.client;

import com.tns.testcasedatabaseexample.entities.SavingAccount;

import com.tns.testcasedatabaseexample.service.SavingAccountService;

public class TransactionDemo {
	public static void main(String[] args) {
		try {
			// Checking Balance
			SavingAccount sa;
			SavingAccountService service=new SavingAccountService();
			sa=service.get(1001);
			if (sa!=null)
				System.out.println(sa);
			
			
			  float balance; System.out.println("Is 1001 accno exists? " +
			  service.validateAccount(1001));
			  			  
			  // Withdrawing Balance 
			  service.withdraw(1001, 10000); //Checking Balance
			  sa=service.get(1001);
			  if (sa!=null)
					System.out.println(sa);
			  
			  service.withdraw(1003, 180000); // Checking Balance
			  sa=service.get(1003);
			  if (sa!=null)
					System.out.println(sa);
			  
			  // Deposit 
			  service.deposit(1001, 4000); //Checking Balance
			  sa=service.get(1003);
			  if (sa!=null)
					System.out.println(sa);
			  
			  // Transferring Fund 
			  sa=service.get(1001);
			  if (sa!=null)
					System.out.println(sa);
			 
			  sa=service.get(1002);
			  if (sa!=null)
					System.out.println(sa);
			  service.transferAmount(1001, 1002, 25000);
			  
			  // Checking Balance System.out.println(trans1.getBal(1001));
			  sa=service.get(1001);
			  if (sa!=null)
					System.out.println(sa);
			 
			  sa=service.get(1002);
			  if (sa!=null)
					System.out.println(sa);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}