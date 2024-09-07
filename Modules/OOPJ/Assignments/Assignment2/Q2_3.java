public class Q2_3 {
    public static void main(String[] args) {
       //b. Write a program to test how many bytes are used to represent a 
       //byte value using the BYTES field. (Hint: Use Byte.BYTES).
       
        int x=Byte.BYTES;
        System.out.println("The number of bytes used to represent byte is [q2-b]: "+x); //q2-b

        //c. Write a program to find the minimum and maximum values of byte 
        //using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Byte.MIN_VALUE and Byte.MAX_VALUE).
        
        int y=Byte.MIN_VALUE;
        int z=Byte.MAX_VALUE;

        System.out.println("The minimum value is [q2-c] : "+ y); 
        System.out.println("The maximum value is  [q2-c]: "+ z); // q2-c

        //d. Declare a method-local variable number of type byte with 
        //some value and convert it to a String using the toString method. (Hint: Use Byte.toString(byte)).

        byte num=22;
        String s1=Byte.toString(num);
        System.out.println("[q2-d] "+s1); // q2-d

        //e. Declare a method-local variable strNumber of type String 
        //with some value and convert it to a byte value using the parseByte method. (Hint: Use Byte.parseByte(String)).
       
        String strNum="45";
        byte b1=Byte.parseByte(strNum);
        System.err.println("[q2-e] "+b1);// q2 -e

        //f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" 
        //and attempt to convert it to a byte value. (Hint: parseByte method will throw a NumberFormatException).

        // String strNum1="Ab12Cd3";
        // byte b2 = Byte.parseByte(strNum1);
        // System.err.println(b1); // q2 -f NumberFormatException

        //g. Declare a method-local variable number of type byte with some value 
        //and convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(byte)).

        byte num2=43;
        byte Wrapper1=Byte.valueOf(num2);
        System.err.println("[q2-]g "+Wrapper1); //q2 -g

       // h. Declare a method-local variable strNumber of type String with some byte value and 
       //convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(String)).

        String str2="121";
        byte w2=Byte.valueOf(str2);
        System.out.println("[q2-h] "+w2);//q2 -h

        // i. Experiment with converting a byte value into other primitive types or vice versa and observe the results.
        byte b=12;
        int n1 = b;
    
        float f1=b;

        int n2 = 23;
        byte b11= (byte)n2;
        
        float f2=21.44f;
        byte b2=(byte)f2;
        
        double d1=2312.433d;
        byte b3=(byte)d1;
        
        System.out.println(n1);
         System.out.println(f1);
          System.out.println(b11);
          System.out.println(b2);
          System.out.println(b3);

        /* Output
        PS D:\OOPJ> java Q2_3
The number of bytes used to represent byte is [q2-b]: 1
The minimum value is [q2-c] : -128
The maximum value is  [q2-c]: 127
[q2-d] 22
[q2-e] 45
[q2-]g 43
[q2-h] 121
12
12.0
23
21
8 */
        
       
        }

    }

