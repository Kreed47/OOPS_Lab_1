import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter marks in subject 1: ");
        int subject1 = s.nextInt();
        System.out.print("Enter marks in subject 2: ");
        int subject2 = s.nextInt();
        System.out.print("Enter marks in subject 3: ");
        int subject3 = s.nextInt();
        s.close();


        double average = (subject1 + subject2 + subject3) / 3.0;


        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade);
    }
}
