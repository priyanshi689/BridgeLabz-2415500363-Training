import java.util.*;

class PowerOfNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the power: ");
        int power = sc.nextInt();
        int f = 1;
        int temp = 0;
        while(temp<0){
            f=f*number;
            temp++;
        }
        System.out.println(number + " raised to the power " + power + " is: " + f);
    }
}    