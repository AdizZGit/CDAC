class A3_6{
    int max=10;
    int front=-1;
    int rear=-1;
    int arr[]=new int [max];
    
    boolean isEmpty(){
        return ( front ==-1);
    }
    boolean isFull(){
        return (rear==max-1);
    }
    void enq(int x){
        if(isFull()){
            System.out.println("Full");
        }
        else{
            if(front==-1){
                front++;
            }
            rear++;
            arr[rear]=x;
            System.out.println("Enq "+x);
        }
    }
    void deq(){
        if(isEmpty()){
            System.out.println("Empty");
        }
        else{
            int x=arr[front];
            System.out.println("Deq "+x);
            if(front>rear){
                front=-1;
                rear=-1;
            }
            front++;
        }
    }
    void dis(){
        System.out.print("Queue: ");
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
            
        }
    }
   public  static void main(String args[]) {
       A3_6 s=new A3_6();
       s.enq(5);
       s.enq(10);
      
       s.deq();
       s.dis();
   }
}