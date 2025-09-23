public class Employee{
    String name;
    String empID;
    double salary;
    public Employee(String name, String empID,double salary){
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return empID;
    }
    public double getSalary() {
        return salary;
    }
    public void displayEmpDetails(){
        System.out.println("Employee ID :"+empID);
        System.out.println("Employee Name :"+name);
        System.out.println("Employe Salary :"+salary);
    }
}