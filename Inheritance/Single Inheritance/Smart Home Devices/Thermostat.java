public class Thermostat extends Device{
    double settings;
    public Thermostat(String deviceID,String status,double settings){
        super(deviceID, status);
        this.settings = settings;
    }
    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temprature Settings :"+settings);
        System.out.println("-----------------------------");
    }
}