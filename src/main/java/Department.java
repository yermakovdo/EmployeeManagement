import java.util.ArrayList;
import java.util.List;

public class Department {
    private int departmentId;
    private String name;
    private List<Employee> employees;

    public Department(int departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        employee.promote(1000);
        System.out.println(employee.toString() + " был принят в " + name);
    }

    public void displayEmployees() {
        System.out.println("Сотрудники в " + name + ":");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public void displayTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Вся зарплата в " + name + ": " + totalSalary);
    }
}
