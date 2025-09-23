public class Developer extends Employee{
    String programmingLanguage;
    public Developer(String name, String empID, double salary,String programmingLanguageS) {
        super(name, empID, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayEmpDetails() {
        super.displayEmpDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}