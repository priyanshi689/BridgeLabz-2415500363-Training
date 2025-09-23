public class Device{
    String deviceID;
    String status;
    public Device(String deviceID,String status){
        this.deviceID = deviceID;
        this.status = status;
    }
    public void displayStatus(){
        System.out.println("Device ID :"+deviceID);
        System.out.println("Device Status :"+status);
    }
}