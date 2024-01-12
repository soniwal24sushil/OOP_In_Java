package Pack_09_Exception_Handling;

// Step 1: Create a Custom Exception Class
class NegativeBalanceException extends Exception {

    // Constructor with a custom message
    public NegativeBalanceException(String message) {
        super(message);
    }
}

// Step 2: Use the Custom Exception in Your Code

/**
 * The `BankAccount` class demonstrates the creation and use of a custom exception (`NegativeBalanceException`).
 */
public class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws NegativeBalanceException {
        if (amount > balance) {
            // If the withdrawal amount exceeds the balance, throw the custom exception
            throw new NegativeBalanceException("Insufficient funds. Cannot withdraw more than the balance.");
        }

        // Deduct the amount from the balance
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Example of using the custom exception
        BankAccount account = new BankAccount(1000);

        try {
            // Attempting to withdraw an amount greater than the balance
            account.withdraw(1500);
        } catch (NegativeBalanceException e) {
            // Catching the custom exception and printing the error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/**
 * ## Exception Handling in Java:
 * <p>
 * ### Custom Exception:
 * Creating custom exceptions in Java allows you to define and handle application-specific exception scenarios.
 * The steps involve creating a custom exception class by extending the `Exception` class, and then using it in your code.
 * <p>
 * ### Key Points (Code Explanation):
 * - The code demonstrates the creation and use of a custom exception named `NegativeBalanceException`.
 * - The `NegativeBalanceException` class extends the `Exception` class and has a constructor with a custom message.
 * - The `BankAccount` class uses the custom exception in the `withdraw` method to handle cases where the withdrawal
 * amount exceeds the account balance.
 * - In the `main` method, an example of using the custom exception is shown by attempting to withdraw an amount greater
 * than the initial balance.
 */
