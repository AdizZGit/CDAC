/*
4. Reverse a String
Problem: Write a Java program to reverse a given string.

Test Cases:

Input: "hello"
Output: "olleh"
Input: "Java"
Output: "avaJ"


*/
	import java.util.Scanner;
	public class A2_Q4{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.print("Input: ");
			String str=sc.nextLine();
			String rev="";
			
			for(int i=0;i<str.length();i++){
				rev=str.charAt(i)+rev;
			}
			System.out.println("Output: "+rev);
		}
	}

/* Time Complexity O(n) Space Complexity O(n)
Output:
D:\ADS>javac A2_Q4.java

D:\ADS>java A2_Q4
Input: Hello
Output: olleH

D:\ADS>java A2_Q4
Input: Java
Output: avaJ

/*
Explanation 
The program starts by importing the Scanner class and creating a Scanner 
object to read input from the console. The user is prompted to 
enter a string, which is stored in the variable str. The program
 initializes an empty string rev to hold the reversed version of 
 the input. It then uses a for loop to iterate through each character 
 of the original string, appending each character to the front of the 
 rev string. The loop iterates until the string length.
 This effectively reverses the order of the characters as 
 they are processed. After the loop completes, the program prints the 
 reversed string as output. For example, if the input is "hello," the 
 output will be "olleh."
*/
