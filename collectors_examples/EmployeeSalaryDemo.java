import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class EmployeeSalaryDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 50000),
            new Employee("Bob", "IT", 60000),
            new Employee("Charlie", "IT", 80000),
            new Employee("David", "HR", 55000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));

        avgSalaryByDept.forEach((dept, avg) ->
            System.out.println(dept + " -> " + avg)
        );
    }
}
