package Pack_09_Exception_Handling;

/**
 * The `C_01_Try_Catch_Finally` class demonstrates the try-catch-finally block in exception handling.
 */
public class C_01_Try_Catch_Finally {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        try {
            System.out.println("Started..");
            int res = 5 / 0; // Attempting to divide by zero
            System.out.println("The result is: " + res); // This line won't be executed
            System.out.println("Terminated.."); // This line won't be executed
        } catch (Exception a) {
            System.out.println(a.getMessage()); // Handling the exception and printing the message
        } finally {
            System.out.println("I'm in final"); // This block is always executed
        }
    }
}

/**
 * ## Exception Handling in Java:
 * <p>
 * ### Try-Catch-Finally Block:
 * The try-catch-finally block is used to handle exceptions in Java. It allows you to write code that may throw
 * exceptions and provides a mechanism to catch and handle those exceptions. The finally block is optional and is
 * executed regardless of whether an exception is thrown or not. It is commonly used for cleanup tasks.
 * <p>
 * ### Key Points (Code Explanation):
 * - The `main` method contains a try-catch-finally block to handle exceptions.
 * - Within the try block, an attempt is made to perform a division by zero (5 / 0), which results in an ArithmeticException.
 * - The catch block catches the exception and prints its message using `getMessage()`.
 * - The finally block is executed irrespective of whether an exception occurs or not.
 */
