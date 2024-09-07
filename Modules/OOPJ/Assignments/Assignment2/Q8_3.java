import java.util.Scanner;
public class Q8_3 {
//Initialize a variable of each primitive type with a user-defined value and convert it into String:	
//First, use the toString method of the corresponding wrapper class. (e.g., Integer.toString()).
//Then, use the valueOf method of the String class. (e.g., String.valueOf()).
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an int x: ");
        int intx = sc.nextInt();
        
        System.out.println("Enter a float x: ");
        float floatx = sc.nextFloat();
        
        System.out.println("Enter a double x: ");
        double doublex = sc.nextDouble();
        
        System.out.println("Enter a boolean x: ");
        boolean booleanx = sc.nextBoolean();
        
        System.out.println("Enter a char x: ");
        char charx = sc.next().charAt(0);
        
        System.out.println("Enter a long x: ");
        long longx = sc.nextLong();
        
        System.out.println("Enter a short x: ");
        short shortx = sc.nextShort();
        
        System.out.println("Enter a byte x: ");
        byte bytex = sc.nextByte();
        
        sc.close();
        
        
///First, use the toString method of the corresponding wrapper class.        
        System.out.println("int --> String: " + Integer.toString(intx));
        System.out.println("float --> String: " + Float.toString(floatx));
        System.out.println("double --> String: " + Double.toString(doublex));
        System.out.println("boolean --> String: " + Boolean.toString(booleanx));
        System.out.println("char --> String: " + Character.toString(charx));
        System.out.println("long --> String: " + Long.toString(longx));
        System.out.println("short --> String: " + Short.toString(shortx));
        System.out.println("byte --> String: " + Byte.toString(bytex));
//Then, use the valueOf method of the String class.
        System.out.println("int --> String: " + String.valueOf(intx));
        System.out.println("float --> String: " + String.valueOf(floatx));
        System.out.println("double --> String: " + String.valueOf(doublex));
        System.out.println("boolean --> String: " + String.valueOf(booleanx));
        System.out.println("char --> String: " + String.valueOf(charx));
        System.out.println("long --> String: " + String.valueOf(longx));
        System.out.println("short --> String: " + String.valueOf(shortx));
        System.out.println("byte --> String: " + String.valueOf(bytex));
    }
}

/*PS D:\OOPJ> javac Q8_3.java
PS D:\OOPJ> java Q8_3      
Enter an int x: 
789       
Enter a float x:
22.25
Enter a double x:
456.65466
Enter a boolean x:
false
Enter a char x:
d
Enter a long x:
1234
Enter a short x:
124
Enter a byte x:
12
int --> String: 789
float --> String: 22.25
double --> String: 456.65466
boolean --> String: false
char --> String: d
long --> String: 1234
short --> String: 124
byte --> String: 12
int --> String: 789
float --> String: 22.25
double --> String: 456.65466
boolean --> String: false
char --> String: d
long --> String: 1234
short --> String: 124 */
