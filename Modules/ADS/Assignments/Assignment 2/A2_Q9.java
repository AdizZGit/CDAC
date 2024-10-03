/*
9. String Palindrome
Problem: Write a Java program to check if a given string is a palindrome.

Test Cases:

Input: "madam"
Output: true
Input: "hello"
Output: false

*/
import java.util.Scanner;
public class A2_Q9{
    static void p(String st,String rev){
        for(int i=0;i<st.length();i++){
            rev=st.charAt(i)+rev;
        }
        //System.out.println(rev);
        if(st.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the string ");
        String st=sc.nextLine();
        String rev="";
        // Main m=new Main();
        p(st,rev);
        
    }
}

/* Time Complexity O(n) Space Complexity O(n)
Output: 
D:\ADS>java A2_Q9
Enter the string
madam
Palindrome

D:\ADS>java A2_Q9
Enter the string
hello
Not Palindrome

*/

/*
 The program starts by  importing the Scanner class for user input and defining a 
 static method p that takes two parameters: st  and rev . Inside the p method, a for loop 
 iterates through each character of the original string st until the string length, constructing the 
 reversed string by adding each character to rev. After constructing the 
 reversed string, the program compares it with the original string using the 
 equals method. If they are equal, it prints "Palindrome"; otherwise, it prints 
 "Not Palindrome." In the main method, the program ask the user to enter a 
 string, initializes an empty string for the reversed version, and calls the p 
 method to perform the palindrome check.
 For example, if the input is "radar," 
 the output will be "Palindrome," whereas the input "hello" would yield "Not Palindrome."


*/