/*
8. First Non-Repeated Character
Problem: Write a Java program to find the first non-repeated character in a string.

Test Cases:

Input: "stress"
Output: 't'
Input: "aabbcc"
Output: null

*/

import java.util.Scanner;
public class NonRepeated{
    public static char rep(String str){
        int count[]=new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
         for(int i=0;i<str.length();i++){
             if(count[str.charAt(i)]==1){
                 return str.charAt(i);
             }
            
         }
         return'\0';
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter the string");
        String str = sc.nextLine();
        char result = rep(str);
        if(result!='\0'){
        System.out.println("First non-repeated character is: " + result);
    }
    else{
     System.out.println("null");   
    }
}
}
/* Output:
D:\ADS>java NonRepeated
Enter the string
stress
First non-repeated character is: t

D:\ADS>java NonRepeated
Enter the string
aabbcc
null

D:\ADS>

*/