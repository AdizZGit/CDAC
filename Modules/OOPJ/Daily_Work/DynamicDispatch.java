package org.ex.d4;
class one{
	private int x;
	private int y;
	
	public one() {
		this.x=-1;
		this.y=-1;
	}
	public one(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void disp() {
		System.out.println("X is :"+this.x);
		System.out.println("Y is :"+this.y);
		
	}
	
}
class two extends one{
	private int z=-1;
	public two(){
		
	}
	public two(int x,int y,int z) {
		super(x,y);
		this.z=z;
	}
	

	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public void disp() {
		super.disp();
		System.out.println("Z is :"+this.z);
	}
}
public class DynamicDispatch {
public static void main(String[] args) {
	//two t = new two(14,44,55);
	//	one t=new one(14,55);
	one t=new two();
	t.disp();
}
}
