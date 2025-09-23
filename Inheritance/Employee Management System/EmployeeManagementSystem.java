public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", "M101", 80000, 10);
        Employee developer = new Developer("Bob", "D202", 60000, "Java");
        Employee intern = new Intern("Charlie", "I303", 20000, "MIT");

        manager.displayEmpDetails();
        System.out.println("--------------------");
        developer.displayEmpDetails();
        System.out.println("--------------------");
        intern.displayEmpDetails();
    }
}