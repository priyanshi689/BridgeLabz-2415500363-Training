class Book{
    private String title;
    private String author;
    private double price;
    public Book(){
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }
    public Book(String title , String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public double getprice(){
        return price;
    }
    public void displayBookDetails(){
        System.out.println("Book Title :"+title);
        System.out.println("Book Author :"+author);
        System.out.println("Book Price :"+price);
        System.out.println();
    }
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming","James Gosling",1000);
        Book b3 = new Book("Learning C","ABCD",900);
        b1.displayBookDetails();
        b2.displayBookDetails();
        b3.displayBookDetails();
    }

}