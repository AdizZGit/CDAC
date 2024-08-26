import java.util.*;
public class Rev{
	public static void main(String args[]){
	System.out.println("Enter a number :");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int rev=0;
	int rem=0;
	while(n>0){
	
	rem = n%10;
	n=n/10;
	rev=(rev * 10)+rem;

		}
								

	System.out.println("Reverse is "+rev);

	}

}