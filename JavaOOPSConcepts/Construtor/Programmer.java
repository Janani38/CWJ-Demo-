package Constructor;

public class Programmer extends Employee {
	int bonus = 10000;
	float total = 0;
	// Instance Initializer block
	{
		System.out.println("Instance initialiser block is called");
	}
	
	//method overriding
	void add() {
		System.out.println("Programmer is an employee");
		total = salary + bonus;
	}

	public static void main(String args[]) {
		Programmer p = new Programmer();
		//Employee e = new Programmer();
		Employee e = new Employee();
		p.add();
		e.add();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
		System.out.println("Total Salary is:" + p.total);

	}

}
