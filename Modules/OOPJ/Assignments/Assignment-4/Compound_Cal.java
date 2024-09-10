/* 
Develop a system to compute the future value of an investment with compound interest. The system should:
1.	Accept the initial investment amount, annual interest rate, number of times the interest is compounded per year, and investment duration (in years) from the user.
2.	Calculate the future value of the investment using the formula:
o	Future Value Calculation:
	futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
o	Total Interest Earned: totalInterest = futureValue - principal
3.	Display the future value and the total interest earned, in Indian Rupees (₹).
Define the class CompoundInterestCalculator with fields, an appropriate constructor, getter and setter methods, a toString method and business logic methods. Define the class CompoundInterestCalculatorUtil with methods acceptRecord, printRecord.
Define the class Program with a main method to test the functionality of the utility class.

*/
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


/* 
Output
Enter initial ammount:
50000
Enter annual interest rate:
12.5
Enter the no. of times interest compounded in year
2
Enter the duration:
5
Future value: 91676.79 
Total Interest Earned: 41676.79 
*/
