/*equals and hashcode methods*/
package com.tns.collections.set.userdefinedobjects;

public class HashEqual {

	public static void main(String[] args) {

		String a = "Andrew";  
        String b = "Andrew";  
  
        if(a.equals(b)){   //checking the equality of objects using equals() methods  
            System.out.println("a & b are equal variables, and their respective hashvalues are:" + " "+ a.hashCode() + " & " + b.hashCode());  
          
        }  
  
        String c = "Maria";  
        String d= "Julie";  
  
        if(!c.equals(d)){    //checking  the equality of objects using equals() method  
            System.out.println("\nc & d are Un-equal variables, and their respective hashvalues are:" + " "+ c.hashCode() + " & " + d.hashCode());  
              
        }  
	}

}
