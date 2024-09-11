//Student,java is the first file
package Second;

import First.*;

public class Test extends Student{
	public static void main(String[] args) {
		Test t=new Test();
		t.display();//private is not accessed into subclass of other package
	}
	
}	
//	public static void main(String[] args) {
//		Test t=new Test();
//		t.display();//protected is accessed into subclass of other package
	
//	public static void main(String[] args) {
//		Student s=new Student();
//		s.display(); // protected does not allows to access the methods into other package class
//	}
	
	
//	public static void main(String[] args) { //public can be accessed anywhere
//		Student s=new Student();
//		s.display();
//
//	}
		
//	public static void main(String[] args) {
//		Student s=new Student();
//		s.display();//The method display() from the type Student is not visible
////default cannot be accessed into other packages
//	}
	
}
