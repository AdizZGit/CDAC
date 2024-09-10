
package pack_comp;
import java.util.Scanner;
class CoumpoundInterestCalculator{
	float principal;
	float annualInterestRate;
	int noOfTimes;
	int duration;
	
	public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter initial ammount:");
		principal=sc.nextFloat();
		
		System.out.println("Enter annual interest rate:");
		annualInterestRate=sc.nextFloat();
		
		System.out.println("Enter the no. of times interest compounded in year");
		noOfTimes=sc.nextInt();
		
		System.out.println("Enter the duration:");
		duration=sc.nextInt();
		sc.close();
	}
	
	public double calculteFutureRecord() {
		double ratePerCompound = annualInterestRate / noOfTimes / 100;
        int totalCompounds = noOfTimes * duration;
        double futureValue = principal * Math.pow(1 + ratePerCompound, totalCompounds);
        return futureValue;
        
	}
	public void printRecord() {
		double x=calculteFutureRecord();
		double totalInterest=x-principal;
		System.out.printf("Future value: %.2f \n",x);
		System.out.printf("Total Interest Earned: %.2f \n",totalInterest);
	}
	
}

public class Compound_Cal {
	public static void main(String[] args) {
		CoumpoundInterestCalculator c= new CoumpoundInterestCalculator();
		c.acceptRecord();
		c.printRecord();
	}

}
