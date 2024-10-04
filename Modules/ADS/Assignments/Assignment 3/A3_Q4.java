/*
4. Evaluate a postfix expression using a stack.
•	Test Case 1:
Input: "5 3 + 2 *"
Output: 16
•	Test Case 2:
Input: "4 5 * 6 /"
Output: 3
*/
import java.util.Stack;
import java.util.*;

public class A3_Q4{
	static int postfixeval(String str){
	Stack<Integer>stk=new Stack<>();
	for( int i=0;i<str.length();i++){
	char c=str.charAt(i);
	
	if(c==' '){continue;}
	if(c>='0'&&c<='9'){
		stk.push(c -'0');///// char to number
	}
	else{
		int op2=stk.pop();///pop if operator
		int op1=stk.pop();
		
		switch(c){
			case '+':
			stk.push(op1+op2);break;
			
			case '-':
			stk.push(op1-op2);break;
			
			case '*':
			stk.push(op1*op2);break;
			
			case '/':
			stk.push(op1/op2);break;
			 
			case '^':
			stk.push((int)Math.pow(op1,op2));break;
			
		}
		
	}
	}return stk.peek();
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(postfixeval(str));
	}
}