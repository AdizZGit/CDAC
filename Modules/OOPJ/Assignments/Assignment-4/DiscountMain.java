/*
 * 4. Discount Calculation for Retail Sales
Design a system to calculate the final price of an item after applying a discount. The system should:
1.	Accept the original price of an item and the discount percentage from the user.
2.	Calculate the discount amount and the final price using the following formulas:
o	Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
o	Final Price Calculation: finalPrice = originalPrice - discountAmount
3.	Display the discount amount and the final price of the item, in Indian Rupees (₹).
Define the class DiscountCalculator with fields, an appropriate constructor, getter and setter methods, a toString method, and business logic methods. Define the class DiscountCalculatorUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.


 */
package pack_disc;
import java.util.Scanner;
class Disc{
	private float discountAmount;
	private float originalPrice;
	public Disc(float discountAmount, float originalPrice) {
		this.discountAmount = discountAmount;
		this.originalPrice = originalPrice;
	}
	public float getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(float discountAmount) {
		this.discountAmount = discountAmount;
	}
	public float getoriginalPrice() {
		return originalPrice;
	}
	public void setoriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String toString() {
		 return "DiscountCalculator :" + "\n" + "Original Price: " 
	+ originalPrice + "\n" + "Discount Rate: " + discountAmount;
	}
	
}
	

class DiscUtil{
	Disc d=new Disc(0.0f,0.0f);
	public void accept() {
		System.out.println(d.toString());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Original Price :");
		d.setoriginalPrice(sc.nextFloat());
		System.out.println("Enter the Discount Percentage ");
		d.setDiscountAmount(sc.nextFloat());
		
	}
	public float[] cal() {
		float disc=d.getoriginalPrice()*(d.getDiscountAmount()/100);
		float finalrate=d.getoriginalPrice()-disc;
		return new float[]{disc, finalrate};
	}
	public void printRec() {
		float[] a=cal();
		float discount=a[0];
		float finalprice=a[1];
		System.out.println(d.toString());
		System.out.println("The Discount price :"+discount);
		System.out.println("The final price :"+finalprice);
	}
	 private static Scanner sc = new Scanner(System.in);
	public int menu() {
		System.out.println("1. Accept");
		
		System.out.println("2. Print");
		
		int c=sc.nextInt();
		
		 return c;	
	}
	public void close() {
		sc.close();
	}

}
public class DiscountMain {
public static void main(String[] args) {
	DiscUtil d=new DiscUtil();
	int x=d.menu();
	while(x!=0) {
		switch(x) {
		case 1:
			d.accept();
			break;
		case 2:
			d.printRec();
			break;
		
		default:
			System.out.println("Invalid choice! Please try again.");
			break;
		}
		x=d.menu();
		
		
	}
d.close();
}
}


/*Output
 * 1. Accept
2. Print
1
DiscountCalculator :
Original Price: 0.0
Discount Rate: 0.0
Enter the Original Price :
50000
Enter the Discount Percentage 
12
1. Accept
2. Print
2
DiscountCalculator :
Original Price: 50000.0
Discount Rate: 12.0
The Discount price :6000.0
The final price :44000.0
1. Accept
2. Print
0

 * 
 * 
 */
