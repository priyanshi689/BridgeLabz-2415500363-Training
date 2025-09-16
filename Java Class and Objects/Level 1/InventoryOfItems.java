class Item{
    private String itemCode;
    private String itemName;
    private double price;
    private int itemQty;
    public Item(String itemCode,String itemName,double price,int itemQty){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.itemQty = itemQty;
    }
    public double totalcost(){
        return itemQty*price;
    }
    public void displayInventoryDetails(){
        System.out.println("Itemcode : "+itemCode);
        System.out.println("Itemname :"+itemName);
        System.out.println("Item Quantity :"+itemQty);
        System.out.println("Total Price :"+totalcost());
        System.out.println();
    }
    public static void main(String[] args) {
        Item i1 = new Item("AGHR56", "Bulb", 200.50,9);
        Item i2 = new Item("YUOI789", "Table", 869.90,1);
        Item i3 = new Item("JHYT8978","Chair",688.0,2);
        i1.displayInventoryDetails();
        i2.displayInventoryDetails();
        i3.displayInventoryDetails();
    }
}