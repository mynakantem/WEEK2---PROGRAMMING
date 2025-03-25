interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal.");
        }
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    private final double interestRate = 0.04; // 4% per annum

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for a loan of ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private final double interestRate = 0.02; // 2% per annum

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for a business loan of ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SA101", "Alice", 7000);
        BankAccount acc2 = new CurrentAccount("CA202", "Bob", 12000);

        acc1.deposit(1000);
        acc2.withdraw(2000);

        System.out.println("Interest for " + acc1.getHolderName() + ": ₹" + acc1.calculateInterest());
        System.out.println("Interest for " + acc2.getHolderName() + ": ₹" + acc2.calculateInterest());

        Loanable loanAcc1 = (Loanable) acc1;
        loanAcc1.applyForLoan(15000);
        System.out.println("Loan Eligibility for " + acc1.getHolderName() + ": " + loanAcc1.calculateLoanEligibility());

        Loanable loanAcc2 = (Loanable) acc2;
        loanAcc2.applyForLoan(50000);
        System.out.println("Loan Eligibility for " + acc2.getHolderName() + ": " + loanAcc2.calculateLoanEligibility());
    }
}
