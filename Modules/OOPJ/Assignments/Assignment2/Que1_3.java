public class Que1_3 {
    public static void main(String[] args) {
        //Q-1
        //b. Declare a method-local variable status of type 
        //boolean with the value true and convert it to a 
        //String using the toString method. (Hint: Use Boolean.toString(Boolean) ).
        boolean status=true;
        String s1 = Boolean.toString(status); //q1-b
        System.out.println("q1-b "+s1);

        /*c. Declare a method-local variable strStatus of type 
        String with the value "true" and convert it to a boolean 
        using the parseBoolean method. (Hint: Use Boolean.parseBoolean(String)). */

        String strStatus = "true";
        boolean b=Boolean.parseBoolean(strStatus); //q1-c
        System.out.println("q1-c "+b);

        /* d. Declare a method-local variable strStatus of type String 
        with the value "1" or "0" and attempt to convert it to a boolean. 
        (Hint: parseBoolean method will not work as expected with "1" or "0").*/
        
        String strStatus1 =  "1";
        boolean b1=Boolean.parseBoolean(strStatus1); //q1-d Boolean.parseBoolean(strStatus) only returns true if the string is exactly "true"
        System.out.println(strStatus1);              //ignoring case.Since "1" and "0" are not equal to "true", both cases result in false.
        System.out.println("q1-d "+b1);


        String strStatus2 =  "0";
        boolean b2=Boolean.parseBoolean(strStatus2);//q1-d
        System.out.println(strStatus2);
        System.out.println("q1-d "+b2);

        /*e. Declare a method-local variable status of type boolean with the 
        value true and convert it to the corresponding wrapper class using Boolean
        .valueOf(). (Hint: Use Boolean.valueOf(boolean)). */
       
        boolean strStatus3=true;
        boolean Wrapper = Boolean.valueOf(strStatus3);//q1-e
        System.out.println("q1-e "+Wrapper);

        /*f. Declare a method-local variable strStatus of type String with 
        the value "true" and convert it to the corresponding wrapper class using
        Boolean.valueOf(). (Hint: Use Boolean.valueOf(String)). */
        
        String strStatus4 = "true";
        boolean w1=Boolean.valueOf(strStatus4);
        System.err.println("q1-f "+w1);

        /*In Java, you cannot directly convert a 
        boolean into other primitive data types 
        or vice versa, as Java is designed with
        strict type safety.*/
        
        /*g. Experiment with converting a boolean value into 
        other primitive types or vice versa and observe the results.*/
       
        // float f=23.4f;
        // boolean b11= (boolean)f;
        // System.out.println(b11);
        //error: incompatible types: float cannot be converted to boolean
       
    }
}

/* Output
PS D:\OOPJ> javac Que1_3.java
PS D:\OOPJ> java Que1_3      
q1-b true
q1-c true
1
q1-d false
0
q1-d false
q1-e true
q1-f true */
