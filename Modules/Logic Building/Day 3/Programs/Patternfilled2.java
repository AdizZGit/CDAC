public class Patternfilled2{
		public static void main(String args[]){
			/*for (int i = 1; i<=6 ; i++){
					for(int j = 1; j<=i; j++){
					        if(i==2&&j==1||i==3&&j==1||i==4&&j==1||i==5&&j==1||i==6&&j==1){
							System.out.print(" ");
							}
							System.out.print("*");		
					}
					System.out.println();
				
			}
	
		}*/
		
		for(int i =1 ; i<=6; i++){
			for(int j=1; j<=i; j++){
				if(i>=2&& j==1){
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
}
}