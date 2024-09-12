package org.example.demo1;
class Person{
	private String name;
	private int age;
	
	public Person() {
		this.name="";
		this.age=0;
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("age: "+this.age);
	}
}
class Emp extends Person{
	private int sal;
	private int eid;
	public Emp() {
		
		this.sal=0;
		this.eid=0;
	}
	public Emp(String name,int age,int sal,int eid) {
		super(name,age);
		this.sal=sal;
		this.eid=eid;
	}
	public void display() {
		super.display();
		
		System.out.println("Sal: "+this.sal);
		System.out.println("eid: "+this.eid);
	}
}
public class Program {
	public static void main(String[] args) {
		Emp p=new Emp("adi",12,32,32);
		p.display();
	}

}
