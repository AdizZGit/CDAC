/*
4. Fibonacci Series
Problem: Write a Java program to print the first n numbers in the Fibonacci series.

Test Cases:

Input: n = 5
Output: [0, 1, 1, 2, 3]
Input: n = 8
Output: [0, 1, 1, 2, 3, 5, 8, 13]


*/
import java.util.Scanner;
public class Fiboo{
	static int fib(int in){
		if(in<=1)
			return in;
		else{
			return fib(in-1)+fib(in-2);
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.print(fib(i)+" ");
		}
	}
}
/* 
Output: 
D:\ADS>java Fiboo
5
0 1 1 2 3 5
D:\ADS>java Fiboo
8
0 1 1 2 3 5 8 13 21
D:\ADS>

*/