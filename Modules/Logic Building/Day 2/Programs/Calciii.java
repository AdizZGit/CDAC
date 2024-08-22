import java.util.Scanner;
public class Calciii {
    public static void main(String args[]){
        int a,b,c,ch;
        System.out.println("Enter the numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter the operator(+,*,-,/):");
        ch=sc.next().charAt(0);
        switch(ch){
            case '+': c=a+b;
                    System.out.println("ADD : " +c);
                    break;
            case '*': c=a*b;
                    System.out.println("Mul : "+c);
                    break;
	    case '-': c=a-b;
	            System.out.println("Sub : "+c);
		    break;
	    case '/': 
			if(b!=0){
			c=a/b;
			System.out.println("Div : "+c);}
			else{
			System.out.println("Divide by zeroooo...");}
			break;

            default: 
                    System.out.println("invalid");
        }
    }
    
}
