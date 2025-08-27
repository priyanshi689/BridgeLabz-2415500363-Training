 import java.util.*;
class CountOfRocketLaunch 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the starting counter");
        n = sc.nextInt();
        while(n>0)
        {
            System.out.println(n);
            n--;
            }
        System.out.println("Rocket is launched");
    }

}