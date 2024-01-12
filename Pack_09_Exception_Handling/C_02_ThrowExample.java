package Pack_09_Exception_Handling;

/**
 * The `C_02_ThrowExample` class demonstrates the use of the `throw` statement to throw a custom exception.
 */
public class C_02_ThrowExample {

    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw an exception
            System.out.println("Age is valid"); // This line won't be executed
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Handling the thrown exception
        }
    }

    /**
     * Method to validate age.
     *
     * @param age The age to be validated.
     * @throws IllegalArgumentException If the age is less than 18.
     */
    private static void validateAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");
        }
    }
}

/**
 * ## Exception Handling in Java:
 * <p>
 * ### Throw Statement:
 * The `throw` statement in Java is used to explicitly throw an exception. It is often used in methods to indicate
 * exceptional situations and propagate the exception to the calling code for handling.
 * <p>
 * ### Key Points (Code Explanation):
 * - The `C_02_ThrowExample` class demonstrates the use of the `throw` statement to throw a custom exception.
 * - The `validateAge` method is designed to throw an `IllegalArgumentException` if the provided age is less than 18.
 * - In the `main` method, an attempt is made to validate an age of 15, which results in the throwing of an exception.
 * - The catch block catches the exception and prints the error message.
 */
