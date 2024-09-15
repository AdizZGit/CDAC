/*5.Write a program to find the intersection of two single-dimensional arrays.
 * 
 * 
 */

package pack_7;

public class Q5 {
	public static void main(String[] args) {
		int arr1[]= {1,3,4,5,6,6,7};
		int arr2[]= {1,3,4,5,8,9};
		System.out.println("The intersection of two 1D Arrays are:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr2[j]+" ");
				}
			}
		}
		
		}}

/*
 * The intersection of two 1D Arrays are:
	1 3 4 5 
 * 
 */


