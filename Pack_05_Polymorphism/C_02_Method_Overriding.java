package Pack_05_Polymorphism;

/**
 * The `Car` class represents a generic car with a method `carInfo()`.
 */
class Car {
    /**
     * Method to provide information about a generic car.
     */
    void carInfo() {
        System.out.println("This is a car");
    }
}

/**
 * The `Ferrari` class extends the `Car` class and overrides the `carInfo()` method with a specific implementation.
 */
class Ferrari extends Car {
    /**
     * Overridden method to provide specific information about a Ferrari sports car.
     */
    @Override
    void carInfo() {
        System.out.println("Ferrari is a sports car");
    }
}

/**
 * The `C_02_Method_Overriding` class serves as the entry point for the program,
 * demonstrating runtime polymorphism through method overriding.
 */
public class C_02_Method_Overriding {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating an instance of the `Ferrari` class
        Ferrari f1 = new Ferrari();
        // Calling the overridden `carInfo()` method
        f1.carInfo();
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * #### Runtime Polymorphism (Method Overriding):
 * The provided code snippet illustrates runtime polymorphism through method overriding.
 * Method overriding occurs when a subclass provides a specific implementation for a method
 * that is already defined in its superclass. The decision on which method to call is made at runtime
 * based on the actual object type.
 * <p>
 * ### Key Points:
 * - **Runtime Polymorphism (Method Overriding):**
 * - The `Car` class has a method `carInfo()`, and the `Ferrari` class overrides this method with its specific implementation.
 * - The `main` method creates an instance of the `Ferrari` class and calls the overridden `carInfo()` method.
 * - Output: `Ferrari is a sports car`
 */
