import java.util.Scanner;

public class CalculateAverageAndTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSubjects = 5;
        int[] marks = new int[numberOfSubjects];
        
        System.out.println("Enter marks for " + numberOfSubjects + " subjects:");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        
        double average = (double) total / numberOfSubjects;
        
        System.out.println("\nTotal marks: " + total);
        System.out.println("Average marks: " + average);
        
        scanner.close();
    }
}
