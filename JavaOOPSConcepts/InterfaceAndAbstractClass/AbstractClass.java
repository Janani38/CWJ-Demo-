package InterfaceAndAbstractClass;

//An abstract method is a method that is declared, but contains no implementation. Abstract classes may not be instantiated, 
//and require subclasses to provide implementations for the abstract methods.


abstract class Account {
	
	long accountNumber;
	double balance;
				
	abstract void calculateInterest( );
	
	//void calculateInterest( ) { }
		
	public void withDraw(double money) {
		balance = balance - money;
	}

	public void deposit(double money) {
		balance = balance + money;
	}			
}

class SavingsAccount extends Account {
	
	void calculateInterest( ) {
		System.out.println("Saving account class calculate interest called");
	}

}

class CurrentAccount extends Account {
	
	void calculateInterest( ) {
		System.out.println("Current account class calculate interest called");
	}
	
}

class DematAccount extends Account {
	
	void calculateInterest( ) {
		System.out.println("Demat account class calculate interest called");
	}
}
 
public class AbstractClass {

	public static void main(String[  ] args) {
		
		SavingsAccount sa = new SavingsAccount( );
		CurrentAccount ca = new CurrentAccount( );
		DematAccount da = new DematAccount( );
		calculateInterestForAnyAccount(sa);
		calculateInterestForAnyAccount(ca);
		calculateInterestForAnyAccount(da);
		
	}
	
	static void calculateInterestForAnyAccount(Account account) {
		account.calculateInterest();
	}	
}


