import java.util.*;
class CountDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r,i=0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            i++;
            n=n/10;
        }
        System.out.println("Final count of the digits in the number is : "+i);

    }
}