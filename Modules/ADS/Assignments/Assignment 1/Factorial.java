/*
3. Factorial
Problem: Write a Java program to compute the factorial of a given number.

Test Cases:

Input: 5
Output: 120
Input: 0
Output: 1


*/
import java.util.Scanner;
public class Factorial{
	public static int f(int n){
		
		if(n<=1) 
		{return 1;}
		else 
		{ return n*f(n-1);}
	}
	public static void main(String args[]){ 
	Scanner sc =new Scanner(System.in);
	System.out.println("Input: ");
	int n=sc.nextInt();
	System.out.println("Output: "+f(n));
	}
}

/* Output
Input:
0
Output: 1

D:\ADS>java Factorial
Input:
1
Output: 1

D:\ADS>java Factorial
Input:
5
Output: 120

*/
