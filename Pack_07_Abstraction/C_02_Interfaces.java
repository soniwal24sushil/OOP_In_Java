package Pack_07_Abstraction;

/**
 * The `Animal` interface declares abstract methods related to animal behavior.
 */
interface Animal {
    // Abstract method for making a sound
    void sound();

    // Abstract method for eating
    void eat();
}

/**
 * The `Dog` class implements the `Animal` interface, providing concrete implementations for sound and eat methods.
 */
class Dog implements Animal {
    // Implementation of the sound method for a dog
    @Override
    public void sound() {
        System.out.println("Dog does Bow-Bow");
    }

    // Implementation of the eat method for a dog
    @Override
    public void eat() {
        System.out.println("Dog eat Bones");
    }
}

/**
 * The `C_02_Interfaces` class serves as the entry point for the program,
 * demonstrating the concept of interfaces in Java.
 */
public class C_02_Interfaces {

    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating an instance of the Dog class through the Animal interface
        Animal muku = new Dog();

        // Calling the implemented methods through the interface reference
        muku.sound();
        muku.eat();
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * ### Interfaces:
 * Interfaces in Java are a way to achieve abstraction by defining a contract that specifies a set of methods that
 * implementing classes must adhere to. An interface provides a blueprint for classes, ensuring that they contain
 * specific functionalities. Classes implement interfaces to provide concrete implementations for the defined methods.
 * <p>
 * ### Rules for Interfaces:
 * - Interfaces cannot be instantiated directly.
 * - All methods in an interface are implicitly public and abstract.
 * - Interfaces can contain constant variables, which are implicitly public, static, and final.
 * - A class can implement multiple interfaces (Java supports multiple inheritance through interfaces).
 * - Classes implementing an interface must provide concrete implementations for all methods declared in the interface.
 * - An interface can extend multiple interfaces using the `extends` keyword.
 * <p>
 * ### Key Points (Code Explanation):
 * - The `Animal` interface declares two abstract methods: `sound()` and `eat()`.
 * - The `Dog` class implements the `Animal` interface, providing concrete implementations for both methods.
 * - The `main` method demonstrates interface usage by creating an instance of the `Dog` class through the `Animal` interface.
 */
