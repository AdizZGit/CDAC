/* public class S7 {     
public static void main(String[] args) { 
        int num1 = 10;         
		double num2 = 5.5;         
		int result = num1 + num2;        
		System.out.println(result); 
    } 
} 
 error: incompatible types: possible lossy conversion from double to int
                int result = num1 + num2;
				we need to define result as a double or
				need to do explicit typecasting

*/
public class S7 {     
public static void main(String[] args) { 
        int num1 = 10;         
		double num2 = 5.5;         
		int result = (int)(num1 + num2);        
		System.out.println(result); 
    } 
} 
/* by doing this we get output as 15 but the decimail get eliminited