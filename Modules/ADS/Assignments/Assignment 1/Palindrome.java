/*
9. Integer Palindrome
Problem: Write a Java program to check if a given integer is a palindrome.

Test Cases:

Input: 121
Output: true
Input: -121
Output: false



*/

	import java.util.*;
	public class Palindrome{
		static boolean Pailn(int num){
			int temp=num;
			int rev=0;
			
			
			while(num>0){
				int digit=num%10;
				rev=(rev*10)+digit;
				num=num/10;
			}
			if(rev==temp){
			return true;
		}
		return false;
		}
		public static void main(String args[]){
			System.out.println("Input");
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println(Pailn(n));
			
		}
	}
/*
Output
D:\ADS>java Palindrome
Input
121
true

D:\ADS>java Palindrome
Input
-121
false

*/