 class Book{
    static String libraryName = "Gla Library";
    private String bookTitle ;
    private String bookAuthor;
    private final int isbn;
    public Book(String bookAuthor,String bookTitle,int isbn){
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
        this.isbn = isbn;
    }
    public String getbookAuthor(){
        return bookAuthor;
    }
    public String getbooktitle(){
        return bookTitle;
    }
    public int getisbn(){
        return isbn;
    }
    public static void displaylibraryName(){
        System.out.println("Library Name is: "+libraryName);
    }
    public void displayBookDetails() {
        if(this instanceof Book){
            System.out.println("Book Title : "+bookTitle);
            System.out.println("Book Author : "+bookAuthor);
            System.out.println("ISBN : "+isbn);
            System.out.println("--------------------------");     
            }
        }
    }
     class Library{
        public static void main(String[] args) {
            Book b1 = new Book("William Shakespeare","Merchant of Venice",768546);
            Book b2 = new Book("William Shakespeare","Tempest",908765);
            Book b3 = new Book("William Shakespeare","Macbeth",987654);
           b1.displaylibraryName();
            b1 .displayBookDetails();
           b2.displaylibraryName();
            b2.displayBookDetails();
           b3.displaylibraryName();
            b3.displayBookDetails();
        }
    }
