public class Q10_3 {
//10. Arithmetic Operations with Command Line Input
//Write a program that accepts two integers and an arithmetic operator 
//(+, -, *, /) from the command line. Perform the specified arithmetic operation based on the operator provided. (Hint: Use switch-case for operations).

    
    public static void main(String[] args) {

        // Parse the command-line arguments
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        char op = args[2].charAt(0); // Take the operator as a char

        // Perform the operation based on the operator
        switch (op) {
            case '+':
                double sum = x + y;
                System.out.println("The sum is: " + sum);
                break;
            case '-':
                double diff = x - y;
                System.out.println("The difference is: " + diff);
                break;
            case '*':
                double mul = x * y;
                System.out.println("The product is: " + mul);
                break;
            case '/':
                if (y == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                } else {
                    double div = (double) x / y; // Casting to double for proper division
                    System.out.println("The division result is: " + div);
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                break;
        }
    }
}

/*Output
S D:\OOPJ> javac Q10_3.java
PS D:\OOPJ> java Q10_3 5 5 +
The sum is: 10.0
PS D:\OOPJ> java Q10_3 5 5 -
The difference is: 0.0
PS D:\OOPJ> java Q10_3 5 5 /
The division result is: 1.0
PS D:\OOPJ> java Q10_3 5 0 /
Error: Division by zero is not allowed!
PS D:\OOPJ>  */