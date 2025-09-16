class Circle{
    private double radius;
    private double area;
    private double circumference;
    public Circle(double radius){
        this.radius = radius;
    }
    public double AreaOfCircle(){
        return Math.PI*radius*radius;
    }
    public double CircumferenceOfCircle(){
        return 2*Math.PI*radius;
    }
    public void diaplayCircleDetails(){
        System.out.println("Radius :"+radius);
        System.out.printf("Area Of circle :%.2f%n",AreaOfCircle());
        System.out.printf("Circumference of Circle :%.2f%n",CircumferenceOfCircle());
        System.out.println();
    }
    public static void main(String[] args) {
        Circle r1 = new Circle(67.0);
        Circle r2 = new Circle(14.9);
        Circle r3 = new Circle(10.0);
        r1.diaplayCircleDetails();
        r2.diaplayCircleDetails();
        r3.diaplayCircleDetails();
    }
}