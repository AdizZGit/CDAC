public class Patternfilled7 {
    public static void main(String[] args) {
    for (int i=1;i<=5;i++){
        for (int j=1;j<=i;j++){
            if(j>=2){
                System.out.print("*");
            }
            System.out.print(j);
        }
        System.out.println();
    }
    }
}