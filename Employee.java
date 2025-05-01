class Employee {
    private static int totalEmployees = 0;
    private int employeeID;
    private String name;
    private String department;
    private double salary;


    public Employee() {
        this.employeeID = 0;
        this.name = "Unknown";
        this.department = "Unknown";
        this.salary = 0.0;
        totalEmployees++;
    }

    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }
    public double calculateSalary() {
        return this.salary;
    }
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + this.employeeID);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
        System.out.println();
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(101, "Neetu", "HR", 5000000);

        Employee emp3 = new Employee(102, "Dev", "Business Analyst", 7000000);
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();

        Employee.displayTotalEmployees();
    }
}
