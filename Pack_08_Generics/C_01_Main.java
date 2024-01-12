package Pack_08_Generics;

/**
 * The `DemoClass` class contains a generics method to demonstrate generics in Java.
 */
class DemoClass {

    // create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}

/**
 * The `C_01_Main` class serves as the entry point for the program,
 * demonstrating the usage of generics in a generics method.
 */
public class C_01_Main {

    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // initialize the class with Integer data
        DemoClass demo = new DemoClass();

        // generics method working with String
        demo.<String>genericsMethod("Java Programming");

        // generics method working with integer
        demo.<Integer>genericsMethod(25);
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * ### Generics:
 * Generics in Java provide a way to create classes, interfaces, and methods that operate with types as parameters,
 * allowing for code reusability and type safety. Generics enable the creation of classes and methods that can work
 * with any data type, providing flexibility while maintaining compile-time type checking.
 * <p>
 * ### Key Points (Code Explanation):
 * - The `DemoClass` class contains a generics method named `genericsMethod`.
 * - The generics method is declared with a type parameter `<T>` to make it generic.
 * - The method prints information about the data passed to it.
 * - In the `main` method, an instance of `DemoClass` is created.
 * - The generics method is then invoked with different data types (String and Integer) using explicit type specification.
 */
