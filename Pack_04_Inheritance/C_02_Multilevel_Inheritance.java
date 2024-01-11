package Pack_04_Inheritance;

/**
 * The `BabyDog` class extends the `Dog` class, forming the second level of multilevel inheritance.
 */
class BabyDog extends Dog {
    /**
     * Method to represent the action of weeping.
     */
    void weep() {
        System.out.println("Weeping");
    }
}

/**
 * The `C_02_Multilevel_Inheritance` class serves as the entry point for the program,
 * demonstrating multilevel inheritance between the `BabyDog`, `Dog`, and `Animal` classes.
 */
public class C_02_Multilevel_Inheritance {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating an instance of the `BabyDog` class
        BabyDog shiba = new BabyDog();
        // Calling methods from all levels of inheritance
        shiba.eat();   // Inherited from `Animal`
        shiba.bark();  // Inherited from `Dog`
        shiba.weep();  // Defined in `BabyDog`
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * ### Multilevel Inheritance:
 * Multilevel inheritance occurs when a class is derived from a class, which is already derived from another class.
 * It forms a chain of inheritance with multiple levels. Each level adds new features to the inherited ones.
 * <p>
 * ### Example: Multilevel Inheritance
 * - Class `BabyDog` extends `Dog`, which in turn extends `Animal`.
 * - `BabyDog` inherits from both `Dog` and `Animal`, forming a multilevel inheritance.
 */
