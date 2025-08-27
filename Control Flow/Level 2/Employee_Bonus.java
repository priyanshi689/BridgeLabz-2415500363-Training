 import java.util.*;
class Employee_Bonus 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary , bonus_amount;
        int year;
        System.out.println("Enter the salary");
        salary = sc.nextDouble();
        System.out.println("Enter the year");
        year = sc.nextInt();
        if(year > 5){
            bonus_amount=0.05*salary;
            System.out.println("Bonus Amount is "+bonus_amount);
        }
        
            }
    }
