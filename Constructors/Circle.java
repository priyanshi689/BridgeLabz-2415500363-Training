class Circle{
    private double radius;
    public Circle(){
        radius = 0.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getradius(){
        return radius;
    }
    public void displayradius(){
        System.out.println("Radius :"+radius);
        System.out.println();
    }
    public static void main(String[] args) {
        Circle r1 = new Circle();
        Circle r2 = new Circle(6.0);
        Circle r3 = new Circle(12.9);
        r1.displayradius();
        r2.displayradius();
        r3.displayradius(); 
    }
}