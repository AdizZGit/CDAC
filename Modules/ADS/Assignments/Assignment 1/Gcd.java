/*
5. Find GCD
Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two numbers.

Test Cases:

Input: a = 54, b = 24
Output: 6
Input: a = 17, b = 13
Output: 1


*/
import java.util.Scanner;
public class Gcd{
public static int gcd(int n , int m){
if(n==0) {return m;}
else {
	return gcd(m%n,n);
}
}
public static void main(String args[]){
		System.out.print("Input a : ");
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		System.out.print("Input b : ");
		int n=sc.nextInt();
		
		
		System.out.print("Output: "+gcd(m,n));
		
}
}
/*
Output
D:\ADS>java Gcd
Input a : 54
Input b : 24
Output: 6
D:\ADS>javac Gcd.java

D:\ADS>java Gcd
Input a : 17
Input b : 13
Output: 1
*/
