package pack_6;

class Count {
	private static int instCount;
	static {
		instCount=0;
	}
	public Count() {
		instCount ++;
	}
	public static int getInstCount() {
		return instCount;
	}
	public static void setInstCount(int instCount) {
		Count.instCount = instCount;
	}
	@Override
	public String toString() {
        return "Current instance count is: " + getInstCount();
    }
	
	}
public class InstanceCount{
	public static void main(String[] args) {
		Count c=new Count();
		Count c1=new Count();
		Count c2=new Count();
		
		System.out.println(c.toString());
		
	}
}
