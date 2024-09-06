class BoxUnbox {

    public static void main(String[] args) {
    //Primitive Datatype to Non-primitive Datatype -->Boxing//Integer.toString(),String.valueOf()
    int num1=10;
    float f=10.343f;
    byte b=23;
    String s1=Integer.toString(num1);
    System.out.println("Box "+s1);
    
    String s2=Float.toString(f);
    System.out.println("Box "+s2);
     
    String s3=String.valueOf(b);
    System.out.println("Box "+s3);

    //Non-primitive Datatype to Primitive Datatype --->Unbox//Integer.parseInt()
        String s4="234";
        int n1=Integer.parseInt(s4);
        System.out.println(n1);

       float f2=Float.parseFloat(s4);
       System.out.println(f2);
       
    }
}