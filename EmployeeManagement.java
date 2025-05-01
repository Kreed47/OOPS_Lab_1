import java.util.ArrayList;


class Employee {
    private int id;
    private String name;
    private double salary;


    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Ram", 50000));
        employees.add(new Employee(102, "Shyam", 60000));
        employees.add(new Employee(103, "Dave", 55000));

        for (Employee emp : employees) {
            if (emp.getId() == 102) {
                emp.setSalary(65000);
                break;
            }
        }
        employees.removeIf(emp -> emp.getId() == 101);

        System.out.println("Remaining Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

