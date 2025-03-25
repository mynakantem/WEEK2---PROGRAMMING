// Bank Account Class
class BankAccountt {
    static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    // Instance variables
    private String accountHolderName;
    private final long accountNumber; // Final variable (cannot be changed)
    private double balance;

    // Constructor using 'this' to resolve ambiguity
    public BankAccountt(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName; // Resolving ambiguity
        this.accountNumber = accountNumber; // Final variable assigned once
        this.balance = balance;
        totalAccounts++; // Increment total accounts
    }

    // Method to display account details (uses instanceof)
    public void displayAccountDetails() {
        if (this instanceof BankAccountt) { // Checking if the object is an instance of BankAccount
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
        }
    }

    // Static method to display total accounts
    public static void getTotalAccounts() {
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }
}

// Main class to test the program
class BankSystem {
    public static void main(String[] args) {
        // Creating bank account objects
        BankAccountt acc1 = new BankAccountt("Alice Johnson", 100120021L, 50000);
        BankAccountt acc2 = new BankAccountt("Bob Smith", 100120022L, 75000);

        // Displaying account details
        acc1.displayAccountDetails();
        System.out.println("-----------------------------");
        acc2.displayAccountDetails();

        // Displaying total accounts
        System.out.println("-----------------------------");
        BankAccountt.getTotalAccounts();
    }
}
