public class Q7_3 {
    public static void main(String[] args) {
//b. Write a program to test how many bytes are used to represent a double value using the BYTES field. (Hint: Use Double.BYTES).
      System.out.println("The number of bytes is [q7 -b]:"+Double.BYTES); 
      
//c. Write a program to find the minimum and maximum values of double using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Double.MIN_VALUE and Double.MAX_VALUE).
      System.out.println("Minimum value is [q7 -c]:"+Double.MIN_VALUE); 
      System.out.println("Maximum value is [q7 -c]:"+Double.MAX_VALUE);
      
//d. Declare a method-local variable number of type double with some value and convert it to a String using the toString method. (Hint: Use Double.toString(double)).
      double number=42.43342D;
      String str=Double.toString(number);
      System.out.println("String representation of double [q7 -d]:"+str); //q7 -d

//e. Declare a method-local variable strNumber of type String with some value and convert it to a double value using the parseDouble method. (Hint: Use Double.parseDouble(String)).
      String str1="343.434D";
      double d1=Double.parseDouble(str1);
      System.out.println("Double value of string [q7 -e]:"+d1); //q7 -e

//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a double value. (Hint: parseDouble method will throw a NumberFormatException).
      // String str2="Ab12Cd3";
      // double d2=Double.parseDouble(str2);
      // System.out.println(d2); //q7 -f

//g. Declare a method-local variable number of type double with some value and convert it to the corresponding wrapper class using Double.valueOf(). (Hint: Use Double.valueOf(double)).
      double num1=212.34d;
      double wrapper = Double.valueOf(num1);
      System.out.println("Wrapper class value form double [q7 -g]:"+wrapper); //q7 -g

//h. Declare a method-local variable strNumber of type String with some double value and convert it to the corresponding wrapper class using Double.valueOf(). (Hint: Use Double.valueOf(String)).
      String str3="12323.34d";
      double wrapper1=Double.valueOf(str3);
      System.out.println("Wrapper class value from string [q7 -h]:"+wrapper1); //q7 -h

//i. Declare two double variables with values 112.3 and 984.5, and add them using a method from the Double class. (Hint: Use Double.sum(double, double)).
      double d3=112.3d;
      double d4=984.5;
      System.out.println("The sum is [q7 -i]:"+Double.sum(d3, d4)); //q7 -i

//j. Declare two double variables with values 112.2 and 556.6, and find the minimum and maximum values using the Double class. (Hint: Use Double.min(double, double) and Double.max(double, double)).
      double d5=112.2d;
      double d6=556.6;
      System.out.println("The minimum value is [q7 -j]:"+Double.min(d5,d6));
      System.out.println("The maximum value is [q7 -j]:"+Double.max(d5,d6)); //q7 -j

//k. Declare a double variable with the value -25.0. Find the square root of this value. (Hint: Use Math.sqrt() method).
      double dd=-25.0d;
      System.out.println("The square root is [q7 -k]"+Math.sqrt(dd));
      
//l. Declare two double variables with the same value, 0.0, and divide them. (Hint: Observe the result and any special floating-point behavior).
      double f6=0.0d;
      double f7=0.0d;
      System.out.println("The result of divide is [q7 -l]:"+(f6/f7)); //q7 -l

     
//m. Experiment with converting a double value into other primitive types or vice versa and observe the results.
      double d11 = 123.3422342d;
       
       int n1=(int)d11;
       float ff=(float)d11;
       byte bb=(byte)d11;
       
       
       float ff1=24.4343f;
       double dd1=ff1;
       
       
       System.out.println(n1);
        System.out.println(ff);
         System.out.println(bb);
           System.out.println(dd1);





      
      



    }
    
}
/*Output
PS D:\OOPJ> java Q7_3
The number of bytes is [q7 -b]:8
Minimum value is [q7 -c]:4.9E-324
Maximum value is [q7 -c]:1.7976931348623157E308
String representation of double [q7 -d]:42.43342
Double value of string [q7 -e]:343.434
Wrapper class value form double [q7 -g]:212.34
Wrapper class value from string [q7 -h]:12323.34
The sum is [q7 -i]:1096.8
The minimum value is [q7 -j]:112.2
The maximum value is [q7 -j]:556.6
The square root is [q7 -k]NaN
The result of divide is [q7 -l]:NaN
123
123.34223
123
24.43429946899414 */
