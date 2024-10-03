/*
6. Reverse Words in a String
Problem: Write a Java program to reverse the words in a given sentence.

Test Cases:

Input: "Hello World"
Output: "World Hello"
Input: "Java Programming"
Output: "Programming Java"

*/
import java.util.Scanner;
public class A2_Q6{
	static String rev(String s){
		String w[]=s.split(" +");
		StringBuilder sb=new StringBuilder();
		for(int i=w.length-1;i>=0;i--){
			sb.append(w[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
	
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String s=sc.nextLine();
		System.out.println(rev(s));
	}
}
/* Time Complexity O(n) Space Complexity O(n)
Output:
D:\ADS>java A2_Q6
Input: Hello world
world Hello

D:\ADS>java A2_Q6
Input: java programming
programming java
*/

/*
Explanation :
The program starts by importing the Scanner class for user input and defining a static
 method rev that takes a string s as an argument. Inside the rev 
 method, the input string is split into an array of words using the 
 split method with a regular expression that matches one or more spaces. 
 A StringBuilder is then used to build the reversed string.
 The program uses for loop to iterates through the array of words in reverse order upto the string length, appending 
 each word to the StringBuilder along with a space. After processing all words, 
the method returns the resulting string after trimming any trailing spaces. In 
the main method, the program prompts the user to input a string and calls the rev 
method, printing the reversed string of words. For example, if the input is "Hello World," 
the output will be "World Hello."

*/