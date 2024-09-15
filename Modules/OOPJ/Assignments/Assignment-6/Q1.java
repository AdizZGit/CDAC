/*1 Declare a single-dimensional array of 5 integers inside the main method. Traverse the 
 * array to print the default values. Then accept records from the user and print 
 * the updated values of the array.
 * 
 */

package pack_7;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int arr[]=new int[5];
	    System.out.println("The Default Values are: ");
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]+"  \n");
	    }
	    System.out.println("Enter the values");
	    for(int i=0;i<arr.length;i++){
	        arr[i]=sc.nextInt();
	      }
	      System.out.println("The Updated Values are: "); 
	      for(int i=0;i<arr.length;i++){
	        System.out.println(arr[i]+"  ");
	}
	sc.close();      
	}   

}
/*Output
 * The Default Values are: 
0  
0  
0  
0  
0  
Enter the values
4
5
6
7
8
The Updated Values are: 
4  
5  
6  
7  
8 
 * 
 * 
 */
