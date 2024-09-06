class WideNarrow {
    public static void main(String[] args) {
       int num=10;
       System.out.println(num);
       byte b=1;
       System.out.println(b);
       float f=23.44f;
       System.out.println(f);
       
       double num2=num;
       System.out.println("Widening " + num2);
       
       int num3 = b;
       System.out.println("Widening " +num3);
       
       double num4= f;
       System.out.println("Widening " +num4);

       float f1=34.34f;
       System.out.println(f1);

       int b2=(int)f1;
       System.out.println("Narrowing "+b2);
    }
}