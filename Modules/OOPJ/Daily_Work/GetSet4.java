package pack_getset;
import java.util.Scanner;

class Emp14 {
    private String name;
    private int sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}

class EEmputil {
    private Emp14 u = new Emp14();
    private static Scanner sc = new Scanner(System.in);

    public void acceptRecord() {
        System.out.println("Enter name");
        u.setName(sc.next());

        System.out.println("Enter salary");
        u.setSal(sc.nextInt());
    }

    public void disp() {
        System.out.println("The name is " + u.getName());
        System.out.println("The salary is " + u.getSal());
    }

    public static int menu() {
        System.out.println("0. Exit");
        System.out.println("1. Enter Name and Salary");
        System.out.println("2. Display Name and Salary");
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }
}

public class GetSet4 {
    public static void main(String[] args) {
        EEmputil u = new EEmputil();
        int x;

        do {
            x = u.menu();
            switch (x) {
                case 1:
                    u.acceptRecord();
                    break;

                case 2:
                    u.disp();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (x != 0);
    }
}
