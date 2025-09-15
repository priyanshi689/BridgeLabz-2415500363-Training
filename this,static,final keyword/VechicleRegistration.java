class Vechicle{
    static int registrationfee = 5000;
    private final int registrationNumber;
    private String ownerName;
    private String vechicleType;
    public Vechicle(String ownerName,String vechicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vechicleType = vechicleType;
        this.registrationNumber = registrationNumber;
    }
    public int getregistrationNumber(){
            return registrationNumber;
        }
        public void setownerName(String ownerName){
            this.ownerName = ownerName;
        }
        public String getownerName(){
            return ownerName;
        }
        public void setvechicleType(String vechicleType){
            this.vechicleType = vechicleType;
        }
        public String vechicleType(){
            return vechicleType;
        }
        public static void updateregistrationfee(int newfee) {
            registrationfee = newfee;
        }
        public void displayRegistrationDetails(){
            if (this instanceof Vechicle) {
                System.out.println("Registration Number    : " + registrationNumber);
                System.out.println("OwnerName   : " + ownerName);
                System.out.println("Vechicle Type        : " + vechicleType);
                System.out.println("New REgistration Fees : " +registrationfee);
                System.out.println("---------------------------");
            }
        }
    }
    public class VechicleRegistration{
        public static void main(String[] args) {
            Vechicle v1 = new Vechicle("Rishi", "Car", 8907);
            Vechicle v2 = new Vechicle("Rinku", "Truck", 8007);
            Vechicle v3 = new Vechicle("Riya", "Scooty", 86507);
            Vechicle v4 = new Vechicle("Kartik", "Motorcycle", 8237);
            v1.displayRegistrationDetails();
            v2.displayRegistrationDetails();
            v3.displayRegistrationDetails();
            v4.displayRegistrationDetails();
            // Update Registration Fees
            Vechicle.updateregistrationfee(6000);
    
            System.out.println("After updating discount:");
            v1.displayRegistrationDetails();
            v2.displayRegistrationDetails();
            v3.displayRegistrationDetails();
            v4.displayRegistrationDetails();
        }
    }