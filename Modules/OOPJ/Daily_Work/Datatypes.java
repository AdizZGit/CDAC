
class Datatypes {
    int x;
   static int y;
   float z;
   boolean a;
   byte b;
   char ch;
   long l;
   double d;
   short s;
    public static void main(String[] args) {
       //int num=10;
       //System.out.println(num);
       
       Datatypes s=new Datatypes();
       System.out.println("int def. value  "+s.x);
        System.out.println("Static int "+y);
        System.out.println("float def. value  "+s.z);
        System.out.println("boolean def. value  "+s.a);
        System.out.println("byte def. value  "+s.b);
        System.out.println("ch def. value  "+s.ch);
        System.out.println("long def. value  "+s.l);
        System.out.println("double def. value  "+s.d);
        System.out.println("short def. value  "+s.s);
       

        String s1=new String("Aditya");
        System.out.println(s1);

        String s2="Notme";
        System.out.println(s2);
       
    }
}