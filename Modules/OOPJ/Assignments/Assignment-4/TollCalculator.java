/*5. Toll Booth Revenue Management
Develop a system to simulate a toll booth for collecting revenue. The system should:
1.	Allow the user to set toll rates for different vehicle types: Car, Truck, and Motorcycle.
2.	Accept the number of vehicles of each type passing through the toll booth.
3.	Calculate the total revenue based on the toll rates and number of vehicles.
4.	Display the total number of vehicles and the total revenue collected, in Indian Rupees (₹).
•	Toll Rate Examples:
o	Car: ₹50.00
o	Truck: ₹100.00
o	Motorcycle: ₹30.00
Define the class TollBoothRevenueManager with fields, an appropriate constructor, getter and setter methods,
 a toString method, and business logic methods. Define the class TollBoothRevenueManagerUtil with methods acceptRecord, 
 printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.
 * 
 * 
 */

package pack_new_toll;
import java.util.Scanner;

class TollManager {
    private int carcount;
    private int truckcount;
    private int bikecount;
    
    private int carrate;
    private int truckrate;
    private int bikerate;
    
    // Constructor
    public TollManager(int carcount, int truckcount, int bikecount, int carrate, int truckrate, int bikerate) {
        this.carcount = carcount;
        this.truckcount = truckcount;
        this.bikecount = bikecount;
        this.carrate = carrate;
        this.truckrate = truckrate;
        this.bikerate = bikerate;
    }

    // Getters and Setters
    public int getCarcount() {
        return carcount;
    }

    public void setCarcount(int carcount) {
        this.carcount = carcount;
    }

    public int getTruckcount() {
        return truckcount;
    }

    public void setTruckcount(int truckcount) {
        this.truckcount = truckcount;
    }

    public int getBikecount() {
        return bikecount;
    }

    public void setBikecount(int bikecount) {
        this.bikecount = bikecount;
    }

    public int getCarrate() {
        return carrate;
    }

    public void setCarrate(int carrate) {
        this.carrate = carrate;
    }

    public int getTruckrate() {
        return truckrate;
    }

    public void setTruckrate(int truckrate) {
        this.truckrate = truckrate;
    }

    public int getBikerate() {
        return bikerate;
    }

    public void setBikerate(int bikerate) {
        this.bikerate = bikerate;
    }

    @Override
    public String toString() {
        return "TollManager [carcount=" + carcount + ", truckcount=" + truckcount + ", bikecount=" + bikecount
                + ", carrate=" + carrate + ", truckrate=" + truckrate + ", bikerate=" + bikerate + "]";
    }
}

class TollUtil {
    private static Scanner sc = new Scanner(System.in);
    TollManager tm = new TollManager(0, 0, 0, 0, 0, 0);
    
    // Accept record from user
    public void acceptRecord() {
        System.out.print("Enter the Car Rate: ");
        tm.setCarrate(sc.nextInt());
        System.out.print("Enter the Truck Rate: ");
        tm.setTruckrate(sc.nextInt());
        System.out.print("Enter the Bike Rate: ");
        tm.setBikerate(sc.nextInt());

        System.out.print("Enter the Car Count: ");
        tm.setCarcount(sc.nextInt());
        System.out.print("Enter the Truck Count: ");
        tm.setTruckcount(sc.nextInt());
        System.out.print("Enter the Bike Count: ");
        tm.setBikecount(sc.nextInt());
    }

    // Calculate toll revenue and count
    public int[] calculateToll() {
        int totalRevenue = (tm.getCarcount() * tm.getCarrate()) + (tm.getTruckcount() * tm.getTruckrate()) + (tm.getBikecount() * tm.getBikerate());
        int totalCount = tm.getCarcount() + tm.getTruckcount() + tm.getBikecount();
        return new int[]{totalRevenue, totalCount};
    }

    // Display total revenue and vehicle count
    public void show() {
        int[] result = calculateToll();
        System.out.println("Total Revenue: " + result[0]);
        System.out.println("Total Vehicle Count: " + result[1]);
    }

    // Display menu and return user choice
    public int menu() {
        System.out.println("0. Exit");
        System.out.println("1. Accept Record");
        System.out.println("2. Show Record");
        System.out.println("Enter choice: ");
        return sc.nextInt();
    }
}

public class TollCalculator {
    public static void main(String[] args) {
        TollUtil tollUtil = new TollUtil();
        int choice;
        while ((choice = tollUtil.menu()) != 0) {
            switch (choice) {
                case 1:
                    tollUtil.acceptRecord();
                    break;
                case 2:
                    tollUtil.show();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Exiting program.");
    }
}


/*Output
 * 0. Exit
1. Accept Record
2. Show Record
Enter choice: 
1
Enter the Car Rate: 50
Enter the Truck Rate: 100
Enter the Bike Rate: 20
Enter the Car Count: 1
Enter the Truck Count: 1
Enter the Bike Count: 1
0. Exit
1. Accept Record
2. Show Record
Enter choice: 
2
Total Revenue: 170
Total Vehicle Count: 3
0. Exit
1. Accept Record
2. Show Record
Enter choice: 
0
Exiting program.
 * 
 * 
 */
