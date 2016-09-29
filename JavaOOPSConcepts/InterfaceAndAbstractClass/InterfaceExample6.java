package InterfaceAndAbstractClass;

//A reference variable declared as interface type can point to the objects of the class that implements the interface. 

interface I13 {

	int X = 10;
	void printX( );	
}

class C6 implements I13 {
	
	public void printX( ) {
		System.out.println(X);
	}
}

public class InterfaceExample6 {
	
	public static void main(String[  ] args) {

    I13 x = new C6();   //Reference variable 'x' is of interface type. 
    x.printX();

	}
}

/* Important points:

1. If a class implements an interface it MUST override ALL the abstract methods present in it. (This rule does not apply
    if the class is abstract)  

3. Interface methods are abstract so they cannot be marked final. abstract and final they both has opposite meaning. 
     
4. If a class implements an interface all its sub classes also indirectly implement that interface. 

5. Interfaces can be nested.

6. If a method is declared as abstract you MUST compulsory override it. 

*/ 
