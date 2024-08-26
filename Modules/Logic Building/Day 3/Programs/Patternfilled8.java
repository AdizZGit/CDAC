public class Patternfilled8{
	public static void main(String args[]){
	for(int i=5;i>=1;i--){
		for(int j=5;j>=i;j--){
			if(j<=4){System.out.print("*");}
			System.out.print(j);
		}
		System.out.println();
	}
	
	}

}