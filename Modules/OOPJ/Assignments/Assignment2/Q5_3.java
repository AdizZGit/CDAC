public class Q5_3 {
    public static void main(String[] args) {
//b. Write a program to test how many bytes are used to represent a long value using the BYTES field. (Hint: Use Long.BYTES).
        System.out.println("Number of bytes used to represent a long [q5 -b]: " +Long.BYTES); //q5-b
//c. Write a program to find the minimum and maximum values of long using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Long.MIN_VALUE and Long.MAX_VALUE).
        System.out.println("Minimum value of long [q5 -c]: " + Long.MIN_VALUE);
        System.out.println("Maximum value of long [q5 -c]: " + Long.MAX_VALUE); // q5 -c

//d. Declare a method-local variable number of type long with some value and convert it to a String using the toString method. (Hint: Use Long.toString(long)).

        long number = 123456789L;
        String strNumber = Long.toString(number);
        System.out.println("String representation of long [q5 -d]: " + strNumber); //q5 -d

//e. Declare a method-local variable strNumber of type String with some value and convert it to a long value using the parseLong method. (Hint: Use Long.parseLong(String)).       
        String strNumber1 = "987654321";
        long number1 = Long.parseLong(strNumber1);
        System.out.println("Long value of String [q5 -e]: " + number1); //q5 -e

//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a long value. (Hint: parseLong method will throw a NumberFormatException).       
        // String strNum2="Ab12Cd3";
        // long b2 = Long.parseLong(strNum2); //q5 -f NumberFormatException 
        //  System.err.println(b2);

//g. Declare a method-local variable number of type long with some value and convert it to the corresponding wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(long)).       
        long number2 = 123456789L;
        Long wrapperNumber = Long.valueOf(number2);
        System.out.println("Wrapper class value from long [q5 -g]: " + wrapperNumber); //q5 -g

// h. Declare a method-local variable strNumber of type String with some long value and convert it to the corresponding wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(String)).       
        String strNumber3 = "987654321";
        Long wrapperNumber2 = Long.valueOf(strNumber3);
        System.out.println("Wrapper class value from String [q5 -h]: " + wrapperNumber2); //q5 -h

//i. Declare two long variables with values 1123 and 9845, and add them using a method from the Long class. (Hint: Use Long.sum(long, long)).
        
        long number11 = 1123L;
        long number22 = 9845L;

        System.out.println("The sum is [q5 -i]: "+Long.sum(number11, number22));//q5 -i
        long number12 = 1123L;
        long number21 = 5566L;

//j. Declare two long variables with values 1122 and 5566, and find the minimum and maximum values using the Long class. (Hint: Use Long.min(long, long) and Long.max(long, long)).        
        
        System.out.println("Max [q5 -j]: "+Long.max(number12, number21) + " "+ "Min : "+Long.min(number12, number21)); //q5 -j

//k. Declare a long variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Long class. (Hint: Use Long.toBinaryString(long), Long.toOctalString(long), and Long.toHexString(long)).      
        
        long number3 = 7L;
        System.out.println("Binary form id [q5 -k]: "+Long.toBinaryString(number3)+" "+ "Octal form is :"+Long.toOctalString(number3)+" "+"Hex form is : "+Long.toHexString(number3)); //q5 -k
        
//l. Experiment with converting a long value into other primitive types or vice versa and observe the results.    
        long n13=43L;
       byte b=(byte)n13;
       float f11=(float)n13;
       
      double d =234.24d;
       long n22=(long)d;
       System.out.println("[q5 -l]"+b);
       System.out.println("[q5 -b]"+f11);
      System.out.println("[q5 -b]"+n22);

    }
    
}

/*Output
 * Number of bytes used to represent a long [q5 -b]: 8
Minimum value of long [q5 -c]: -9223372036854775808
Maximum value of long [q5 -c]: 9223372036854775807
String representation of long [q5 -d]: 123456789
Long value of String [q5 -e]: 987654321
Wrapper class value from long [q5 -g]: 123456789
Wrapper class value from String [q5 -h]: 987654321
The sum is [q5 -i]: 10968
Max [q5 -j]: 5566 Min : 1123
Binary form id [q5 -k]: 111 Octal form is :7 Hex form is : 7
[q5 -l]43
[q5 -b]43.0
[q5 -b]234
PS D:\OOPJ> 
 */
