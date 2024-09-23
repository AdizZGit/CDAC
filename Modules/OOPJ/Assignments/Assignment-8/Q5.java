package org.d1;

class Veels {
 public void startEngine() {
     System.out.println("Starting the engine...");
 }

 public void stopEngine() {
     System.out.println("Stopping the engine...");
 }
}

class Car extends Veels {
 @Override
 public void startEngine() {
     System.out.println("Car engine is starting with a key turn...");
 }

 @Override
 public void stopEngine() {
     System.out.println("Car engine is stopping with a key turn...");
 }
}

class Motorcycle extends Veels {
 @Override
 public void startEngine() {
     System.out.println("Motorcycle engine is starting with a push button...");
 }

 @Override
 public void stopEngine() {
     System.out.println("Motorcycle engine is stopping with a push button...");
 }
}

public class Q5 {
 public static void main(String[] args) {
     
     Veels myCar = new Car();
     Veels myMotorcycle = new Motorcycle();

     
     System.out.println("Car:");
     myCar.startEngine();
     myCar.stopEngine();

     System.out.println("\nMotorcycle:");
     myMotorcycle.startEngine();
     myMotorcycle.stopEngine();
 }
}


