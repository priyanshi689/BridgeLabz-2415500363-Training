 import java.util.*;
class EvenOddCheck 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , f=1 ;
        System.out.println("Enter the Number");
        n = sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
          if(i%2==0){
            System.out.println("The number " +i+ " is Even");
          }
          else{
            System.out.println("The Number " +i + " is Odd");
          }
        }
        
            }
    }
