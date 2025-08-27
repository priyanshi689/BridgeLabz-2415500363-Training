import java.util.Scanner;
class ZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;  // sum variable

        System.out.print("Enter a number (0 to stop): ");
        double num = sc.nextDouble();

        while (num != 0) {
            total += num; // add to total
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextDouble(); // ask again
        }

        System.out.println("Total sum = " + total);
        sc.close();
    }
}
