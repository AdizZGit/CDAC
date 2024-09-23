package org.d1;
class Vehicle{
     private String maker;
    private int Year;
    
    public Vehicle(){
        this("Def",-1);
    }
    public Vehicle(String maker, int Year){
       this.maker=maker;
        this.Year=Year;
    }
    public void show(){
        System.out.println("Maker :"+maker);
        System.out.println("Year :"+Year);
    }
    
    
}
class Driver extends Vehicle{
    String model;
    public Driver(){
    }
    public Driver(String maker,int Year,String model){
        super(maker,Year);
        this.model=model;
    
    }
    public void show(){
        super.show();
        System.out.println("Model :"+model);
    }
}
public class Q2{
    public static void main(String args[]){
        Vehicle m1=new Driver("FORD",1969,"MUSTANG");
        
        m1.show();

    }
}