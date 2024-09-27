import java.util.*;
class StackStringRev{
	final static int max=10;
	int top;
	char arr[]=new char[max];
	StackStringRev(){
	top=-1;
	}
	////Underflowwwwwwww conditionnnn
    public boolean isEmpty(){
		return (top<0);		
	}
	//////Insertionnnnnnnnnnnnnnnnnnnnnnn
	public boolean push(char x){
		if(top >= (max-1)){
			System.out.println("Overflow");
			return false;
		}
		arr[++top]=x;
		return true;
	}
	public char pop(){
		if(top<0){
			System.out.println("underflow");
			return 0;
		}
		return arr[top--];	
	}
	char peek(){
		 return ((top < 0) ? '\0' : arr[top]);	
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Empty Stack: ");
		}
		else{
			System.out.println(" Stack elements are: ");
			show(top);
		}
		
	}
	void show(int index){
		if(index <0)//////base conditionnnn
			return;
		System.out.println(arr[index]+" ");
		show(index -1);///////recursiveeeeeeee
	}
	
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        int length = input.length();

        // Create a stack of appropriate size
        StackStringRev stack = new StackStringRev();

        // Push all characters of the string into the stack
        for (int i = 0; i < length; i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters from the stack and form the reversed string
        StringBuilder x = new StringBuilder();
        while (!stack.isEmpty()) {
            x.append(stack.pop());
        }

        // Display the reversed string
        System.out.println("Reversed string: " + x);

        sc.close();
	}
	
}
