class Employee{
    private static String companyName;
    private final int empID;
    private String empName;
    private String empDesignation;
    private static int TotalEmployees=0;
public Employee(String empName,int empID,String empDesignation){
    this.empName = empName;
    this.empID = empID;
    this.empDesignation = empDesignation;
    TotalEmployees++;
}
public static int getTotalEmployees(){
    return TotalEmployees;
}
public int getempID(){
    return empID;
}
public void setempName(String empName){
    this.empName =empName;
}
public String getempName(){
    return empName;
}
public void detempDesignation(String empDesignation){
    this.empDesignation = empDesignation;
}
public String getempDesignation(){
    return empDesignation;
}
public void displayEmployeeDetails(){
    if(this instanceof Employee){
        System.out.println("Name : "+empName);
        System.out.println("Id : "+empID);
        System.out.println("Designation : "+empDesignation);
        System.out.println("-----------------------------");
        }
    }
}
class Details{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ram",456,"General Manager");
        Employee emp2 = new Employee("Shyam",452,"Senior Manager");
        Employee emp3 = new Employee("Shivani",456,"HR");
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
        System.out.println("Total Number of Employees : "+Employee.getTotalEmployees());
    }
}
