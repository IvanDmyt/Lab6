package Lab6;
public class CheckingAccount extends BankAccount {
    private static final double FEE = 0.15; // Fee for clearing one check

    // Constructor
    public CheckingAccount(String name, double initialAmount) {
        super(name, initialAmount); // Call superclass constructor
        // Update the account number
        setAccountNumber(getAccountNumber() + "-10");
    }

    // Override the withdraw method
    @Override
    public boolean withdraw(double amount) {
        // Add the fee to the amount to withdraw
        amount += FEE;
        // Call the superclass withdraw method
        return super.withdraw(amount);
    }
}
