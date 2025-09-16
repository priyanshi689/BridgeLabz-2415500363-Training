class MovieTicket{
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;
    public MovieTicket(String movieName){
        this.movieName = movieName;
        this.isBooked = false;
        
    }
    public void bookTicket(int seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName);
        } else {
            System.out.println("Seat already booked for " + movieName);
        }
    }
    public void displayTicketDetails(){
        if(isBooked){
        System.out.println("Movie Name :"+movieName);
        System.out.println("Seat Number :"+seatNumber);
        System.out.printf("Price : %.2f%n",price);
        System.out.println();
        }
        else {
            System.out.println("No ticket booked for " + movieName);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame");
        MovieTicket ticket2 = new MovieTicket("Inception");

        // Book tickets
        ticket1.bookTicket(12, 250.00);
        ticket2.bookTicket(18, 300.50);

        // Try to rebook (should fail)
        ticket1.bookTicket(15, 270.00);

        // Display ticket details
        ticket1.displayTicketDetails();
        ticket2.displayTicketDetails();
    }

}