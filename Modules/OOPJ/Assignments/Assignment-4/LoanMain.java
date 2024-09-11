/*
 * 1. Loan Amortization Calculator
Implement a system to calculate and display the monthly payments for a mortgage loan. The system should:
1.	Accept the principal amount (loan amount), annual interest rate, and loan term (in years) from the user.
2.	Calculate the monthly payment using the standard mortgage formula:
o	Monthly Payment Calculation:
	monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
	Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths = loanTerm * 12
	Note: Here ^ means power and to find it you can use Math.pow( ) method
3.	Display the monthly payment and the total amount paid over the life of the loan, in Indian Rupees (₹).
Define the class LoanAmortizationCalculator with fields, an appropriate constructor, getter and setter methods, a toString method and business logic methods. Define the class LoanAmortizationCalculatorUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method and test the functionality of the utility class.

 */
package pack1;
import java.util.Scanner;

class LoanAmortizationCalculation {
    private double principalAmount;
    private float annualInterestRate;
    private int loanTerm;

    // Constructor
    public LoanAmortizationCalculation(double principalAmount, float annualInterestRate, int loanTerm) {
        this.principalAmount = principalAmount;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
    }

    // Getters and Setters
    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    // toString method to display loan details
    public String toString() {
        return "Loan Details: " +
               "Principal Amount: " + principalAmount + "  " +
               "Annual Interest Rate: " + annualInterestRate + "  " +
               "Loan Term: " + loanTerm + " years\n";
    }
}

class LoanUtil {
    LoanAmortizationCalculation lt = new LoanAmortizationCalculation(0d, 0.0f, 0);
    Scanner sc = new Scanner(System.in);  

   
    public void acceptRecord() {
        System.out.println("Enter the principal amount:");
        lt.setPrincipalAmount(sc.nextDouble());

        System.out.println("Enter the annual interest rate:");
        lt.setAnnualInterestRate(sc.nextFloat());

        System.out.println("Enter the loan term in years:");
        lt.setLoanTerm(sc.nextInt());
    }

  
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = (lt.getAnnualInterestRate() / 12) / 100;
        int numberOfMonths = lt.getLoanTerm() * 12;

        double monthlyPayment = lt.getPrincipalAmount() *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

        return monthlyPayment;
    }

    
    public void printRecord() {
        System.out.println(lt.toString());

        double monthlyPayment = calculateMonthlyPayment();
        double totalAmountPaid = monthlyPayment * lt.getLoanTerm() * 12;

        System.out.printf("Monthly Payment: ₹%.2f\n", monthlyPayment);
        System.out.printf("Total Amount to be Paid over the Loan Term: ₹%.2f\n", totalAmountPaid);
    }

   
    public int menu() {
        System.out.println("0. Exit");
        System.out.println("1. Accept Record");
        System.out.println("2. Print Record");
        System.out.println("Enter choice: ");
        return sc.nextInt();
    }
}

public class LoanMain {
    public static void main(String[] args) {
        LoanUtil l = new LoanUtil();
        int choice;

        while((choice = l.menu()) != 0) {
            switch (choice) {
                case 1:
                    l.acceptRecord();
                    break;
                case 2:
                	 l.printRecord();
                    break;
             
   
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}


/* Output
 * 0. Exit
1. Accept Record
2. Print Record
Enter choice: 

1
Enter the principal amount:
50000
Enter the annual interest rate:
12
Enter the loan term in years:
2
0. Exit
1. Accept Record
2. Print Record
Enter choice: 
2
Loan Details: Principal Amount: 50000.0  Annual Interest Rate: 12.0  Loan Term: 2 years

Monthly Payment: ₹2353.67
Total Amount to be Paid over the Loan Term: ₹56488.17
0. Exit
1. Accept Record
2. Print Record
Enter choice: 
0

 */


