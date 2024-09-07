public class Q4_3 {
    public static void main(String[] args) {

 //b. Write a program to test how many bytes are used to represent an int value using the BYTES field. (Hint: Use Integer.BYTES).       
        
        System.out.println("The number of bytes in integer is [q4 -b]: "+Integer.BYTES); //q4 -b
//c. Write a program to find the minimum and maximum values of int using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Integer.MIN_VALUE and Integer.MAX_VALUE).        
       
        System.out.println("Minimum number of bytes is : "+Integer.MIN_VALUE + " " + "Maximum number of bytes is [q4 -c]: "+Integer.MAX_VALUE ); //q4 -c
 
// d. Declare a method-local variable number of type int with some value and convert it to a String using the toString method. (Hint: Use Integer.toString(int)).      
        
        int number = 123;
        String strNumber = Integer.toString(number); // q4 -d
        System.out.println("String representation of int [q4 -d]: " + strNumber); 

//e. Declare a method-local variable strNumber of type String with some value and convert it to an int value using the parseInt method. (Hint: Use Integer.parseInt(String)).
       
        String strNumber1 = "456";
        int number1 = Integer.parseInt(strNumber1);
        System.out.println("Integer value of String [q4 -e]: " + number1); //q4 -e

//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to an int value. (Hint: parseInt method will throw a NumberFormatException).

        // String strNum2="Ab12Cd3";
        // int b2 = Integer.parseInt(strNum2); //q4 -f NumberFormatException 
        // System.err.println(b2);
       
//g. Declare a method-local variable number of type int with some value and convert it to the corresponding wrapper class using Integer.valueOf(). (Hint: Use Integer.valueOf(int)).        
       
        int number2 = 789;
        Integer wrapperNumber = Integer.valueOf(number2);
        System.out.println("Wrapper class value [q4 -g]: " + wrapperNumber);//q4 -g

//h. Declare a method-local variable strNumber of type String with some integer value and convert it to the corresponding wrapper class using Integer.valueOf(). (Hint: Use Integer.valueOf(String)).
        
        String strNumber2 = "987";
        Integer wrapperNumber2 = Integer.valueOf(strNumber2);
        System.out.println("Wrapper class value from String [q4 -h]: " + wrapperNumber2); //q4 -h

//i. Declare two integer variables with values 10 and 20, and add them using a method from the Integer class. (Hint: Use Integer.sum(int, int)).

        int n5=10;
        int n6=20;
        System.out.println("The sum is [q4 -i]: "+Integer.sum(n5, n6)); //q4 -i

//j. Declare two integer variables with values 10 and 20, and find the minimum and maximum values using the Integer class. (Hint: Use Integer.min(int, int) and Integer.max(int, int)).
        
        System.out.println("The minimum is [q4 -j]: "+Integer.min(n5, n6)); //q4 -j
        System.out.println("The maximum is [q4 -j]: "+Integer.max(n5, n6)); //q4 -j

//k. Declare an integer variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Integer class. (Hint: Use Integer.toBinaryString(int), Integer.toOctalString(int), and Integer.toHexString(int)).      
        
        int n7=7;
        System.out.println("Binary form is [q4 -l]:" + Integer.toBinaryString(n7) +" "+ " Octal form is : "+Integer.toOctalString(n7)+" "+"Hex form is : "+Integer.toHexString(n7)); //a4 -k
        
//l. Declare an integer variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Integer class. (Hint: Use Integer.toBinaryString(int), Integer.toOctalString(int), and Integer.toHexString(int)).              
        
        int n13=43;
       byte b=(byte)n13;
       float f11=n13;
       
       double d =234.24d;
       int n22=(int)d;
       System.out.println("[q4 -l] "+b);
       System.out.println("[q4 -l] "+f11);
       System.out.println("[q4 -l] "+n22);
    }
}

/*output
PS D:\OOPJ> java Q4_3      
The number of bytes in integer is [q4 -b]: 4
Minimum number of bytes is : -2147483648 Maximum number of bytes is [q4 -c]: 2147483647
String representation of int [q4 -d]: 123
Integer value of String [q4 -e]: 456
Wrapper class value [q4 -g]: 789
Wrapper class value from String [q4 -h]: 987
The sum is [q4 -i]: 30
The minimum is [q4 -j]: 10
The maximum is [q4 -j]: 20
Binary form is [q4 -l]:111  Octal form is : 7 Hex form is : 7
[q4 -l] 43
[q4 -l] 43.0
[q4 -l] 234 */
