

public class Q3_3 {
    public static void main(String[] args) {
        //b. Write a program to test how many bytes are used to represent a short value using the BYTES field. (Hint: Use Short.BYTES).
        System.out.println("how many bytes are used to represent a short value : "+Short.BYTES); //q3 -b
       // c. Write a program to find the minimum and maximum values of short using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Short.MIN_VALUE and Short.MAX_VALUE).
        System.out.println("Minimum bytes : "+Short.MIN_VALUE +" "+"Maximum bytes : "+Short.MAX_VALUE); //q3 -c

       // d. Declare a method-local variable number of type short with some value 
       //and convert it to a String using the toString method. (Hint: Use Short.toString(short)).

        short num=32;
        String s1=Short.toString(num); // q3 -d
        System.out.println("[q3-d]  "+s1);

        //e. Declare a method-local variable strNumber of 
        //type String with some value and convert it to a short value using the parseShort method. (Hint: Use Short.parseShort(String)).

        String strnum1="21";
        short num2=Short.parseShort(strnum1); // q3 -e
        System.out.println("[q3-e]  "+num2);


       // f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a short value. (Hint: parseShort method will throw a NumberFormatException).
        // String strNum2="Ab12Cd3";
        //  short b2 = Byte.parseByte(strNum2); //q3 -f NumberFormatException
        //  System.err.println(b2);


        //g. Declare a method-local variable number of type short with some value and convert it to the
        // corresponding wrapper class using Short.valueOf(). (Hint: Use Short.valueOf(short)).
        short  num3=32;
        short num4=Short.valueOf(num3);// q3 -g
        System.out.println("[q3-g]  "+num4);

       // h. Declare a method-local variable strNumber of type String with some short value 
        //and convert it to the corresponding wrapper class using Short.valueOf(). (Hint: Use Short.valueOf(String)).

        String strnum2="120";
        short w1=Short.valueOf(strnum2);// q3 - h
        System.out.println("[q3-h]  "+w1);
        
        //i. Experiment with converting a short value 
        //into other primitive types or vice versa and observe the results.
        
       
        short s11=23;
        int n1=s11;
        long l1=s11;
        
        int n2=24;
        short s2=(short)n2;
        
        double d1= 33.434d;
        short s3=(short)d1;

        System.out.println("[q3-i]  "+n1);
        System.out.println("[q3-i]  "+l1);
        System.out.println("[q3-i]  "+s2);
        System.out.println("[q3-i]  "+s3);


    }
}

/*Output
PS D:\OOPJ> java Q3_3      
how many bytes are used to represent a short value : 2
Minimum bytes : -32768 Maximum bytes : 32767
[q3-d]  32
[q3-e]  21
[q3-g]  32
[q3-h]  120
[q3-i]  23
[q3-i]  23
[q3-i]  24
[q3-i]  33 */

