/*
10. Array Left Rotation
Problem: Write a Java program to rotate an array to the left by d positions.

Test Cases:

Input: arr = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Input: arr = [10, 20, 30, 40], d = 1
Output: [20, 30, 40, 10]


*/
import java.util.Arrays;
public class A2_Q10{
	static void  left(int arr[],int d){
		int n=arr.length;
		d=d%n;
		int res[]=new int[n];
		
		for(int i=0;i<n;i++){
			res[i]=arr[((i+d)%n)];
		}
		System.out.println(Arrays.toString(res));
	}
	/*static void right(int arr[],int d){
		int n=arr.length;
		d=d%n;
		int res[]=new int[n];
		for(int i=0;i<n;i++){
			res[i]=arr[((i-d+n)%n)];
		}
		System.out.println(Arrays.toString(res));
	}*/
	
		public static void main(String args[]){
			int arr[]={10,20,30,40};
				left(arr,1);
				//left(arr,1);
				//right(arr,2);
		}
}

/*Time complexity O(n) Space complexity O(n)
Output:
D:\ADS>java A2_Q10
[3, 4, 5, 1, 2]

D:\ADS>java A2_Q10
[20, 30, 40, 10]


*/
/*Explanation:
The program starts by importing the required classes .Arrays classes is used to access toString method.
The program consists a static methods: left. 
The left method takes an integer array arr and a number 
d representing the number of positions to rotate the array to the left. 
It calculates the effective rotations using d = d % n, where n is the length 
of the array, and creates a new array res to store the rotated elements. A for 
loop iterates through the array upto its length and calculates the new indexes for each element. 
=The program prints the resulting array after the left rotation. 
In the main method, for example array {10, 20, 30, 40} is defined, and the left method is called 
with d set to 1, resulting in the output of the array rotated left by one position. 
For example, the output for the input array will be [20, 30, 40, 10].
*/