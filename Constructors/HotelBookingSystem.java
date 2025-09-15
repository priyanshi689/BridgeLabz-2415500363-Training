class HotelBooking{
    private String guestName;
    private String roomType;
    private int nights;
    public HotelBooking(){
        guestName = "";
        roomType = "";
        nights = 0;
    }
    public HotelBooking(String guestName,String roomType,int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking other){
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    public String getguestName(){
        return guestName;
    }
    public String getroomType(){
        return roomType;
    }
    public int getnights(){
        return nights;
    }
    public void displayBookingDetails(){
        System.out.println("Guest Name :"+guestName);
        System.out.println("Room Type :"+roomType);
        System.out.println("Number of Nights guest stay :"+nights);
        System.out.println();
    }
    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking(h1);
        HotelBooking h3 = new HotelBooking("Priyank", "Single room", 10);
        HotelBooking h4 = new HotelBooking("Aditya", "Twin Room", 4);
        HotelBooking h5 = new HotelBooking("Priyanshi","Connecting Room",9);
        HotelBooking h6 = new HotelBooking(h5);
        h1.displayBookingDetails();
        h2.displayBookingDetails();
        h3.displayBookingDetails();
        h4.displayBookingDetails();
        h5.displayBookingDetails();
        h6.displayBookingDetails();
    }
}