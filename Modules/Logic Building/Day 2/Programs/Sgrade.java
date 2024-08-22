import java.util.*;
class Sgrade{
		public static void main(String[] args){
		System.out.println("Enter the marks :");
		Scanner sc = new Scanner (System.in);
		int x= sc.nextInt();
		if(x>=90){
		System.out.println("Grade A");}
		else if(x>=80 && x<90){
		System.out.println("Grade B");}
		else if(x>=70 && x<80){
		System.out.println("Grade C");}
		else if(x>=60 && x<70){
		System.out.println("Grade D");}
		else{
		System.out.println("Grade F");}
		
		
		}
		}