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
