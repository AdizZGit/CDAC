import java.util.Scanner;

class A3_Q14 {
    final static int max = 10;
    int top;
    int arr[] = new int[max];
    Stack minStack; // Stack to keep track of minimum values

    A3_Q14() {
        top = -1;
        minStack = new Stack(); // Create a new stack for minimums
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public boolean push(int x) {
        if (top >= (max - 1)) {
            System.out.println("Overflow");
            return false;
        }
        arr[++top] = x;

        // Push onto minStack if it is null or less than the peek
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
        return true;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Underflow");
            return 0;
        }
        int poppedValue = arr[top--];

        // Pop from minStack if the popped value is the minimum
        if (poppedValue == minStack.peek()) {
            minStack.pop();
        }
        return poppedValue;
    }

    int peek() {
        return ((top < 0) ? 0 : arr[top]);
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty Stack: ");
        } else {
            System.out.println("Stack elements are: ");
            show(top);
        }
    }

    void show(int index) {
        if (index < 0) // Base condition
            return;
        System.out.println(arr[index] + " ");
        show(index - 1); // Recursive call
    }

    // Method to get the minimum element
    int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1; // Indicate that the stack is empty
        }
        return minStack.peek(); // Return the minimum value
    }
    

    public static void main(String args[]) {
        A3_Q14 s = new A3_Q14();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Get Min");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value to push: ");
                    int value = sc.nextInt();
                    s.push(value);
                    break;
                case 2:
                    System.out.println("Popped value: " + s.pop());
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                   /* if (!s.minStack.isEmpty()) {
                        System.out.println("Min = " + s.getMin());
                    } else {
                        System.out.println("Stack is empty, no minimum value.");
                    }*/
					 System.out.println("Min = " + s.getMin());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
