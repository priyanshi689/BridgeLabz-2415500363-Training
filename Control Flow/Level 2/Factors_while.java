import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a positive integer:");
        int number = sc.nextInt();

        // Check if input is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int counter = 1; // Start counter from 1
        System.out.println("Factors of " + number + " are:");

        // While loop to find factors
        while (counter <= number) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
