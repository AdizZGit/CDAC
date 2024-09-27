class Stack{
	final static int max=10;
	int top;
	int arr[]=new int[max];
	Stack(){
	top=-1;
	}
	////Underflowwwwwwww conditionnnn
    public boolean isEmpty(){
		return (top<0);		
	}
	//////Insertionnnnnnnnnnnnnnnnnnnnnnn
	public boolean push(int x){
		if(top >= (max-1)){
			System.out.println("Overflow");
			return false;
		}
		arr[++top]=x;
		return true;
	}
	public int pop(){
		if(top<0){
			System.out.println("underflow");
			return 0;
		}
		return arr[top--];	
	}
	int peek(){
		return ((top<0) ? 0 : arr[top]);	
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
		Stack s=new Stack();
		System.out.println("after pushing");
		s.push(2);
		s.push(32);
		s.push(43);
		
		s.display();
		System.out.println("after popping");
		s.pop();
		s.display();
		
	}
	
}
