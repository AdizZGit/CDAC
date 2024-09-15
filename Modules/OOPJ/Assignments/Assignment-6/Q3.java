/*3.Write a program to find the maximum and minimum values in a single-dimensional array of integers.
 * 
 * 
 */

package pack_7;
import java.util.Scanner;
public class Q3 {
public static void main(String[] args) {
	int arr[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array elements :");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	sc.close();
	System.out.println("The array elements are :");
	for(int i=0;i<arr.length;i++) {
		
		System.out.println(arr[i]);
	}
	int max=arr[0];
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max)
			{ max=arr[i]; }
		if(arr[i]<min)
		{ min=arr[i]; }	
	}
	System.out.println("Maximum  "+max);
	System.out.println("Minimum  "+min);
}
}

/*Output
 * Enter the array elements :
45
78
99
2
66
The array elements are :
45
78
99
2
66
Maximum  99
Minimum  2

 * 
 * 
 */
