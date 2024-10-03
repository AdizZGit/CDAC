/*
3. Remove White Spaces from String
Problem: Write a Java program to remove all white spaces from a given string.

Test Cases:

Input: "Hello World"
Output: "HelloWorld"
Input: "  Java   Programming  "
Output: "JavaProgramming"

*/
import java.util.*;
public class A2_Q3{
	public static void main(String aregs[]){
	Scanner sc=new Scanner(System.in);
	String st=sc.nextLine();
	String o="";
	
	for(int i=0;i<st.length();i++){
		char c=st.charAt(i);
		
	if(!Character.isWhitespace(c)){
		o=o+c;
	}
	}
	//st=st.replaceAll("\\s","");
	//System.out.println(st);
	System.out.println(o);
	}
}

/* Time Complexity O(n) Space Complexity O(n)
Output :
D:\ADS>java A2_Q3
Hello World
HelloWorld

D:\ADS>javac A2_Q3.java

D:\ADS>java A2_Q3
Java Programming
JavaProgramming
*/

/* Explanation
The program starts by  importing the  Scanner class for taking input  The program initializes an empty 
string o to store the characters without whitespace. It then iterates through each character of the 
input string using a for loop upto the string length. 
For each character, it checks if it is not a whitespace character using the Character.isWhitespace() 
method. If the character is non-whitespace, it appends it to the string o. After processing all characters, 
the program prints the resulting string o, which contains only the non-whitespace characters. 

*/