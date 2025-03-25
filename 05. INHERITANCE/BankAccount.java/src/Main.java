class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("This is a generic bank account.");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is a Savings Account with an interest rate of " + interestRate + "%.");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is a Checking Account with a withdrawal limit of " + withdrawalLimit + ".");
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account with a maturity period of " + maturityPeriod + " months.");
    }
}

class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("SAV123", 5000, 4.5);
        BankAccount checkingAccount = new CheckingAccount("CHK456", 1500, 2000);
        BankAccount fixedDepositAccount = new FixedDepositAccount("FD789", 10000, 12);

        savingsAccount.displayAccountType();
        checkingAccount.displayAccountType();
        fixedDepositAccount.displayAccountType();
    }
}
