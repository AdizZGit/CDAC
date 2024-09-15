/*6.	Write a program to find the missing number in an array of integers ranging from 1 to N.
 * 
 * 
 */

package pack_7;
import java.util.Scanner;
public class Q6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of N: ");
    int n = sc.nextInt();

    
    int[] arr = new int[n - 1];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n - 1; i++) {
        arr[i] = sc.nextInt();
    }

   
    int sum1 = 0;
    for (int i = 0; i < arr.length; i++) { 
        sum1 += arr[i];
    }

    
    int sum2 = n * (n + 1) / 2; 
   
    int diff = sum2 - sum1;
    System.out.println("The missing number is: " + diff);
    
    sc.close();
}
}

/*Output
 * Enter the value of N: 5
Enter the elements of the array:
1
2
4
5
The missing number is: 3

 * 
 */
