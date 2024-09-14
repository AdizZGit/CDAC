package pack_1;

/**
 * 
 */
class Hash <X,Y> {
	private X key;
	private Y value;

	public Hash(X key, Y value) {
		this.key = key;
		this.value = value;
	}

	public X getKey() {
		return this.key;
	}

	public Y getValue() {
		return this.value;
	}
}

public class Generics2 {
	public static void main(String[] args) {
		Hash<Integer , String > h0=new Hash<>(1,"A");
		Hash<Integer , String > h1=new Hash<>(2,"B");
		Hash<Integer , String > h2=new Hash<>(3,"C");
		System.out.println(h0.getKey()+" "+h0.getValue());
		System.out.println(h1.getKey()+" "+h1.getValue());
		System.out.println(h2.getKey()+" "+h2.getValue());
		

	}

}
