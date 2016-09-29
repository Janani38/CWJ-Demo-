package Polymorphism;
/*
In every case, when an exact match isn't found, the JVM uses the method with the smallest argument that is wider 
than the parameter. You can verify for yourself that if there is only one version of the go() method, and it takes a 
double, it will be used to match all four invocations of go().
 */

class OverloadingAmbiguity1 {
	
	static void go(int x) { System.out.print("int "); }
	
	static void go(long x) { System.out.print("long "); }
	
	static void go(double x) { System.out.print("double "); }

	public static void main(String[  ] args) {

		byte b = 5;
		short s = 5;
		long l = 5;
		float f = 5.0f;

		go(b);
		go(s);
		go(l);
		go(f);

	}
}

