import java.util.*;
class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r,cube,sum=0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        int n1=n;
        while(n>0){
            r=n%10;
            cube=r*r*r;
            sum=sum+cube;
            n=n/10;
        }
        if(sum == n1){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }

    }
}