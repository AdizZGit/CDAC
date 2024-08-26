public class Patternfilled4{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=n-i;j++)//spacesssss
			{
				System.out.print(" ");}
			for (int k=1;k<=2*i-1;k++){
				System.out.print("*");
		}
		System.out.println();
	}
	}
}