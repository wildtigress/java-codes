import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers for addition:");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    int sum = add(num1, num2);
                    System.out.println("Result of addition: " + sum);
                    break;
                case 2:
                    System.out.println("Enter two numbers for subtraction:");
                    int num3 = scanner.nextInt();
                    int num4 = scanner.nextInt();
                    int difference = subtract(num3, num4);
                    System.out.println("Result of subtraction: " + difference);
                    break;
                case 3:
                    System.out.println("Exiting the program. ");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static int add(int a,int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }
}