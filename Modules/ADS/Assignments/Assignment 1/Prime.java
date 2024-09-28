/*
2. Prime Number
Problem: Write a Java program to check if a given number is prime.

Test Cases:

Input: 29
Output: true
Input: 15
Output: false

*/
import java.util.Scanner;
public class Prime{
	static boolean pno(int n){
		if(n<=1)
			return false;
		else if(n==2)
			return true;
		
	else {for(int i=2;i<n;i++){
			if(n%i==0) 
			return false;
		}
		
	}
	return true;
	}	
	
public static void main(String  args[]){
System.out.println("Input: ");	
Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
System.out.println(pno(n));
}
}


/*
Output:
D:\ADS>java Prime
Input:
29
true

D:\ADS>java Prime
Input:
15
false

*/