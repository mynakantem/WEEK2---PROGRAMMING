// Base class: BankAccount
class BankkAccount {
    public String accountNumber;  // Public: Accessible anywhere
    protected String accountHolder; // Protected: Accessible in subclass
    private double balance;       // Private: Only accessible within the class

    // Constructor to initialize account details
    public BankkAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Public method to withdraw money (Only if balance is sufficient)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Public method to check balance (Getter)
    public double getBalance() {
        return balance;
    }

    // Public method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

// Subclass: SavingsAccount (Inherits from BankAccount)
class SavingsAccount extends BankkAccount {
    private double interestRate; // Additional attribute for Savings Account

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); // Call superclass constructor
        this.interestRate = interestRate;
    }

    // Method to display Savings Account details
    public void displaySavingsDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Public (Accessible)
        System.out.println("Account Holder: " + accountHolder); // Protected (Accessible in subclass)
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class to test the program
class BankAccountManagement {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankkAccount acc1 = new BankkAccount("123456789", "John Doe", 5000);
        acc1.displayAccountDetails();
        acc1.deposit(2000);
        acc1.withdraw(1500);
        System.out.println("Updated Balance: ₹" + acc1.getBalance());
        System.out.println("----------------------------");

        // Creating a SavingsAccount object
        SavingsAccount savAcc = new SavingsAccount("987654321", "Alice Smith", 10000, 4.5);
        savAcc.displaySavingsDetails();
    }
}
