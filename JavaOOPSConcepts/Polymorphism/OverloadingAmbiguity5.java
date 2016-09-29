package Polymorphism;

// You cannot widen and auto box in a single step. 

public class OverloadingAmbiguity5 
{
	static void go(Long x) { System.out.println("Long"); }
	
	public static void main(String[  ] args) {
		
		byte b = 5;		
		//go(b); 
		
	}	
}

