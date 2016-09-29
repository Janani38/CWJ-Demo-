package Polymorphism;


/*Method overloading is an example of static polymorphism, which method has to be invoked is 
decided at program compiling time itself. */
/*   

Definition: If a class have multiple methods with same name but with different arguments, it is known as Method Overloading. 

Advantage: Method overloading increases the readability of the program.

Rules for method overloading are:

1. Overloaded methods MUST change the argument list.

2. Overloaded methods CAN change the return type.

3. Overloaded methods CAN change the access modifier.

5. A method can be overloaded in the same class or in a subclass. In other words, if class A defines a doStuff(int i) method, the 
subclass B could define a doStuff(String s) method. So two methods with the same name but in different classes can still be 
considered overloaded.

 */

class MethodsOverloaded {

	public int add(int a,int b) {

		int c = a+b;
		return c;		
	}

	public String add(String a,String b) {

		String c = a+b;
		return c;
	}

//	public int add(String a,String b) {
//
//		//int c = a+b;
//		return 0;
//	}
	public double add(double x, double y) {
		return x + y;
	}	

}

public class OverloadingPrimitives {

	public static void main(String[ ] args) {

		MethodsOverloaded a = new MethodsOverloaded();		
		System.out.println(a.add(3,4));
		System.out.println(a.add("Hello","World"));
		System.out.println(a.add(12.5,6.55));

	}
}


