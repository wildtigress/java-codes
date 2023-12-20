import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    String name;
    int total = 0;
    int mark1, mark2, mark3; 

    void get() {
        System.out.print("Enter the name of the student: ");
        name = sc.nextLine();
        System.out.println("Enter the marks of all subjects:");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();
        calculateTotal();
    }

    void calculateTotal() {
        
        if (mark1 >= mark2 && mark2 >= mark3) {
            total = mark1 + mark2; 
        } else if (mark1 >= mark3 && mark3 >= mark2) {
            total = mark1 + mark3; 
        } else if (mark2 >= mark1 && mark1 >= mark3) {
            total = mark2 + mark1; 
        } else if (mark2 >= mark3 && mark3 >= mark1) {
            total = mark2 + mark3; 
        } else if (mark3 >= mark1 && mark1 >= mark2) {
            total = mark3 + mark1; 
        } else {
            total = mark3 + mark2; 
        }
    }

    void printDetails() {
        System.out.println("Name of the student is " + name);
        System.out.print("Total marks of the student is " + total);
    }
}

public class STUDENT_DETAIL {
    public static void main(String[] args) {
        Student student = new Student();
        student.get();
        student.printDetails();
    }
}
