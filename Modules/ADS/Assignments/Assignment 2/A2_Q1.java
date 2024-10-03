/*
1. Printing Patterns
Problem: Write a Java program to print patterns such as a right triangle of stars.

Test Cases:

Input: n = 3
Output:
*
**
***
Input: n = 5
Output:
*
**
***
****
*****

*/
import java.util.Scanner;
public class A2_Q1{
	public static void main(String args[]){
	System.out.print("Enter the num : ");
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	}
}

/* Time Complexity : O(n^2) 
   Space Complexity : O(1)	
Output
D:\ADS>java A2_Q1
Enter the num : 5
*
**
***
****
*****

D:\ADS>java A2_Q1
Enter the num : 3
*
**
***

*/

/* Explanation

This program starts by importing the 
Scanner class from the java.util package for taking  user input. 
Inside the main method, the program asks the user to enter a number (n),
which determines the height of the triangle. We use  a nested loop structure,
where the outer loop is use for  rows and goes  from 1 to n,
For each iteration of the outer loop, the inner loop runs from 1 to the value of i.
This results in the first row having one * 
the second row two **, and so on, up to n  
After printing the * for each row, the program moves to the next line. 
For example, if the user inputs 5, the output will display a triangle with five rows, 
where the first row has one * and the fifth row has five *****. 

*/