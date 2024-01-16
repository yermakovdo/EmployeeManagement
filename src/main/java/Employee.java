public class Employee {
    private int employeeId;
    private String name;
    private String position;
    private double salary;
    private Department department;

    public Employee(int employeeId, String name, String position, double salary, Department department) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    public void promote(double salaryIncrease) {
        this.salary += salaryIncrease;
        System.out.println(name + " был повышен! новая зарплата - " + salary);
    }

    public String toString() {
        return "ID сотрудника: " + employeeId + ", Имя: " + name + ", Должность: " + position + ", Зарплата: " + salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
