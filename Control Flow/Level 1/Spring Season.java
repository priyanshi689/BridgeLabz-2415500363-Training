 import java.util.*;
class SpringSeason 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day , month;
        System.out.println("Enter the day");
        day = sc.nextInt();
        System.out.println("Enter the month");
        month = sc.nextInt();
        if(day >= 20 && month >= 3 || day <= 20 && month <=6)
        {
            System.out.println("Spring Season");
        }
        else{
            System.out.println("Not a Spring Season");
        }
    }      
}