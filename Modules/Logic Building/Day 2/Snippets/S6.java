/*public class S6 {     
	public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) {        
	display();         
	display(5); 
    } 
} 
/* error :non-static method display() cannot be referenced from a static context
        display();
        ^
 error: non-static method display(int) cannot be referenced from a static context
        display(5); 
		we need to create the object of class*/
public class S6 {     
public void display() { 
       System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) {        
	S6 s = new S6();
	s.display();         
	s.display(5); 
    } 
}

/*
public class Main {     
	public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[5]); 
    } 
} 

error : ArrayIndexOutOfBoundsException */


/* 
public class Main { 
    public static void main(String args[]){
        while (true) { 
            System.out.println("Infinite Loop"); 
            break;
        } 
    } 
}
Infinite loop can be counter by using break statement */


/*
public class Main {     
	public static void main(String[] args) { 
        String str = null; 
        System.out.println(str.length()); 
    } 
} 
error : NullPointerException
it can be solved using by assigining "null" to str
in that case the output will be 4 */