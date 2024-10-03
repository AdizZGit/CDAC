/*
5. Reverse Array in Place
Problem: Write a Java program to reverse an array in place.

Test Cases:

Input: arr = [1, 2, 3, 4]
Output: [4, 3, 2, 1]
Input: arr = [7, 8, 9]
Output: [9, 8, 7]

*/
import java.util.Scanner;
public class A2_Q5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Input: arr=[");
		 for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) { 
                System.out.print(", ");
            }
        }
		System.out.print("]");
		System.out.println();
		
		System.out.print("Output:[");
		for(int i=n-1;i>=0;i--){
			System.out.print(arr[i]);
			if(i>0){
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}

/* Time Complexity O(n) Space Complexity O(n)
Output:
D:\ADS>javac A2_Q5.java

D:\ADS>java A2_Q5
Enter the size4
1 2 3 4
Input: arr=[1, 2, 3, 4]
Output:[4, 3, 2, 1]
D:\ADS>java A2_Q5
Enter the size3
9 8 7
Input: arr=[9, 8, 7]
Output:[7, 8, 9]
*/

/*Explanation:
The program starts  by importing the Scanner class and creating a Scanner object to capture input from
the console. The user is prompted to enter the size of the array, which 
is stored in the variable n. The program then initializes an integer array
of size n and uses a for loop to fill the array with user-provided values. 
After that it will  prints the input array  
Then another for loop iterates through the array in reverse order,and prints.
The final output shows the array elements in reverse, providing a clear
view of both the original and reversed arrays. For example, if the input array is 
[1, 2, 3], the output will display [3, 2, 1].
*/