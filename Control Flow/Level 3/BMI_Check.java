import java.util.*;
class BMI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight , height ,h ,BMI ;
        System.out.println("Enter the weight in Kg");
        weight =sc.nextDouble();
        System.out.println("Enter the height in cm");
        height =sc.nextDouble();
        h=height/100;
        BMI = weight /(h*h);
        if(BMI <= 18.4){
        System.out.println("Underweight");
        }
        else if(BMI >= 18.5 && BMI <= 24.9){
            System.out.println("Normal");
        }
        else if(BMI >=25.0 && BMI <=39.9){
            System.out.println("Overweight");
        }
        else if(BMI >= 40.0){
            System.out.println("Obese");
        }
    }
}