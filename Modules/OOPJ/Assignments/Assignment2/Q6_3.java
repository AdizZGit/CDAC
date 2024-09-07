public class Q6_3 {
    public static void main(String[] args) {
//b. Write a program to test how many bytes are used to represent a float value using the BYTES field. (Hint: Use Float.BYTES).        
    System.out.println("The number of bytes is [q6 -b]:"+Float.BYTES); //q6 -b
    
//c. Write a program to find the minimum and maximum values of float using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Float.MIN_VALUE and Float.MAX_VALUE).    
    System.out.println("The max value is [q6 -c]:"+Float.MAX_VALUE);
    System.out.println("The min value is [q6 -c]:"+Float.MIN_VALUE);// q6 -c

//d. Declare a method-local variable number of type float with some value and convert it to a String using the toString method. (Hint: Use Float.toString(float)).    
    float number = 3.14f;
    String strNumber = Float.toString(number); //q6 -d
    System.out.println("String representation of float [q6 -d]: " + strNumber);

//e. Declare a method-local variable strNumber of type String with some value and convert it to a float value using the parseFloat method. (Hint: Use Float.parseFloat(String)).   
    String strNumber1 = "2.71828";
    float number1 = Float.parseFloat(strNumber1);//q6 -e
    System.out.println("Float value of String [q6 -e]: " + number1);

//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a float value. (Hint: parseFloat method will throw a NumberFormatException).    
    // String strNum2="Ab12Cd3";
    // float b2 = Float.parseFloat(strNum2); //q6 -f NumberFormatException 
    // System.err.println(b2);

//g. Declare a method-local variable number of type float with some value and convert it to the corresponding wrapper class using Float.valueOf(). (Hint: Use Float.valueOf(float)).    
    float number2 = 3.14f;
    Float wrapperNumber = Float.valueOf(number2); // q6 -g
    System.out.println("Wrapper class value from float [q6 -g]: " + wrapperNumber);

//h. Declare a method-local variable strNumber of type String with some float value and convert it to the corresponding wrapper class using Float.valueOf(). (Hint: Use Float.valueOf(String)).    
    String strNumber2 = "2.71828";
    Float wrapperNumber2 = Float.valueOf(strNumber2); //q6 -h
    System.out.println("Wrapper class value from String [q6 -h]: " + wrapperNumber2);

//i. Declare two float variables with values 112.3 and 984.5, and add them using a method from the Float class. (Hint: Use Float.sum(float, float)).    
    Float f1=112.3f;
    Float f2=984.5f;
    System.out.println("The sum is [q6 -i]: "+Float.sum(f1,f2)); //q6 -i
    
//j. Declare two float variables with values 112.2 and 556.6, and find the minimum and maximum values using the Float class. (Hint: Use Float.min(float, float) and Float.max(float, float)).    
    Float f3=112.2f;
    Float f4=556.6f;

    System.out.println("The max is [q6 -j]:"+Float.max(f3, f4));
    System.out.println("The min is [q6 -j]:"+Float.min(f3, f4)); //q6 -j

//k. Declare a float variable with the value -25.0f. Find the square root of this value. (Hint: Use Math.sqrt() method).    
    Float f5=-25.0f;
    System.out.println("The square is [q6 -k]:"+Math.sqrt(f5));//q6 -k
 
//l. Declare two float variables with the same value, 0.0f, and divide them. (Hint: Observe the result and any special floating-point behavior).    
    Float f6=0.0f;
    Float f7=0.0f;
    System.out.println("The result of divide is [q6 -l]:"+(f6/f7));//q6 -;
    
//m. Experiment with converting a float value into other primitive types or vice versa and observe the results.
    float n33=43.54f;
       byte b=(byte)n33;
       int f111=(int)n33;
       short s1=(short)n33;
       
      double d =2343.432434d;
       float n22=(float)d;
      
       System.out.println("[q6 -m]"+b);
       System.out.println("[q6 -m]"+f111);
      System.out.println("[q6 -m]"+n22);
       System.out.println("[q6 -m]"+s1);

    }
}

/*Output
PS D:\OOPJ> javac Q6_3.java
PS D:\OOPJ> java Q6_3      
The number of bytes is [q6 -b]:4
The max value is [q6 -c]:3.4028235E38
The min value is [q6 -c]:1.4E-45
String representation of float [q6 -d]: 3.14
Float value of String [q6 -e]: 2.71828
Wrapper class value from float [q6 -g]: 3.14
Wrapper class value from String [q6 -h]: 2.71828
The sum is [q6 -i]: 1096.8
The max is [q6 -j]:556.6
The min is [q6 -j]:112.2
The square is [q6 -k]:NaN
The result of divide is [q6 -l]:NaN
[q6 -m]43
[q6 -m]43
[q6 -m]2343.4324
[q6 -m]43
 */
