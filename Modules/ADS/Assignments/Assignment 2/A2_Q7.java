/*
7. Reverse a Number
Problem: Write a Java program to reverse a given number.

Test Cases:

Input: 12345
Output: 54321
Input: -9876
Output: -6789

*/
import java.util.Scanner;
public class A2_Q7{
		static int rev(int n,int rev){
		if(n==0) return rev;
		else{
		
		int digit=n%10;
		rev=rev*10+digit;
		return rev(n/10,rev);
		
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Input :");
		int n=sc.nextInt();
		
		int x=rev(n,0);
		System.out.print("Output :"+x);
		
		/*int rev=0;
		while(n!=0){
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println(rev);*/
	}
}
/* Time Complexity O(logn) O(1) 
Output
D:\ADS>java A2_Q7
Input :12345
Output :54321
D:\ADS>java A2_Q7
Input :-9876
Output :-6789
*/

/*
Explanation
The program starts by  importing the Scanner class to facilitate user input and defining 
a static method rev that takes two integer parameters: n and rev . 
Inside the rev method, the base case checks if n is zero, then simply it returns the 0 value.
If n is not zero, the method extracts the last digit of n using the modulus operator and appends it to the
 reversed value by multiplying the current rev by 10 and adding the extracted digit. The
 method then recursively calls itself with n divided by 10, effectively removing the last 
 digit from n. In the main method, the program asks the user to enter an integer, then calls 
 the rev method to compute the reversed number, and prints the output. For example, if the 
 user inputs 1234, the output will be 4321.
*/