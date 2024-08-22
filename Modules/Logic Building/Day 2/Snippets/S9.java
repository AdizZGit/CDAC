/*public class S9 {     
	public static void main(String[] args) { 
	static void displayMessage() { 
            System.out.println("Message"); 
        } 
    } 
 we cannot define method inside another methods */
 
public class S9 {     
	public static void main(String[] args) { 
	 displayMessage();
        }
		static void displayMessage() { 
            System.out.println("Message");		
}}