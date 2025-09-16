class MobilePhone{
    private String brand;
    private String model;
    private double price;
    public MobilePhone(String brand,String model,double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayMobileDetails(){
        System.out.println("Brand :"+brand);
        System.out.println("Model :"+model);
        System.out.println("Price :"+price);
        System.out.println();
    }
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("Samsung","Galaxy A15",20000 );
        MobilePhone m2 = new MobilePhone("Samsung","Galaxy A35",40000 );
        MobilePhone m3 = new MobilePhone("Apple","Iphone pro max 17",150000 );
        MobilePhone m4 = new MobilePhone("OnePlus","Node56",35000 );
        m1.displayMobileDetails();
        m2.displayMobileDetails();
        m3.displayMobileDetails();
        m4.displayMobileDetails();
    }
}