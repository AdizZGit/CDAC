class Sum{
    public void m1(int a, float b){
        float sum = a+b;
        System.out.println(sum);
    }
    public void m1(float a, int b){
        float sum = a+b;
        System.out.println(sum);
    }
    public void m1(int a, int b, int c){
        int sum = a+b+c;
        System.out.println(sum);
    }
}

public class MethodOverload {
   public static void main(String[] args) {
    Sum s=new Sum();
    s.m1(12 , 2.1f);
    s.m1(2.1f,12);
    s.m1(2,2,2);
    
   } 
}
