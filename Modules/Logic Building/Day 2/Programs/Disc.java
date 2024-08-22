import java.util.*;
class Disc{ 
	public static void main(String args[]){
	System.out.println("Enter the price");
	Scanner sc= new Scanner(System.in);
	int price=sc.nextInt();
	System.out.println("Do you have membership card?");
	String s= sc.next();
	
	double discount1=0.2;
	double discount2=0.1;
	double discount3=0.05;
	double discountamount;
	double finalprice;
	
	if(price>=1000){
		if(s.equals("yes")){
			discountamount=price * (discount1+0.05);
			finalprice=price - discountamount;
			System.out.println("Discount Amount="+discountamount);
			System.out.println("Final price="+finalprice);
			
		}
		else{
		discountamount=price * discount1;
		finalprice=price - discountamount;
		System.out.println("Discount Amount="+discountamount);
	System.out.println("Final price="+finalprice);} }
	
	else if(price>=500 && price<=999){
		if(s.equals("yes")){
			discountamount=price * (discount2+0.05);
			finalprice=price - discountamount;
			System.out.println("Discount Amount="+discountamount);
			System.out.println("Final price="+finalprice);
			
		}
		else{
		discountamount=price * discount2;
		finalprice=price - discountamount;
		System.out.println("Discount Amount="+discountamount);
		System.out.println("Final price="+finalprice);}	
	}
	else{
		if(s.equals("yes")){
			discountamount=price * (discount3+0.05);
			finalprice=price - discountamount;
			System.out.println("Discount Amount="+discountamount);
			System.out.println("Final price="+finalprice);
			
		}
		else{
		discountamount=price * discount3;
		finalprice=price - discountamount;
		System.out.println("Discount Amount="+discountamount);
		System.out.println("Final price="+finalprice);}
		
		
	}
	
	}
	
	
	
	}




