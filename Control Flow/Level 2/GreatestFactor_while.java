import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int greatestFactor = 1; // initialize
        int counter = number - 1; // start from number - 1

        // While loop till counter >= 1
        while (counter >= 1) {
            if (number % counter == 0) { // check factor
                greatestFactor = counter;
                break; // exit as soon as we find the largest factor
            }
            counter--; // decrement counter
        }

        System.out.println("Greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
    }
}
