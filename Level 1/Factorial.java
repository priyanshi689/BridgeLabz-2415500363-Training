 import java.util.*;
class Factoraial 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , f=1 ;
        System.out.println("Enter the Number");
        n = sc.nextInt();
        int i;
        if(n > 0){
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
            System.out.println("Factorial is "+f );
        
            }
    }
}
