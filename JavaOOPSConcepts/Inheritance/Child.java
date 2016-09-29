package Inheritance;

class Child extends GrandParent,Parent {

	public static void main(String args[]) {
		Child obj = new Child();
		obj.msg();
		// Now which msg() method would be invoked?
	}
}
