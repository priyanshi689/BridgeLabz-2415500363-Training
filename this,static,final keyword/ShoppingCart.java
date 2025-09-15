class Product{
    static int discount = 15;
    private final int productID;
    private String productName;
    private double productPrice;
    private static int idCounter = 1000;
    private int productQty;
    public Product(String productName,double productprice, int productQty) {
        this.productName = productName;
        this.productPrice = productprice;
        this.productQty = productQty;
        this.productID = ++idCounter;
    }
    public int getproductID(){
            return productID;
        }
        public void setproductName(String productName){
            this.productName = productName;
        }
        public String getproductName(){
            return productName;
        }
        public void setproductPrice(double productPrice){
            this.productPrice = productPrice;
        }
        public double getproductPrice(){
            return productPrice;
        }
        public void setproductQty(int productQty){
            this.productQty = productQty;
        }
        public int productQty(){
            return productQty;
        }
        public static void updateDiscount(int newDiscount) {
            discount = newDiscount;
        }
        public void displayCartDetails(){
            if (this instanceof Product) {
                System.out.println("Product ID     : " + productID);
                System.out.println("Product Name   : " + productName);
                System.out.println("Price          : " + productPrice);
                System.out.println("Quantity       : " + productQty);
                System.out.println("Discount       : " + discount + "%");
                System.out.println("---------------------------");
            }
        }
    }
    public class ShoppingCart {
        public static void main(String[] args) {
            Product p1 = new Product("Laptop", 50000, 2);
            Product p2 = new Product("Mobile", 20000, 3);
    
            p1.displayCartDetails();
            p2.displayCartDetails();
    
            // Update discount for all products
            Product.updateDiscount(20);
    
            System.out.println("After updating discount:");
            p1.displayCartDetails();
            p2.displayCartDetails();
        }
    }