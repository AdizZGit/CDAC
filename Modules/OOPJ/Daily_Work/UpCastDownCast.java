package org.ex.d3;
import java.util.*;
class Parent{
	private int n1;
	private int n2;
	
	public Parent() {
		this.n1=-1;
		this.n2=-1;
	}
	public Parent(int n1,int n2) {
		this.n1=n1;
		this.n2=n2;
	}
	
	public void setN1(int n1) {
		this.n1=n1;
		
	}
	public int getN1() {
		return n1;
	}
	public void setN2(int n2) {
		this.n2=n2;
	}
	public int getN2() {
		return n2;
	}
	public void disp() {
		
		System.out.println("N1 ="+this.getN1());
		System.out.println("N2 ="+this.getN2());
		
	
	}
}
class Child extends Parent{
	private int n3;
	public Child() {
		this.n3=-2;
	}
	public void setN3(int n3) {
		this.n3=n3;
	}
	public int getN3() {
		return n3;
	}
	public Child(int n1,int n2,int n3) {
		super(n1,n2);
		this.n3=n3;
	}
	public void disp() {
		super.disp();
		System.out.println("N3 ="+this.n3);
	}
}

public class UpCastDownCast {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Parent p=new Child();//////////////////////Upcast
		System.out.print("Enter the valu of N1 :");
		p.setN1(sc.nextInt());
		System.out.print("Enter the valu of N2 :");
		p.setN2(sc.nextInt());
		System.out.print("Enter the valu of N3 :");
		Child c=(Child)p;////////////////////////downCast
		c.setN3(sc.nextInt());
		p.disp();
	}
}
