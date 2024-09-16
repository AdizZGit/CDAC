package pack_1;
public class Q4 {

    public static void main(String[] args) {
        int n = 10;

        double d = n;
        System.out.println("Widening conversion from int to double: " + d);

        
        float f = n;
        System.out.println("Widening conversion from int to float: " + f);

        
        String s = Integer.toString(n);
        System.out.println("Conversion from int to String: " + s);

      
        boolean b = (n != 0);
        System.out.println("Conversion from int to boolean (non-zero means true): " + b);
    }
}

