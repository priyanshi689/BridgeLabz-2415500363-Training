import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Check if input is valid
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            // Loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {   // if i is multiple of number
                    System.out.println(i);
                }
            }
        }
    }
}
