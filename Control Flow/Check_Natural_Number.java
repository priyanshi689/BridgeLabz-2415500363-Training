import java.util.Scanner;
 class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
        } else {
            // Formula
            int formulaSum = n * (n + 1) / 2;

            // While loop computation
            int i = 1, loopSum = 0;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Output
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
            System.out.println("Both are equal? " + (formulaSum == loopSum));
        }

        sc.close();
    }
}
