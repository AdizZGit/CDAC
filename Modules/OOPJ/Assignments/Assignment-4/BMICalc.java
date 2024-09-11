/*3. BMI (Body Mass Index) Tracker
Create a system to calculate and classify Body Mass Index (BMI). The system should:
1.	Accept weight (in kilograms) and height (in meters) from the user.
2.	Calculate the BMI using the formula:
o	BMI Calculation: BMI = weight / (height * height)
3.	Classify the BMI into one of the following categories:
o	Underweight: BMI < 18.5
o	Normal weight: 18.5 ≤ BMI < 24.9
o	Overweight: 25 ≤ BMI < 29.9
o	Obese: BMI ≥ 30
4.	Display the BMI value and its classification.
Define the class BMITracker with fields, an appropriate constructor, getter and setter methods, a toString method, and business 
logic methods. Define the class BMITrackerUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a 
main method to test the functionality of the utility class.

 * 
 */


package pack1;
import java.util.Scanner;
class BMITracker {
    private double weight;
    private double height;

    public BMITracker(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    // Default constructor
    public BMITracker() {
      
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateBMI() {
//        if (height <= 0) {
//            throw new IllegalArgumentException("Height must be greater than 0");
//        }
        return weight / (height * height);
    }

    public String classifyBMI() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}

class BMITrackerUtil {
    private BMITracker bmiTracker;

    // Constructor with parameters
    public BMITrackerUtil(double weight, double height) {
        this.bmiTracker = new BMITracker(weight, height);
    }

    // Default constructor
    public BMITrackerUtil() {
        this.bmiTracker = new BMITracker();
    }

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (in kilograms): ");
        double weight = scanner.nextDouble();
        bmiTracker.setWeight(weight);

        System.out.print("Enter height (in meters): ");
        double height = scanner.nextDouble();
        bmiTracker.setHeight(height);
    }

    public void printRecord() {
        if (bmiTracker != null) {
            double bmi = bmiTracker.calculateBMI();
            String classification = bmiTracker.classifyBMI();

            System.out.printf("BMI: %.2f - %s%n", bmi, classification);
        } else {
            System.out.println("No BMI details available.");
        }
    }

    public void menuList() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Enter BMI Details");
            System.out.println("2. Display BMI Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    acceptRecord();
                    break;
                case 2:
                    printRecord();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);
    }
}


public class BMICalc {
    public static void main(String[] args) {
        BMITrackerUtil util = new BMITrackerUtil();
        util.menuList();
    }
}


/* output
 * 1. Enter BMI Details
2. Display BMI Details
3. Exit
Enter your choice: 1
Enter weight (in kilograms): 180
Enter height (in meters): 2.1

1. Enter BMI Details
2. Display BMI Details
3. Exit
Enter your choice: 2
BMI: 40.82 - Obese

1. Enter BMI Details
2. Display BMI Details
3. Exit
Enter your choice: 3
Exiting...
 * */

