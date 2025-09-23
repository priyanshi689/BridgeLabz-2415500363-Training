class Intern extends Employee {
    private String university;

    public Intern(String name, String empID, double salary, String university) {
        super(name, empID, salary);
        this.university = university;
    }

    @Override
    public void displayEmpDetails() {
        super.displayEmpDetails();
        System.out.println("University: " + university);
    }
}