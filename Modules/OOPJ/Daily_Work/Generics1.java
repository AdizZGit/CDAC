package pack_1;
class Dog<X>{
	X name;
	public Dog(X name) {
		this.name=name;
	}
	public X getName() {
		return this.name;
	}
}
public class Generics1 {
public static void main(String[] args) {
	Dog<String> n=new Dog<>("nj");
	Dog<Boolean> n1=new Dog<>(false);
	Dog<Number> n2=new Dog<>(785);
	Dog<String> n3=new Dog<>("nj");
	System.out.println(n.getName());
	System.out.println(n1.getName());
	System.out.println(n2.getName());
	System.out.println(n3.getName());
}
}
