abstract class Employee {
    protected String name;
    protected String role;
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
    abstract void calculateSalary();
    abstract void displayDetails();
}
class Manager extends Employee {
    private double fixedSalary;

    public Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Manager Salary: " + fixedSalary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role + ", Salary: " + fixedSalary);
    }
}
class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name, "Developer");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Developer Salary: " + salary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role + ", Salary: " + (hourlyRate * hoursWorked));
    }
}
public class Main_1 {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 80000);
        Employee developer = new Developer("Bob", 50, 160);
        manager.displayDetails();
        manager.calculateSalary();

        developer.displayDetails();
        developer.calculateSalary();
    }
}
