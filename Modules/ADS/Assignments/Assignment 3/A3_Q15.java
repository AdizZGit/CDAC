class A3_Q15{
	 static int max;
	int rear=-1;
	int front=-1;
	int arr[];
	
	CircularQ(int size){
	    this.max=size;
	    arr=new int[max];
	}
	public boolean isEmpty(){
		return (front == -1);
	}
	public boolean isFull(){
		return((rear+1)%max==front);
	}
	public void enq(int x){
		if(isFull()){
			System.out.println("Queue is fulllllllllll");
		}
		else{
			if(front == -1){
				front++;
			}
			rear=(rear+1)% max;////////rear++
			arr[rear]=x;
			System.out.println("Inserted : "+x);
		}
	}
	public int deq(){
		if(isEmpty()){
			System.out.println("Queue is emptyyyyyyy");
			return -1;
		}
		else{
			int y = arr[front];
			System.out.println("Deleted :");
			if(front == rear){
				front=-1;
				rear=-1;
			}
			else{
				front=(front+1)%max;
			}
			System.out.println();
			return y;
		}
		
		
	}
	public void dis(){
		if(isEmpty()){
			System.out.println("Queue is emptyyyyyyy");
		}
		else{
			int d=front;
			while(d!=rear){
				System.out.println(arr[d] + "  ");
				d=(d+1)%max;////////////one by one in circular manner
			}
			System.out.println(arr[rear]);
		}
	}
	public static void main(String args[]){
        CircularQ c=new CircularQ(4);
        c.enq(1);
        c.enq(2);
        c.enq(3);
        c.enq(4);
        System.out.println("isFull() ?"+c.isFull());
       CircularQ c2=new CircularQ(3);
         c2.enq(5);
        c2.enq(6);
         c.enq(7);
        System.out.println("isEmpty() ?"+c.isEmpty());
    }
}