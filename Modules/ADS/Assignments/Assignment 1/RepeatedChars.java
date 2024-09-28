/*
7. Find Repeated Characters in a String
Problem: Write a Java program to find all repeated characters in a string.

Test Cases:

Input: "programming"
Output: ['r', 'g', 'm']
Input: "hello"
Output: ['l']


*/
import java.util.*;
public class RepeatedChars{
      public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the string");
		 String str= sc.nextLine();
		 int arr[]=new int[26];
		 for(int i=0;i<str.length();i++){
			 arr[str.charAt(i)-'a']++;
		 }
		 System.out.println("Repeated Chars:");
		 for(int i=0;i<arr.length;i++){
			 if(arr[i]>1)
				 System.out.print((char)('a'+i)+" ");
			
		 }
}
}

/*
Output
Enter the string
programming
Repeated Chars:
g m r
D:\ADS>java RepeatedChars
Enter the string
hello
Repeated Chars:
l
*/
