 import java.util.*;
class Factorial 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , f=1 ;
        System.out.println("Enter the Number");
        n = sc.nextInt();
        int i=1;
        if(n>0)
        {
        while(n >= i)
        {
            f=f*i;
            i++;
        }
            System.out.println("Factorial is "+f );
        
            
         }
    }
}