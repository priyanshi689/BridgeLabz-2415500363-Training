import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int greatestFactor = 1; // initialize

        // Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // check factor
                greatestFactor = i;
                break; // exit as soon as we find the largest factor
            }
        }

        System.out.println("Greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
    }
}
