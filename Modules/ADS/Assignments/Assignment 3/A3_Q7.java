// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class A3_Q7 {
    final static int max=10;
    int front=-1;
    int rear=-1;
    int arr[]=new int[max];
    
    boolean isEmpty(){
        return(front==-1);
    }
    boolean isFull(){
        return ((rear+1)%max == front);
    }
    void enq(int x){
        if(isFull()){
            System.out.println("Full");
        }
        else{
            if(front == -1){
                front++;
            }
            rear=rear+1%max;
             arr[rear]=x;
            System.out.println("Enq :" +x);
            return;
        }
    }
    void deq(){
        if(isEmpty()){
            System.out.println("Empty");
        }
        else{
            int x=arr[front];
            System.out.println("Deq : "+x);
            if(front==rear){
                front=-1;
                rear=-1;
            }
            front=front+1%max;
        }
    }
    void dis(){
        int d=front;
        while(d!=rear){
            System.out.println(arr[d]+" ");
            d=d+1%max;
        }
        System.out.println(arr[d]+" ");
    }
    public static void main(String[] args) {
       A3_Q7 c=new A3_Q7();
        c.enq(12);
        c.enq(4);
        c.enq(5);
        
        c.dis();
        
        c.deq();
        c.dis();
    }
}