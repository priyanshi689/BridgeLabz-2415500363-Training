class Student{
    private String name;
    private int rollnumber;
    private double marks;
    private char grade;
    public Student(String name, int rollNumber ,double marks){
        this.name = name;
        this.rollnumber = rollNumber;
        this.marks = marks;
    }
    public char gradeCalculation(){
        if(marks  >= 90){
            return 'A';
        }
        else if(marks <=89 && marks >=80){
            return 'B';
        }
        else if(marks <=79 && marks >=65){
            return 'C';
        }
        else if(marks <=64 && marks >=45) {
            return 'D';
        }
        else{
            return 'F';
        }
    }
    public void displayStudentDetails(){
        System.out.println("Name :"+name);
        System.out.println("Roll Number :"+rollnumber);
        System.out.println("Marks :"+marks);
        System.out.println("Grades :"+gradeCalculation());
        System.out.println();
    }
    public static void main(String[] args) {
        Student s1 = new Student("Abhay",1, 86);
        Student s2 = new Student("Ajay", 2, 90);
        Student s3 = new Student("Charlie", 3, 76);
        Student s4 = new Student("Yash",40,35);
        s1.displayStudentDetails();
        s2.displayStudentDetails();
        s3.displayStudentDetails();
        s4.displayStudentDetails();
    }
}