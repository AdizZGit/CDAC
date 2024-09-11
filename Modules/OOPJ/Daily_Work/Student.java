//Test.java is the other file
package First;

public class Student {
		String name;
		int id;
		
		{
			name="adi";
			id=12;
		}
		
		private  void display() {
			System.out.println("Name :"+this.name);
			System.out.println("Id :"+this.id);
			
		}
		public static void main(String[] args) {
			Student s=new Student();
			s.display();
		}
}

//		void display() { //default
//			System.out.println("Name :"+this.name);
//			System.out.println("Id :"+this.id);
//			
//		}
//		protected void display() {
//			System.out.println("Name :"+this.name);
//			System.out.println("Id :"+this.id);
//			
//		}
//		public static void main(String[] args) { //package level private is accessed within the same class
//			Student s=new Student();
//			s.display();
//		}
		

// public class Student extends Ass{
//	 public static void main(String[] args) {
//	Ass a=new Ass(); //protected can be accessed into subclass
//	a.display();
//}
// }

