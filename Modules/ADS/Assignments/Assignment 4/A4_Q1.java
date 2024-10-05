  import java.util.Scanner;
  public class A4_Q1{
     Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void ins(int d ){
        Node newnode=new Node(d);
        newnode.next=head;
        head=newnode;
    }
    void del(int d){
    Node temp=head;
    Node prev=null;
    if(temp!=null&&temp.data==d){
        head=temp.next;
        return;
    }
    while(temp!=null&&temp.data!=d){
        prev=temp;
        temp=temp.next;
    }
    if(temp==null||temp.next==null) return;
    prev.next=temp.next;
    }
    void dis(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node temp=head;
        System.out.print("List = [");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("]");
        System.out.println();
        
    }
    void search(int d){
        Node temp=head;
        while(temp!=null){
            if(temp.data==d){
                System.out.println("Found = True"); return;
            }
         
            temp=temp.next;
        }
           System.out.println("Found = False"); 
    }
    public static void main(String args[]){
    A4_Q1 k=new A4_Q1();
    Scanner sc=new Scanner(System.in);
    //  k.ins(23);
    //  k.ins(21);
    //  k.ins(20);
    //  k.dis();
     
    //  k.del(20);
    //  k.dis();
    int c;
    do{
        System.out.println("1 Inset");
          System.out.println("2 Display");
          System.out.println("3 Pop");
          System.out.println("4 Search");
          System.out.println("0 exit");
            System.out.println("Enter choice");
            c=sc.nextInt();
            switch(c){
                case 1: 
                    
                    int x=sc.nextInt();
                    k.ins(x);
                    System.out.println("Insert "+x);break;
                case 2:
                  
                    k.dis(); break;
                case 3:
                    
                    int t=sc.nextInt();
                    k.del(t);break;
                 case 4:
                 
                    int a=sc.nextInt();
                    k.search(a);break;
    
            }
    }while(c!=0);
    }
    
}