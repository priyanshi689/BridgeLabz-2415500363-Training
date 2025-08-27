import java.util.*;
class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , f=0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        for (int i = 2 ;i < n; i++) 
        {
        if(n%i == 0){
            f=1;
            break;
        }
        }    
        if(f==0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
            
        }
    }
