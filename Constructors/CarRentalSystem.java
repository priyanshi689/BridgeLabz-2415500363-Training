class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int rentalPrice;
    private int totalCost;
    public CarRental() {
        customerName = "";
        carModel = "";
        rentalDays = 0;
        rentalPrice = 1000;
        totalCost = 0;
    }
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.rentalPrice = 1000;
        this.totalCost = rentalPrice * rentalDays;
    }
    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public int getTotalCost() {
        return totalCost;
    }
    public void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Rental Price  : " + rentalPrice);
        System.out.println("Total Cost    : " + totalCost);
        System.out.println();
    }
    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        CarRental c2 = new CarRental("Himanshu", "Maruti Suzuki", 5);
        CarRental c3 = new CarRental("Aakarsh", "Hyundai", 3);
        CarRental c4 = new CarRental("Sujal", "Toyota", 4);
        CarRental c5 = new CarRental("Akhil", "Maruti Swift", 1);

        c1.displayRentalDetails();
        c2.displayRentalDetails();
        c3.displayRentalDetails();
        c4.displayRentalDetails();
        c5.displayRentalDetails();
    }
}
