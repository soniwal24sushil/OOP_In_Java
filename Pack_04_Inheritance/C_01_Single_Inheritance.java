package Pack_04_Inheritance;

/**
 * Single Inheritance: A subclass extends only one superclass.
 */
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

/**
 * The `Dog` class extends the `Animal` class, showcasing single inheritance.
 */
class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

/**
 * The `C_01_Single_Inheritance` class serves as the entry point for the program,
 * demonstrating single inheritance between the `Dog` and `Animal` classes.
 */
public class C_01_Single_Inheritance {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating an instance of the `Dog` class
        Dog floki = new Dog();
        // Calling methods from both the superclass (`Animal`) and the subclass (`Dog`)
        floki.bark();
        floki.eat();
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * ### Inheritance:
 * Inheritance is a fundamental OOP concept that allows a class (subclass or derived class) to inherit properties
 * and behaviors from another class (superclass or base class). This promotes code reusability and establishes
 * a relationship between classes.
 * <p>
 * ### Why Inheritance:
 * - **Code Reusability:** Inheritance allows the reuse of code from existing classes, reducing redundancy and promoting modular design.
 * - **Polymorphism:** Enables the use of objects of the derived class wherever objects of the base class are used.
 * - **Maintenance:** Changes made to the superclass automatically affect all subclasses.
 * <p>
 * ### Types of Inheritance in Java:
 * 1. **Single Inheritance:**
 * - A subclass extends only one superclass.
 * - Example: The `Dog` class extends the `Animal` class.
 * <p>
 * 2. **Multiple Inheritance (Not Supported in Java):**
 * - A subclass can extend more than one superclass.
 * - Java does not support multiple inheritance for classes to avoid the "Diamond Problem."
 * <p>
 * 3. **Multilevel Inheritance:**
 * - A class is derived from a class, which is already derived from another class.
 * - Example: If class C extends class B, and class B extends class A, it forms a multilevel inheritance.
 * <p>
 * 4. **Hierarchical Inheritance:**
 * - Multiple classes are derived from a single base class.
 * - Example: If classes B and C both extend class A, it forms hierarchical inheritance.
 * <p>
 * 5. **Hybrid Inheritance (Combination of Multiple and Multilevel):**
 * - A combination of different types of inheritance.
 * - Example: A combination of multiple and multilevel inheritance in the same program.
 */
