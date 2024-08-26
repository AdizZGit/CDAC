public class PrePost {
    public static void main(String[] args) {
     int a=10;
     int b=20;
     int c;
     c= ++a + b++;
     System.out.println("After pre-increment"+"  "+ a);
     System.out.println("After post-increment"+"  "+ b);
     System.out.println("After expression evaluation"+"  "+ c);
      }
}