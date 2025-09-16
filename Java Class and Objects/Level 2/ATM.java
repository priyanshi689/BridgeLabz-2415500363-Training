class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rohan Sharma", 1001, 5000.0);

        acc1.displayBalance();
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.withdraw(7000); // This should fail due to insufficient balance
        acc1.displayBalance();
    }
}
