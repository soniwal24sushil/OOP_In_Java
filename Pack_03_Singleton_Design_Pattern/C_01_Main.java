package Pack_03_Singleton_Design_Pattern;

/**
 * The `Singleton` class implements the Singleton design pattern, ensuring
 * that only one instance of the class can be created.
 */
class Singleton {

    // Step 2: Private static instance
    private static Singleton instance;

    // Step 1: Private constructor
    private Singleton() {
    }

    // Step 3: Public static method to get instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

/**
 * The `C_01_Main` class serves as the entry point for the program,
 * demonstrating the usage of the Singleton design pattern.
 */
public class C_01_Main {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Displaying the hash code of the Singleton instance
        System.out.println(Singleton.getInstance().hashCode());
        // Since it's a Singleton, the hash code should be the same for subsequent calls
        System.out.println(Singleton.getInstance().hashCode());
    }
}

/**
 * ## Design Patterns: Singleton
 * <p>
 * ### Singleton Design Pattern:
 * The Singleton design pattern ensures that a class has only one instance and provides a global point of access to that instance.
 * In the `Singleton` class, the pattern is implemented by having a private static instance and a private constructor,
 * and providing a public static method (`getInstance`) to access the single instance.
 * <p>
 * ### Steps for Implementing Singleton:
 * 1. **Private Constructor:** The constructor of the class is made private to prevent external instantiation.
 * 2. **Private Static Instance:** A private static instance of the class is created.
 * 3. **Public Static Method (`getInstance`):** A public static method is provided to get the instance. If the instance
 * does not exist, it is created; otherwise, the existing instance is returned.
 * <p>
 * ### Usage in the Main Class:
 * The `C_01_Main` class demonstrates the usage of the Singleton design pattern by getting the hash code of the Singleton
 * instance. Since it's a Singleton, subsequent calls to `getInstance` return the same instance, as evidenced by the identical hash codes.
 */
