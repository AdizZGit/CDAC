import java.util.*;  
class Factorial { 
    public static void main(String[] args) 
    { 
		System.out.println("Enter the  number:");
       Scanner sc = new Scanner(System.in);
	   int x = sc.nextInt();
			 int fact=1;
			 int i;
			 for (i=1;i<=x;i++){
			 fact=fact*i;
			 }
			 System.out.println("Factorial of a number is:"+fact);
	}
}