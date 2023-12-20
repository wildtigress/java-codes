import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    String name;
    int total = 0;
    int[] marks = new int[3];
    int midTerm, endTerm, ca;

    void get() {
        System.out.print("Enter the name of the student: ");
        name = sc.nextLine();
        System.out.println("Enter the marks of all subjects:");
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("Enter the marks of mid term, end term and ca:");
        midTerm = sc.nextInt();
        endTerm = sc.nextInt();
        ca = sc.nextInt();
        calculateTotal();
    }

    void calculateTotal() {
        int max1 = Math.max(marks[0], Math.max(marks[1], marks[2]));
        int max2 = Math.max(Math.min(marks[0], marks[1]), Math.min(Math.max(marks[0], marks[1]), marks[2]));
        total = max1 + max2;
        double weightedAverage = 0.2 * midTerm + 0.3 * endTerm + 0.25 * ca;
        total += weightedAverage;
    }

    void printDetails() {
        System.out.println("Name of the student is " + name);
        System.out.print("Total marks of the student is " + total);
    }
}

public class Stu{
    public static void main(String[] args) {
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            students[i] = new Student();
            students[i].get();
            sc.nextLine(); // consume newline character
        }

        for (int i = 0; i < 5; i++) {
            students[i].printDetails();
            System.out.println();
        }
    }
}
