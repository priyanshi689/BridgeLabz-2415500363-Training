 import java.util.*;
class First_Smallest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter the first Number");
        n1 = sc.nextInt();
         System.out.println("Enter the second Number");
        n2 = sc.nextInt();
         System.out.println("Enter the third Number");
        n3 = sc.nextInt();
        if(n1<n2 && n1<n3)
        {
            System.out.println("First Number " + n1 + " is the smallest");
        }
            }
}