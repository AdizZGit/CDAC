/*4.Write a program to remove duplicate elements from a single-dimensional array of integers.
 * 
 * 
 */



package pack_7;

public class Q4 {
    public static void main(String[] args) {
        
        int arr[] = {4, 4, 3, 2, 7, 2, 4}; 
        System.out.println("The array elements are :");
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        } {
        int n = arr.length;
        
        // Outer loop to compare elements
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    // Shift the array to the left to remove the duplicate
                    for(int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--; // Decrease the array size
                    j--; // Adjust the index to account for the shifted elements
                }
            }
        }

        System.out.println("After removing duplicate elements");
        for(int i = 0; i < n; i++) {
        	
            System.out.println(arr[i]+" ");
        }
    }
}
}


/*Output
 * The array elements are :
4
4
3
2
7
2
4
After removing duplicate elements
4 
3 
2 
7 

 * 
 */
