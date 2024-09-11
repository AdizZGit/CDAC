package pack_compound;

import java.util.Scanner;

class CompoundInterestCalculator {
    private float principal;
    private float annualInterestRate;
    private int noOfTimes;
    private int duration;


    public CompoundInterestCalculator(float principal, float annualInterestRate, int noOfTimes, int duration) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.noOfTimes = noOfTimes;
        this.duration = duration;
    }


    public float getPrincipal() {
        return principal;
    }

    public void setPrincipal(float principal) {
        this.principal = principal;
    }

    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNoOfTimes() {
        return noOfTimes;
    }

    public void setNoOfTimes(int noOfTimes) {
        this.noOfTimes = noOfTimes;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "Compound Interest Calculator Details:\n" +
               "Principal Amount: " + principal + "\n" +
               "Annual Interest Rate: " + annualInterestRate + "%\n" +
               "Number of Times Compounded per Year: " + noOfTimes + "\n" +
               "Duration: " + duration + " years\n";
    }
}

class Methods {
    private CompoundInterestCalculator ci;
    private Scanner sc;


    public Methods() {
        ci = new CompoundInterestCalculator(0.0f, 0.0f, 0, 0);
        sc = new Scanner(System.in);     }

    public void acceptRecords() {
        System.out.println("Enter the principal amount:");
        ci.setPrincipal(sc.nextFloat());
        System.out.println("Enter the annual interest rate (in %):");
        ci.setAnnualInterestRate(sc.nextFloat());
        System.out.println("Enter the number of times interest is compounded per year:");
        ci.setNoOfTimes(sc.nextInt());
        System.out.println("Enter the duration (in years):");
        ci.setDuration(sc.nextInt());
    }

    public double calculateFutureRecord() {
        double ratePerCompound = ci.getAnnualInterestRate() / ci.getNoOfTimes() / 100;
        int totalCompounds = ci.getNoOfTimes() * ci.getDuration();
        return ci.getPrincipal() * Math.pow(1 + ratePerCompound, totalCompounds);
    }

    public void printRecord() {
        System.out.println(ci.toString());
        double futureValue = calculateFutureRecord();
        double totalInterest = futureValue - ci.getPrincipal();
        System.out.printf("Future Value: %.2f\n", futureValue);
        System.out.printf("Total Interest Earned: %.2f\n", totalInterest);
    }

    public int menu() {
        System.out.println("0. Exit");
        System.out.println("1. Accept Record");
        System.out.println("2. Print Record");
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }
}

public class Comp_Main {
    public static void main(String[] args) {
        Methods m = new Methods();
        int choice;

        while ((choice = m.menu()) != 0) {
            switch (choice) {
                case 1:
                    m.acceptRecords();
                    break;
                case 2:
                    m.printRecord();
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}




/* 0. Exit
1. Accept Record
2. Print Record
Enter choice: 1
Enter the principal amount:
50000
Enter the annual interest rate (in %):
12.5
Enter the number of times interest is compounded per year:
2
Enter the duration (in years):
2
0. Exit
1. Accept Record
2. Print Record
Enter choice: 2
Compound Interest Calculator Details:
Principal Amount: 50000.0
Annual Interest Rate: 12.5%
Number of Times Compounded per Year: 2
Duration: 2 years

Future Value: 63721.47
Total Interest Earned: 13721.47
0. Exit
1. Accept Record
2. Print Record
Enter choice: 0

 */
 

