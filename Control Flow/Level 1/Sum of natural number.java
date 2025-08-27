 import java.util.*;
class SumOfNaturalNumber 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number");
        n = sc.nextInt();
        int i, sum=0;
        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
            System.out.println("Sum of number is  "+ sum );
        
            }
    }
