import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileWriter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = input.nextLine();

        System.out.print("Enter grade: ");
        String grade = input.nextLine();
        String studentInfo = "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;

        try (FileWriter writer = new FileWriter("student.txt", true)) {
            writer.write(studentInfo + "\n");
            System.out.println("Student information successfully written to student.txt");
        } catch (IOException e) {
            System.out.println("Error: Unable to write to the file. " + e.getMessage());
        } finally {
            System.out.println("File operation attempted.");
        }

        input.close();
    }
}
