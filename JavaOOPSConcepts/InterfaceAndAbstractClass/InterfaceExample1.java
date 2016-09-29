package InterfaceAndAbstractClass;
/* Important points:

1. What is difference between interface and abstract class ?

i) Interface consists of only abstract methods where as abstract class can consists of both abstract and concrete methods. 

ii) Interfaces in java are seen as an alternative to the multiple inheritance. Use interface when you want only polymorphism. 
   Abstract class is seen as a place holder in the inheritance tree and its sole purpose is to get inherited. Use abstract class 
   when you want both polymorphism and inheritance and also to prevent the users from creating the object of the class.
   
iii) Interfaces can be implemented on un related classes where as abstract class can be extended only on related classes. 

2. Abstract class can have constructors. Child class can invoke this constructor using super call.

*/



interface I1 {
 	
	public static final int X = 20;
	
	public abstract void printX( );	
	
}

class C1 implements I1 {
	
	public void printX( ) {
		
		System.out.println(X);
	}	
}

public class InterfaceExample1 {

	public static void main(String[  ] args) {

         I1 x = new C1();
         x.printX();

	}
}

