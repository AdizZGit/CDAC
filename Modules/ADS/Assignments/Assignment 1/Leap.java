/*
10. Leap Year
Problem: Write a Java program to check if a given year is a leap year.

Test Cases:

Input: 2020
Output: true
Input: 1900
Output: false



*/
import java.util.*;
public class Leap{
	static boolean leap(int n){
		if(n%4==0 && n%100!=0 || n%400==0 )
		return true;
	else
		return false;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=leap(n);
		System.out.print(leap(n));
	}
}

/*
Output
D:\ADS>java Leap
2020
true
D:\ADS>java Leap
1900
false
*/