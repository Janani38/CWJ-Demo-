package Constructor;
public class Student {
	int id;// data member (also instance variable)
	String name;// data member(also instance variable)

	// why the name instance variable

	public static void main(String args[]) {
		Student s1 = new Student();// creating an object of Student
		// The new keyword is used to allocate memory at runtime.
		//Default constructor
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}

 