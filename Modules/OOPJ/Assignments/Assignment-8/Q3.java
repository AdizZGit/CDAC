package org.d1;

class Animal {
	    private String name;

	    public Animal(String name) {
	        this.name = name;
	    }

	    
	    public String getName() {
	        return this.name;
	    }

	    
	    public void eat() {
	        System.out.println(this.getName() + " is cute and is eating something...");
	    }

	   
	    public void sleep() {
	        System.out.println(this.getName() + " is sleeping from 4 hours.");
	    }
	}
class Dog extends Animal {
	    private String dogName;


	    public Dog(String animalName, String dogName) {
	        super(animalName);  
	        this.dogName = dogName; 
	    }

	    
	    @Override
	    public void eat() {
	        super.eat(); 
	        System.out.println(this.dogName + " is eating bones.");
	    }

	    @Override
	    public void sleep() {
	        super.sleep(); 
	        System.out.println(this.dogName + " (dog) is sleeping.");
	    }
	}

public class Q3 {
	    public static void main(String[] args) {
	        
	        Dog g = new Dog("Crocodile", "Dog ");
	        g.eat();
	        g.sleep();
	    }
	}

