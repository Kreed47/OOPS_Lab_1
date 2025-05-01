import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        double marks1 = sc.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double marks2 = sc.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double marks3 = sc.nextDouble();

        double avg = (marks1 + marks2 + marks3) / 3;
        String grade;

        if (avg >= 90) {
            grade = "Grade A";
        } else if (avg >= 75) {
            grade = "Grade B";
        } else if (avg >= 50) {
            grade = "Grade C";
        } else {
            grade = "Grade F";
        }

        System.out.println("Final Grade: " + grade);
        sc.close();
    }
}

