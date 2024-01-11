package Pack_04_Inheritance;

/**
 * The `Cat` class extends the `Animal` class, forming a hierarchical inheritance.
 */
class Cat extends Animal {
    /**
     * Method to represent the action of meowing.
     */
    void meow() {
        System.out.println("Meowing");
    }
}

/**
 * The `C_03_Hierarchical_Inheritance` class serves as the entry point for the program,
 * demonstrating hierarchical inheritance between the `Cat`, `Dog`, and `Animal` classes.
 */
public class C_03_Hierarchical_Inheritance {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating an instance of the `Cat` class
        Cat tom = new Cat();
        // Calling methods from the superclass (`Animal`) and the subclass (`Cat`)
        tom.eat();   // Inherited from `Animal`
        // tom.bark(); // This method is not available in the `Cat` class
        tom.meow();  // Defined in `Cat`
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * ### Hierarchical Inheritance:
 * Hierarchical inheritance occurs when multiple classes are derived from a single base class. Each derived class
 * represents a specialization of the common base class, sharing common attributes and behaviors while introducing
 * their own specific features.
 * <p>
 * ### Example: Hierarchical Inheritance
 * - Class `Cat` extends the `Animal` class, forming a hierarchical inheritance with `Dog`.
 * - Both `Cat` and `Dog` share common features inherited from `Animal`.
 */
