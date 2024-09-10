/*. Loan Amortization Calculator
Implement a system to calculate and display the monthly payments for a mortgage loan. The system should:
1.	Accept the principal amount (loan amount), annual interest rate, and loan term (in years) from the user.
2.	Calculate the monthly payment using the standard mortgage formula:
o	Monthly Payment Calculation:
	monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
	Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths = loanTerm * 12
	Note: Here ^ means power and to find it you can use Math.pow( ) method
3.	Display the monthly payment and the total amount paid over the life of the loan, in Indian Rupees (₹).
*/
package pack1;
import java.util.Scanner;

class LoanAmortizationCalculaton {
    double principalamount;
    float annualinterestrate;
    int loanterm;

   
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        principalamount = sc.nextDouble();

        System.out.println("Enter Annual Interest Rate: ");
        annualinterestrate = sc.nextFloat();

        System.out.println("Enter the Loan Term (in years): ");
        loanterm = sc.nextInt();
        sc.close();
    }

   
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = (annualinterestrate / 12) / 100;
        int numberOfMonths = loanterm * 12;
        double monthlyPayment = principalamount * 
                                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / 
                                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

        return monthlyPayment;
    }

  
    public void printRecord() {
        double monthlyPayment = calculateMonthlyPayment();
        double totalAmountPaid = monthlyPayment * loanterm * 12;

        System.out.printf("Monthly Payment: ₹%.2f\n", monthlyPayment);
        System.out.printf("Total Amount to be Paid over the Loan Term: ₹%.2f\n", totalAmountPaid);
    }
}

public class Que1_3 {
    public static void main(String[] args) {
        LoanAmortizationCalculaton l = new LoanAmortizationCalculaton();
        l.acceptRecord();         
        l.printRecord();          
    }
}


/* Output 
Enter Principal Amount: 
54000
Enter Annual Interest Rate: 
12
Enter the Loan Term (in years): 
5
Monthly Payment: ₹1201.20
Total Amount to be Paid over the Loan Term: ₹72072.01
*/
