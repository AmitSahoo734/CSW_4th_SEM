package CSW_Sem_4.src.OOPs;
abstract class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        double newBalance = getBalance() + amount + (amount * interestRate / 100);
        setBalance(newBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }
}


public class Q7 {
    public static void main(String[] args) {
        
        Account savingsAccount = new SavingsAccount(123456, 1000, 5.0);
        Account currentAccount = new CurrentAccount(654321, 2000, 1000);


        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        currentAccount.deposit(1000);
        currentAccount.withdraw(1500);
        
        displayAccountDetails(savingsAccount);
        displayAccountDetails(currentAccount);
    }

    public static void displayAccountDetails(Account account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println();
    }
}
