class PrimDT {
//Default Values of Primitive Types Declare variables of each primitive 
//type as fields of a class and check their default values. (Note: Default values depend on whether the variables are instance variables or static variables).
    
    byte a;
    char b;
    short c;
    boolean d;
    int e;
    float f;
    double g;
    long h;

    //static
   static byte aa;  static char bb;  static short cc ; 
   static boolean dd ; static int ee ; 
   static float ff ; static double gg ; static long hh; 

}
public class Q9_3 {

    public static void main(String[] args) {
        PrimDT p = new PrimDT();
        System.out.println("Non static byte :"+p.a);
        System.out.println("Non static char: '" + p.b + "'");
        System.out.println("Non static short :"+p.c);
        System.out.println("Non static boolean :"+p.d);
        System.out.println("Non static int :"+p.e);
        System.out.println("Non static float :"+p.f);
        System.out.println("Non static double :"+p.g);
        System.out.println("Non static long :"+p.h);

 
 
        System.out.println("Static byte :"+PrimDT.aa);
        System.out.println("Static char: '" + p.b + "'");
        System.out.println("Static short : "+PrimDT.cc);
        System.out.println("Static boolean :"+PrimDT.dd);
        System.out.println("Static int :"+PrimDT.ee);
        System.out.println("Static float :"+PrimDT.ff);
        System.out.println("Static double :"+PrimDT.gg);
        System.out.println("Static long :"+PrimDT.hh);
    }
}
/* OUtput
 * PS D:\OOPJ> javac Q9_3.java
PS D:\OOPJ> java Q9_3      
Non static byte :0
Non static char: ''
Non static short :0
Non static boolean :false
Non static int :0
Non static float :0.0
Non static double :0.0
Non static long :0
Static byte :0
Static char: ''
Static short : 0
Static boolean :false
Static int :0
Static float :0.0
Static double :0.0
Static long :0
 */