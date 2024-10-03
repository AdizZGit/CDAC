public class A3_Q1{
	final static int max=10; 
	int top=-1;
	int arr[]=new int[max];
	
	public boolean isEmpty(){
		return(top<0);	
	}
	public boolean isFull(){
		return(top>=max-1);
	}
	public boolean push(int x){
		if(isFull()){
			System.out.println("Stack is full");
			return false;
		}
		else{
		arr[++top]=x;
		System.out.println("Push "+x);
		return true;
		}
	}
	public boolean pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return false;
		}
		System.out.println("pop "+arr[top--]);
		return true;
	}
	void dis(){
		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		else{
			System.out.print("Stack elements are :");
			show(top);
		}
	}
	void show(int index){
		if(index<0) return;
		else{
			System.out.print(arr[index]+" ");
			show(index -1);
		}
	}
	public static void main(String args[]){
	 A3_Q1 s=new A3_Q1();
        // s.push(11);
        // s.push(12);
        // s.push(13);
        s.push(10);
        s.push(20);
      //System.out.println("pop "+s.pop());
	  
      s.push(15);
	  s.pop();
        s.dis();
}
}