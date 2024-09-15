/*7.Declare a single-dimensional array as a field inside a class and instantiate
 *  it inside the class constructor. Define methods named acceptRecord and printRecord 
 *  within the class and test their functionality.
 * 
 * 
 */


package pack_7;
import java.util.Scanner;
class X{
	private int arr[];
	public X(int size) {
	arr=new int[size];
	}
	public void acceptRec() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
			}
	}
	public void printRec() {
		System.out.println("The array elements are :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
public class Q7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array  :");
	X obj =new X(sc.nextInt());
	obj.acceptRec();
	obj.printRec();
}
}

/*Output
 * Enter the size of the array  :
5
Enter the array elements :
1
2
3
4
5
The array elements are :
1
2
3
4
5

 * 
 * 
 */
