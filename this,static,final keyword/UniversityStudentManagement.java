class Student{
    private static String universityName = "GLA University";
    private final int studentID;
    private String studentName;
    private char studentGrade;
    private static int TotalStudents=0;
public Student(String studentName,int studentID,char studentGrade){
    this.studentName = studentName;
    this.studentID = studentID;
    this.studentGrade = studentGrade;
    TotalStudents++;
}
public static int getTotalStudents(){
    return TotalStudents;
}
public int getstudentID(){
    return studentID;
}
public void setstudentName(String studentName){
    this.studentName = studentName;
}
public String getstudentName(){
    return studentName;
}
public void getstudentGrade(char studentGrade){
    this.studentGrade = studentGrade;
}
public char getstudentGrade(){
    return studentGrade;
}
public void displayStudentDetails(){
    if(this instanceof Student){
        System.out.println("University Name :"+universityName);
        System.out.println("Name : "+studentName);
        System.out.println("Id : "+studentID);
        System.out.println("Grade : "+studentGrade);
        System.out.println("-----------------------------");
        }
    }
}
class StudentsDetails{
    public static void main(String[] args) {
        Student s1  = new Student("Rohit", 78, 'A');
        Student s2  = new Student("Mohit", 56, 'B');
        Student s3  = new Student("Sohit", 68, 'C');
        Student s4  = new Student("Rohan", 70, 'B');
        s1.displayStudentDetails();
        s2.displayStudentDetails();
        s3.displayStudentDetails();
        s4.displayStudentDetails();
        System.out.println("Total Number of Students : "+Student.getTotalStudents());
    }
}
