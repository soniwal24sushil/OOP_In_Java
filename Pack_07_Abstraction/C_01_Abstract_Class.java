package Pack_07_Abstraction;

/**
 * The `Shape` abstract class defines a shape with an abstract `draw()` method, a concrete `resize()` method, and a static method.
 */
abstract class Shape {
    // Abstract method that must be implemented by subclasses
    abstract void draw();

    // Concrete method with a body
    void resize() {
        System.out.println("Resizing the shape");
    }

    // Static method in abstract class
    static void staticMethod() {
        System.out.println("Static method in abstract class");
    }

    // * Abstract static methods are not allowed in abstract classes
    // abstract static void abstractStaticMethod(); // This is not allowed

    // Public constructor in abstract class (used by subclasses during instantiation)
    public Shape() {
        System.out.println("Constructor in abstract class");
    }
}

/**
 * The `Circle` class is a concrete subclass of `Shape`, providing an implementation for the `draw()` method.
 */
class Circle extends Shape {
    // Implementation of the abstract draw method
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

/**
 * The `C_01_Abstract_Class` class serves as the entry point for the program,
 * demonstrating the concept of abstraction in Java.
 */
public class C_01_Abstract_Class {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Using superclass reference for polymorphism
        Shape myShape = new Circle();

        // Calling the overridden draw method in the Circle class
        myShape.draw();

        // Calling the concrete method in the abstract class
        myShape.resize();

        // Calling the static method in the abstract class
        Shape.staticMethod();

        // Abstract classes cannot be instantiated directly
        // Shape shape = new Shape(); // This is not allowed
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * ### Abstraction:
 * Abstraction is a fundamental OOP concept that involves hiding the implementation details of an object and exposing
 * only the essential features. It allows the creation of abstract classes and interfaces to define a blueprint for
 * classes with common characteristics, leaving the specific implementation details to the subclasses.
 * <p>
 * ### Why Abstraction is Required:
 * - **Hide Complexity:** Abstraction helps in managing the complexity of systems by hiding unnecessary details.
 * - **Focus on Essential Features:** It allows programmers to focus on essential features without being concerned about implementation.
 * - **Enhance Maintainability:** Changes in implementation details do not affect the external code using the abstract class or interface.
 * <p>
 * ### How to Implement Abstraction:
 * - Use abstract classes and interfaces to define blueprints.
 * - Abstract classes may contain abstract methods (without a body) that must be implemented by concrete subclasses.
 * - Interfaces declare abstract methods that implementing classes must define.
 * <p>
 * ### Rules for Abstract Classes:
 * - Abstract classes cannot be instantiated directly.
 * - Abstract classes may contain abstract and concrete methods.
 * - Abstract methods must be implemented by concrete subclasses.
 * - Abstract classes can have constructors, which are called when an instance of a concrete subclass is created.
 * <p>
 * ### Key Points (Code Explanation):
 * - The `Shape` abstract class defines a blueprint for shapes with an abstract `draw()` method, a concrete `resize()` method,
 * and a static method. It also has a public constructor.
 * - The `Circle` class is a concrete subclass that extends `Shape` and provides an implementation for the `draw()` method.
 * - The `main` method demonstrates abstraction by creating an instance of the `Circle` class using a superclass reference.
 */
