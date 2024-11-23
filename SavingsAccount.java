package Lab6;
public class SavingsAccount extends BankAccount {
    private static final double RATE = 0.025; // Annual interest rate
    private int savingsNumber = 0; // Savings account number
    private String accountNumber; // Hides the superclass account number

    // Constructor
    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance); // Call superclass constructor
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    // Copy constructor
    public SavingsAccount(SavingsAccount original, double initialBalance) {
        super(original, initialBalance); // Call superclass copy constructor
        this.savingsNumber = original.savingsNumber + 1; // Increment savings number
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }

    // Post monthly interest
    public void postInterest() {
        double monthlyInterest = (getBalance() * RATE) / 12; // Calculate monthly interest
        deposit(monthlyInterest); // Deposit the interest
    }

    // Override getAccountNumber
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
}
