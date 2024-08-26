public class Patternfilled9{
	public static void main(String args[]){
		for(int i=1; i<=9; i=i+2){
			for (int j=1; j<=i ;j=j+2){
				if(j>1){System.out.print("*");}
				System.out.print(j);
			}
			System.out.println();
		}
	
	}
}