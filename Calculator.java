import java.util.Scanner;

class Calculator {

    public static void main(String args[]) {
        int n, m;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        m = input.nextInt();

        System.out.println("Enter choice:");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println(n + m);
                System.out.println("You chose addition.");
                break;

            case 2:
                System.out.println(n - m);
                System.out.println("You chose subtraction.");
                break;

            case 3:
                System.out.println(n * m);
                System.out.println("You chose multiplication.");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
