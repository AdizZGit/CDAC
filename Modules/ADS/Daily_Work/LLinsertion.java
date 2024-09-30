public class LLinsertion{
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	void insBeg(int d){
		Node newnode=new Node(d);
		newnode.next=head;
		head=newnode;
	}
	void append(int d){
		Node newnode=new Node(d);
		if(head==null){
			head=newnode; return;
		}
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newnode;
	}
	void insAt(Node prev,int d){
		Node newnode=new Node(d);
		newnode.next=prev.next;
		prev.next=newnode;
	}
	void dis(){
		if(head==null){
			System.out.println("Empty");
			return;
		}
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.print("NULL");
	}
	public static void main(String args[]){
		LLinsertion l=new LLinsertion();
		System.out.print("Already-----------------\n");
		head=new Node(01);
		Node one=new Node(02);
		head.next=one;
		l.dis();
		System.out.print("\nInsert at begg-----------------\n");
		l.insBeg(11);
		l.dis();
		
		System.out.print("\nInsert at enddd-----------------\n");
		l.append(55);
		l.dis();
		
		System.out.print("\nInsert Anywhere-----------------\n");
		l.insAt(head,101);
		l.insAt(head.next,201);
		
		l.dis();

	}
	
}