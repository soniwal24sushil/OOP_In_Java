package Pack_05_Polymorphism;

/**
 * The `C_01_Method_Overloading` class serves as the entry point for the program,
 * demonstrating compile-time polymorphism through method overloading.
 */
public class C_01_Method_Overloading {
    /**
     * The `Maths` class contains static methods for performing addition with different parameter types.
     */
    static class Maths {
        /**
         * Method to add two integers.
         *
         * @param a The first integer.
         * @param b The second integer.
         * @return The sum of the two integers.
         */
        static int add(int a, int b) {
            return (a + b);
        }

        /**
         * Method to add two doubles.
         *
         * @param a The first double.
         * @param b The second double.
         * @return The sum of the two doubles.
         */
        static double add(double a, double b) {
            return (a + b);
        }
    }

    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Calling the `add` methods from the `Maths` class and printing the results
        System.out.println(Maths.add(3, 4));
        System.out.println(Maths.add(3.4, 4.3));
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * ### Polymorphism:
 * Polymorphism in Java is the ability of a single entity to take multiple forms. It allows objects of different types
 * to be treated as objects of a common type. There are two types of polymorphism in Java:
 * <p>
 * 1. **Compile-Time Polymorphism (Static Binding):**
 * - Also known as method overloading.
 * - Multiple methods in the same class with the same name but different parameters.
 * - The compiler determines which method to call based on the method signature during compilation.
 * <p>
 * 2. **Runtime Polymorphism (Dynamic Binding):**
 * - Also known as method overriding.
 * - Occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.
 * - The decision on which method to call is made at runtime based on the actual object type.
 * <p>
 * ### Why Polymorphism is Used:
 * - **Code Reusability:** Polymorphism allows the same method or operation to be used with different types of objects,
 * promoting code reuse.
 * - **Flexibility and Extensibility:** It enables adding new functionality to existing code without modifying the existing code.
 * - **Abstraction:** Polymorphism contributes to abstraction by allowing the use of a common interface for various object types.
 * <p>
 * ### Key Points:
 * - **Compile-Time Polymorphism (Method Overloading):**
 * - Multiple methods with the same name but different parameters in the same class.
 * - Decision on which method to call is made by the compiler during compilation.
 * <p>
 * - **Runtime Polymorphism (Method Overriding):**
 * - A subclass provides a specific implementation for a method defined in its superclass.
 * - Decision on which method to call is made at runtime based on the actual object type.
 * <p>
 * #### Compile-Time Polymorphism (Method Overloading):
 * The provided code snippet illustrates compile-time polymorphism through method overloading.
 * Method overloading is the ability to define multiple methods in the same class with the same name
 * but different parameter types or a different number of parameters.
 * <p>
 * * ### Key Points:
 * - **Method Overloading:**
 * - In the `Maths` class, there are two methods named `add` with different parameter types (int and double).
 * - The compiler determines which method to call based on the method signature and provided arguments during compilation.
 * - Method overloading allows the same method name to be used for different types or numbers of parameters,
 * enhancing code readability and reducing the need for multiple method names.
 */
