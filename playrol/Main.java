import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }
}

// PayrollProcessing class
class PayrollProcessing {
    private List<Employee> employees;

    public PayrollProcessing() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void removeEmployee(int empId) {
        employees.removeIf(emp -> emp.getId() == empId);
    }

    public double calculateTotalPayroll() {
        double totalPayroll = 0;
        for (Employee emp : employees) {
            totalPayroll += emp.getSalary();
        }
        return totalPayroll;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create instances of employees
        Employee emp1 = new Employee(1, "Namrata Singh", "Developer", 60000);
        Employee emp2 = new Employee(2, "Aditya Singh", "Manager", 80000);

        // Create payroll processing instance
        PayrollProcessing payroll = new PayrollProcessing();

        // Add employees to payroll
        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);

        // Calculate total payroll
        double totalPayroll = payroll.calculateTotalPayroll();
        System.out.println("Total Payroll: $" + totalPayroll);
    }
}
