package org.d1;
import java.util.Scanner;
class Student{
    private String name;
    private int id;
    public Student(){
        this("",0);
    }
    
    public Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public void show(){
        System.out.println("Name:"+getName());
         System.out.println("id:"+getId());
        
    }
}
class St extends Student{
    private int age;
    public St(){
        this("",0,0);
    }
    public St(String name,int id,int age){
        super(name,id);
        this.age=age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void show(){
        super.show();
        System.out.println("age :"+this.getAge());
    }
}
class Util{
   private St s;
   public Util(){
       s=new St();
   }
    
    public void accept(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name:");
    s.setName(sc.nextLine());
    // sc.nextLine();
    System.out.println("Enter id:");
    s.setId(sc.nextInt());
    System.out.println("Enter age:");
    s.setAge(sc.nextInt());
    sc.close();
}
public void show(){
    s.show();
}
}
public class Q4{
    public static void main(String args[]){
        Util e=new Util();
        e.accept();
        e.show();
        
    }
}

