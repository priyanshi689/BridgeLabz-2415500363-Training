class Employee{
    private String empName;
    private int empID;
    private double empSalary;
    public Employee(String empName,int empID,double empSalary){
        this.empName = empName;
        this.empID = empID;
        this.empSalary = empSalary;
    }
    public void diaplayEmployeeDetails(){
        System.out.println("Name :"+empName);
        System.out.println("ID :"+empID);
        System.out.println("Salary :"+empSalary);
        System.out.println();
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Vaibahv", 45, 70000);
        Employee emp2 = new Employee("Dhruv",78,87900);
        Employee emp3 = new Employee("Dishant",89,45000);
        emp1.diaplayEmployeeDetails();
        emp2.diaplayEmployeeDetails();
        emp3.diaplayEmployeeDetails();
    }
} 