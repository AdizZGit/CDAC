import java.util.*;
public class Fibonacci{
	public static void main(String args[]){
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int a=0;int b=1; int c=0;
		for (int i=1;i<=x;i++){
			System.out.print(a+"  ");      //0,1,1,2,3,5.8....
			c = a+b;                  //c==1,2,3,5,8,13
			a=b;                        //a=1,1,2,3,5,8
			b=c;                       //b=1,2,3,5,8,13
			
			
		}
		
	}
	
}