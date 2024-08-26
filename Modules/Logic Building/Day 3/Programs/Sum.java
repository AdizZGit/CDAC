import java.util.*;  
class Sum { 
    public static void main(String[] args) 
    { 
		System.out.println("Enter the natural number:");
       Scanner sc = new Scanner(System.in);
	   int  n = sc.nextInt();
        int sum = 0; 
        
  
        for (int i = 1; i <= n; i++) { 
            sum += i; 
        } 
        
        System.out.println("Natural number sum is: "+sum);
}}