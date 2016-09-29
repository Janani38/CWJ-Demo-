package Constructor;

//No Arg Constructor
//class Constructor {
//	
//	static
//	{
//		System.out.println("Static block is called");
//	}
//	Constructor() {
//		System.out.println("I am inside Constructor");
//	}
//	void call()
//	{`
//		System.out.println("call method is called");
//	}
//
//	public static void main(String args[]) {
//		System.out.println("Inside main method");
//		Constructor c = new Constructor();
//		c.call();
//	}
//}

//Parameterized Constructor
class Constructor {
	int id;
	String name;
	
	Constructor()
	{
		this(12,"Ravi");
	}

	Constructor(int i, String n) {
		this.id = i;
		this.name = n;
		System.out.println("ID and Name : "+id +" " +name);
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		Constructor s1 = new Constructor(548568, "Radhika");
		Constructor s2 = new Constructor(548562, "Razika");
		Constructor c=new Constructor();
		s1.display();
		s2.display();
	}
}