/*
6. Find Square Root
Problem: Write a Java program to find the square root of a given number (using integer approximation).

Test Cases:

Input: x = 16
Output: 4
Input: x = 27
Output: 5

*/
import java.util.*;
public class SqRoot{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input x : ");	
	int x=sc.nextInt();
	int y = (int)Math.sqrt(x);
	System.out.println("Output : "+y);
	}
}
/*
Output 
D:\ADS>java SqRoot
Input x : 16
Output : 4

D:\ADS>java SqRoot
Input x : 27
Output : 5
*/