class BankAccount{
    static String bankname = "abc bank";
    private static int TotalAccounts=0;
    private String AccountHolderName;
    private final int AccountNumber;
    private double balance;
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.AccountHolderName = accountHolderName;
        this.AccountNumber = accountNumber;
        this.balance = balance;
        TotalAccounts++;
    }
    public static int getTotalAccounts(){
            return TotalAccounts;
        }
        public void setAccountHolderName(String AccountHolderName){
            this.AccountHolderName = AccountHolderName;
        }
        public String getAccountHolderName(){
            return AccountHolderName;
        }
        public int getAccountNumber(){
            return AccountNumber;
        }
        public void displayAccountDetails(){
            if (this instanceof BankAccount){
                System.out.println("Bank Name       : " + bankname);
                System.out.println("Account Number  : " + AccountNumber);
                System.out.println("Account Holder  : " + AccountHolderName);
                System.out.println("Balance         : " + balance);
                System.out.println("----------------------------");
            }
        }
    }
     class Banksystem{
        public static void main(String[] args) {
            BankAccount acc1 = new BankAccount("Abhinav",1445,30000);
            BankAccount acc2 = new BankAccount("Abhishek",1456,40000);
            BankAccount acc3 = new BankAccount("Ankit",1447,43500); 
            acc1.displayAccountDetails();
            acc2.displayAccountDetails();
            acc3.displayAccountDetails();
            System.out.println("Total Accounts Created: " + BankAccount.getTotalAccounts());
        }
}