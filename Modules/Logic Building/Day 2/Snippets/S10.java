public class S10 {     
public static void main(String[] args) { 
        int value = 2;         
		switch(value) {             
		case 1: 
                System.out.println("Value is 1");             
				case 2: 
                System.out.println("Value is 2");             
				case 3: 
                System.out.println("Value is 3");            
				default: 
                System.out.println("Default case"); 
        } 
    } 
} 
/* When case 2 get satisfy then it get printed but there is no break statement in case 2 
hence all the remaining cases get printed */

 /*
public class S10 {     
public static void main(String[] args) {         
double score = 85.0;         
switch(score) {             
				case 100: 
                System.out.println("Perfect score!");                
				break;            
				case 85: 
                System.out.println("Great job!");                
				break;            
				default: 
                System.out.println("Keep trying!"); 
        } 
    } 
}*/ 
 /*error: incompatible types: possible lossy conversion from double to int
 we can only use "int , short , byte , char ,string" for switch
 */
 
 
 /*
 public class S10 {     
 public static void main(String[] args) {         
				int number = 5;         
				switch(number) {             
				case 5: 
                System.out.println("Number is 5"); 
                break;            
				case 5: 
                System.out.println("This is another case 5"); 
                break;             
				default: 
                System.out.println("This is the default case"); 
        } 
    } 
} */
/* error  error: duplicate case label
                                case 5: */