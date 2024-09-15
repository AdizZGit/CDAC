/*2.Declare a single-dimensional array of 5 integers inside the 
 * main method. Define a method named acceptRecord to get input 
 * from the terminal into the array and another method named printRecord 
 * to print the state of the array to the terminal. 
 */
package pack_7;
import java.util.Scanner;
class ArrayD{
	private static Scanner sc=new Scanner(System.in);
	private static int[] arr;
	
	public void acceptRec() {
	arr=new int[5];
	System.out.println("Enter 5 integer values:");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	}
		
	public void displayRec() {
		System.out.println("The array elements are:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public void close() {
		sc.close();
	}
}

public class Q2 {
public static void main(String[] args) {
	ArrayD x=new ArrayD();
	x.acceptRec();
	x.displayRec();
	x.close();
}
}


/*Output
 * Enter 5 integer values:
4
5
7
8
9
The array elements are:
4
5
7
8
9
 * 
 */
