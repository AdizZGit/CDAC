class A4_Q2{
    Node head;
    static class Node{
        int data;
        Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    }
    void ins(int x){
        Node newnode=new Node(x);
        newnode.next=head;
       head=newnode;
    }
    void dis(){
        if(head==null){
              System.out.print("empty"); return;
        }
        Node temp=head;
        System.out.print("List = [");
        while(temp!=null){
            System.out.print(temp.data);
               if (temp.next != null) {  // Check if there's a next node
                System.out.print(",");  // Print comma only if it's not the last element
            }
            temp=temp.next;
        }
         System.out.print("]");
        System.out.println();
    }
    Node rev(Node head){
        Node temp=head;
        Node front=null;
        Node prev=null;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public static void main(String args[]){
        A4_Q2 l=new A4_Q2();
        l.ins(1);
        l.ins(2);
         l.ins(3);
          l.ins(4);
           l.ins(5);
        
        l.dis();
      l. head=l.rev(l.head);
        
        l.dis();
        
        A4_Q2 l2=new A4_Q2();
        l2.ins(10);
        l2.ins(20);
        l2.ins(30);
          
        l2.dis();
      l2. head=l2.rev(l2.head);
        
        l2.dis();
    }
}