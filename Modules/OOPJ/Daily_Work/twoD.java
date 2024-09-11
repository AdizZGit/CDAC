package pack_array_demo;
import java.util.*;
public class twoD {
	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int arr[][]=new int[2][2];
	        for(int row=0;row<arr.length;row++){
	            for(int col=0;col<arr[row].length;col++){
	               arr[row][col]=sc.nextInt();
	            }
	            System.out.println();
	        }
	        for(int row=0;row<arr.length;row++){
	            for(int col=0;col<arr[row].length;col++){
	               System.out.print(arr[row][col]+ "  ");
	            }
	            System.out.println();
	        }
	        
	    }
	}

