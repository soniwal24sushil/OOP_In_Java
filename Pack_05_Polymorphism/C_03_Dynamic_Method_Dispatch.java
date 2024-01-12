package Pack_05_Polymorphism;

/**
 * The `Birds` class represents a generic bird with a method `sound()`.
 */
class Birds {
    /**
     * Method to produce a generic bird sound.
     */
    void sound() {
        System.out.println("Bird Sounds!");
    }
}

/**
 * The `Sparrow` class extends the `Birds` class and overrides the `sound()` method with a specific implementation.
 */
class Sparrow extends Birds {
    /**
     * Overridden method to produce sparrow-specific sounds.
     */
    @Override
    void sound() {
        System.out.println("Sparrow Sounds");
    }
}

/**
 * The `Eagle` class extends the `Birds` class and overrides the `sound()` method with a specific implementation.
 */
class Eagle extends Birds {
    /**
     * Overridden method to produce eagle-specific sounds.
     */
    @Override
    void sound() {
        System.out.println("Eagle Sounds");
    }
}

/**
 * The `C_03_Dynamic_Method_Dispatch` class serves as the entry point for the program,
 * demonstrating dynamic method dispatch.
 */
public class C_03_Dynamic_Method_Dispatch {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating instances of the `Birds`, `Sparrow`, and `Eagle` classes
        Birds b = new Birds();
        Sparrow s = new Sparrow();
        Eagle e = new Eagle();

        // Calling the `sound()` method on objects of different types
        b.sound();
        s.sound();
        e.sound();

        // Dynamic Method Dispatch: Superclass reference holding subclass objects
        Birds bird1 = new Sparrow();
        bird1.sound();

        Birds bird2 = new Eagle();
        bird2.sound();
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * #### Dynamic Method Dispatch:
 * The provided code snippet demonstrates dynamic method dispatch, a feature in Java that enables
 * calling an overridden method based on the actual type of the object at runtime.
 * <p>
 * ### Key Points:
 * - **Dynamic Method Dispatch:**
 * - The `Birds` class has a method `sound()`, and two subclasses (`Sparrow` and `Eagle`) override this method.
 * - The `main` method creates instances of `Birds`, `Sparrow`, and `Eagle`.
 * - Calls to the `sound()` method are made on objects of different types, showcasing dynamic method dispatch.
 * <p>
 * - When a superclass reference variable holds a subclass object, the method called is determined by the actual
 * type of the object at runtime.
 */
