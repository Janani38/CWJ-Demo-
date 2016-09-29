package Polymorphism;

/*
The compiler will use this order:

Widening - First preference  
Autoboxing - Second preference 
var args -  Last preference. 
 
*/

public class OverloadingAmbiguity3 {
	
	static void go(int x, int y) { System.out.println("int,int");}
	
	static void go(byte... x) { System.out.println("byte... "); }
	
	public static void main(String[ ] args) {
		
		byte b = 5;
		go(b,b); // which go() will be invoked?
		
	}	
}
