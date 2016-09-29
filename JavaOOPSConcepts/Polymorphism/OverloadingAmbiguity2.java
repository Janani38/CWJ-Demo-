package Polymorphism;

/*
The compiler will use this order:

Widening - First preference  
Autoboxing - Second preference 
var args -  Last preference. 
 
*/

public class OverloadingAmbiguity2 {
	
	static void go(Integer x) { System.out.println("Integer"); }
	
	static void go(long x) { System.out.println("long"); }
	
	public static void main(String[  ] args) {
		
		int i = 5;
		go(i); 
	}	
}
