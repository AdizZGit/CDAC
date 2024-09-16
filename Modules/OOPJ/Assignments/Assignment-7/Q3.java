	package pack_1;
	import java.util.Scanner;
	public class Q3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=440;
		byte b=123;
		short c=568;
		float f =45.32f;
		long g=452132l;
		double j=654.454d;
		
		int result=b+a;
		float r2=a+f;
		double r3=c+f;
		double r4=f*g;
		
		System.out.println("the byte is automatically widened to int  "+result);
		System.out.println("the int  is automatically widened to float  "+r2);
		System.out.println("the short  is automatically widened to float  "+r3);
		System.out.println("the float  is automatically widened to long  "+r4);
		
		
		sc.close();
		
	}
	}
