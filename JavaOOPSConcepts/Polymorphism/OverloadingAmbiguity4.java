package Polymorphism;

/*
The compiler will use this order:

Widening - First preference  
Autoboxing - Second preference 
var args -  Last preference.
 
*/

class OverloadingAmbiguity4 {
	
	static void go(Byte x, Byte y)
	{ System.out.println("Byte, Byte"); }
	
	static void go(byte... x) { System.out.println("byte... "); }
	
	public static void main(String[  ] args) {
		
		byte b = 5;
		go(b,b); // which go() will be invoked?
				
	}	
}
