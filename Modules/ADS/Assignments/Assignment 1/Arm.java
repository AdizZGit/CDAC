/*
1. Armstrong Number
Problem: Write a Java program to check if a given number is an Armstrong number.

Test Cases:

Input: 153
Output: true
Input: 123
Output: false
*/


import java.lang.Math;
import java.util.Scanner;

public class Arm 
{
	public static int arms(int n){
		if(n==0){
			return n;
		}
		else{
			int digit=n%10;
			return (int)Math.pow(digit,3)+arms(n/10);
		}
	}
	public static void main(String args[]){
		System.out.print("Input: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=arms(n);
		if(n==res)
			System.out.println("Output: true");
		else
			System.out.println("Output: false");
	}
}

/*
Output:
D:\ADS>java Arm
Input: 153
Output: true

D:\ADS>java Arm
Input: 123
Output: false
*/ 
