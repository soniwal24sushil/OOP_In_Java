package Pack_04_Inheritance;

/**
 * The `Walkable` interface declares an abstract method for walking.
 */
interface Walkable {
    void walk();
}

/**
 * The `Danceable` interface declares an abstract method for dancing.
 */
interface Danceable {
    void dance();
}

/**
 * The `Human` class implements both `Walkable` and `Danceable` interfaces, achieving multiple inheritance.
 */
class Human implements Walkable, Danceable {
    @Override
    public void dance() {
        System.out.println("Human can dance!");
    }

    @Override
    public void walk() {
        System.out.println("Human can walk!");
    }
}

/**
 * The `C_06_Multiple_Inheritance` class serves as the entry point for the program,
 * demonstrating multiple inheritance using interfaces.
 */
public class C_06_Multiple_Inheritance {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating an instance of the `Human` class
        Human human = new Human();
        // Calling the `walk()` and `dance()` methods
        human.walk();
        human.dance();
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * ### Multiple Inheritance Using Interfaces:
 * The provided code snippet illustrates the concept of achieving multiple inheritance in Java using interfaces.
 * It involves creating interfaces (`Walkable` and `Danceable`) that declare abstract methods, and a class (`Human`)
 * that implements these interfaces, thereby inheriting and providing concrete implementations for the methods.
 * <p>
 * ### Key Points:
 * 1. **Creating Interfaces:**
 * - Interfaces (`Walkable` and `Danceable`) declare abstract methods without providing implementations.
 * <p>
 * 2. **Implementing Multiple Interfaces:**
 * - The `Human` class implements both the `Walkable` and `Danceable` interfaces.
 * - It provides concrete implementations for the abstract methods declared in both interfaces.
 * <p>
 * 3. **Multiple Inheritance Through Interfaces:**
 * - A class in Java can implement multiple interfaces, enabling it to inherit and implement behaviors from all interfaces.
 */
