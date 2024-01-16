public class Main {
    public static void main(String[] args) {
        Department salesDepartment = new Department(1, "Продажи");
        Department itDepartment = new Department(2, "АйТи");

        Employee emp1 = new Employee(666, "Артём Слезачек", "Менеджер по продажам", 42392348, salesDepartment);
        Employee emp2 = new Employee(777, "Никита Зотов", "Инженер-программист", 5984594, itDepartment);

        salesDepartment.addEmployee(emp1);
        itDepartment.addEmployee(emp2);

        salesDepartment.displayEmployees();
        salesDepartment.displayTotalSalary();

        itDepartment.displayEmployees();
        itDepartment.displayTotalSalary();

        emp1.promote(1000000000);
    }
}
