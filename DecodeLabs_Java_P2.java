import java.util.Scanner;

public class DecodeLabs_Java_P2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfSubjects;
        int totalMarks = 0;
        double percentage;
        char grade;

        System.out.println("====================================");
        System.out.println("     STUDENT GRADE CALCULATOR");
        System.out.println("====================================");

        // Input number of subjects
        System.out.print("Enter the number of subjects: ");
        numberOfSubjects = sc.nextInt();

        // Input marks using loop
        for (int i = 1; i <= numberOfSubjects; i++) {

            int marks;

            while (true) {
                System.out.print("Enter marks for Subject " + i + " (0-100): ");
                marks = sc.nextInt();

                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                }
            }

            totalMarks += marks;
        }

        // Calculate percentage
        percentage = (double) totalMarks / numberOfSubjects;

        // Assign grade
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\n====================================");
        System.out.println("           RESULT");
        System.out.println("====================================");
        System.out.println("Number of Subjects : " + numberOfSubjects);
        System.out.println("Total Marks        : " + totalMarks);
        System.out.printf("Average Percentage : %.2f%%\n", percentage);
        System.out.println("Grade              : " + grade);

        if (grade == 'F') {
            System.out.println("Result             : FAIL");
        } else {
            System.out.println("Result             : PASS");
        }

        System.out.println("====================================");

        sc.close();
    }
}
