package Pack_06_Encapsulation;

/**
 * The `Account` class represents an encapsulated account with a username and password.
 */
class Account {
    // Public attribute
    String username;
    // Private attribute
    private int password;

    /**
     * Constructor to initialize the account with a username.
     *
     * @param username The username for the account.
     */
    public Account(String username) {
        this.username = username;
    }

    /**
     * Getter method to retrieve the password.
     *
     * @return The password.
     */
    public int getPassword() {
        return password;
    }

    /**
     * Setter method to set the password.
     *
     * @param password The new password to set.
     */
    public void setPassword(int password) {
        this.password = password;
    }
}

/**
 * The `C_01_Main` class serves as the entry point for the program,
 * demonstrating encapsulation in the `Account` class.
 */
public class C_01_Main {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating an instance of the `Account` class
        Account acc = new Account("Sushil Soniwal");
        // Setting the password using the setter method
        acc.setPassword(123456);

        // Accessing and printing the username and password using getter methods
        System.out.println("The username is: " + acc.username);
        System.out.println("The password is: " + acc.getPassword());
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * ### Encapsulation:
 * The provided code snippet demonstrates the concept of encapsulation in Java.
 * Encapsulation involves bundling the data (attributes) and the methods that operate on the data
 * into a single unit called a class. Access to the data is restricted to ensure that it is accessed
 * and modified through the defined methods, promoting data security and integrity.
 * <p>
 * ### Key Points:
 * - The `Account` class encapsulates the `username` and `password` attributes.
 * - The `password` attribute is marked as private, restricting direct access from outside the class.
 * - Getter and setter methods (`getPassword()` and `setPassword()`) are provided to access and modify the password.
 * - The `main` method demonstrates creating an instance of the `Account` class, setting the password, and accessing the data.
 */
