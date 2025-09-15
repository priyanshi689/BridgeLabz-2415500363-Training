class Patient{
    private static String hospitalName = "xyz Hospital";
    private final int patientID;
    private String patientName;
    private int patientAge;
    private String patientAilment;
    private static int TotalPatients=0;
public Patient(String patientName,int patientID,int patientAge,String patientAilment){
    this.patientName = patientName;
    this.patientID = patientID;
    this.patientAge = patientAge;
    this.patientAilment = patientAilment;
    TotalPatients++;
}
public static int getTotalPatients(){
    return TotalPatients;
}
public int getpatientID(){
    return patientID;
}
public void setpatientName(String patientName){
    this.patientName = patientName;
}
public String getpatientName(){
    return patientName;
}
public void setpatientAge(int patientAge){
    this.patientAge = patientAge;
}
public int getpatientAge(){
    return patientAge;
}
public void setpatientAilment(String patientAilment){
    this.patientAilment = patientAilment;
}
public String getpatientAilment(){
    return patientAilment;
}
public void displayPatientDetails(){
    if(this instanceof Patient){
        System.out.println("Hospital Name :"+hospitalName);
        System.out.println("Name : "+patientName);
        System.out.println("Id : "+patientID);
        System.out.println("Age : "+patientAge);
        System.out.println("Ailment : "+patientAilment);
        System.out.println("-----------------------------");
        }
    }
}
class Hospital{
    public static void main(String[] args) {
        Patient p1 = new Patient("Priya", 1, 18, "Fever");
        Patient p2 = new Patient("Riya", 2, 21, "Headache");
        Patient p3 = new Patient("Priyanka", 32, 18, "Thyroid");
        Patient p4 = new Patient("Siya",4, 19, "PCOD");
        p1.displayPatientDetails();
        p2.displayPatientDetails();
        p3.displayPatientDetails();
        p4.displayPatientDetails();
        System.out.println("Total Number of Patients : "+Patient.getTotalPatients());
    }
}