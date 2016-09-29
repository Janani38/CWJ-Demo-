package Polymorphism;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/*

Definition: If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in java.
Re defining the inherited method is called method overriding.  

Advantage: 
1. Hides the method in the parent class. 
2. Runtime polymorphism. 

The rules for overriding a method are as follows: 

1. The argument list must exactly match that of the overridden method. If they don't match, you can end up with an overloaded 
method you didn't intend. 

2. The return type must be the same as, or a sub type of, the return type declared in the original 
overridden method in the superclass.

3. The access level can't be more restrictive than the overridden method's.

4. The access level CAN be less restrictive than that of the overridden method.

9. You cannot override a method marked final.

10. You cannot override a method marked static. 'static' methods are inherited but they cannot be overridden. 


 */

class Bank {	

	int getRateOfInterest( ) {
		return 0;	
	}		        
} 

class SBI extends Bank {

	int getRateOfInterest() {    	
		return 8;
	}  
}

public class MethodOverriding {

	public static void main(String[  ] args) {

		Bank b = new Bank( );		
		SBI sbi = new SBI( );
		Bank bank = new SBI( );

		System.out.println(b.getRateOfInterest());	
		System.out.println(sbi.getRateOfInterest());
		System.out.println(bank.getRateOfInterest());
	}
}

