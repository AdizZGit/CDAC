package pack_array_demo;
import java.util.Scanner;
public class array1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int a= sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(a==arr[i]) {
			System.out.println(arr[i]);
		}

	}
	}
	
//	public static void main1(String[] args) {
//	int arr[]=new int[5];
//	for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]);
//	}Print.
	
}


