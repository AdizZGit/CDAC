package pack_inhe;

class Person{
	String name;
	int age;

	public Person() {
		this.name = "";
		this.age = 0;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public  void showRecord( ) {
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
}


class Employee extends Person{
	int empid;
	float salary;
	
	public Employee() {
		super();
		this.empid = 0;
		this.salary = 0.0f;
	}

	public Employee(int empid, float salary) {
		super();
		this.empid = empid;
		this.salary = salary;
	}
	
	public Employee(String name, int age, int empid, float salary) {
	super( name, age );	
		this.empid = empid;
		this.salary = salary;
	}
	
	public void displayRecord( ) {
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program{
	public static void main(String[] args) {
		//Employee e=new Employee();
		Employee e1=new Employee("adxtya", 22, -3, 5.0f );
		
//		e.showRecord();
//		e.displayRecord();
		e1.showRecord();
		e1.displayRecord();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
