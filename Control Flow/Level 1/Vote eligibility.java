 import java.util.*;
class VoteEligibilty 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter the age");
        age = sc.nextInt();
        if(age >= 18){
            System.out.println("The person can vote");
        }
        else{
            System.out.println("The person cannot vote");
            }
    }      
}