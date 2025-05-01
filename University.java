class University1 {

    static String universityName = "UPES University";
    String studentName; // Non-static variable unique to each student

    public University1(String studentName) {
        this.studentName = studentName;
    }

    static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
        // university name to be added later
    }

    void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
    }
}

public class University {
    public static void main(String[] args) {
        University1.displayUniversityName();


        University1 student1 = new University1("Shourya");
        University1 student2 = new University1("Samarth");
        University1 student3 = new University1("Charlie");
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();
        University1.universityName = "NOPES University";

        University1.displayUniversityName();
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();
    }
}

