package Pack_04_Inheritance;

/**
 * The `Box` class represents a simple geometric box with length and width.
 */
class Box {
    int length;
    int width;

    Box(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

/**
 * The `BoxHeight` class extends the `Box` class and introduces an additional 'height' attribute.
 */
class BoxHeight extends Box {
    int height;

    BoxHeight(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }
}

/**
 * The `C_05_Inheritance_Working` class serves as the entry point for the program,
 * demonstrating the working of inheritance and type compatibility.
 */
public class C_05_Inheritance_Working {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Line 1: Creating a `Box` object
        Box b = new Box(5, 4);
        System.out.println(b.length + " " + b.width);

        // Line 2: Creating a `BoxHeight` object
        BoxHeight bh = new BoxHeight(3, 4, 5);
        System.out.println(bh.length + " " + bh.width + " " + bh.height);

        /**
         * Line 3: Creating a `Box` object and accessing 'height' (will not compile).
         * This line will result in a compilation error because 'height' is not a
         * member of the `Box` class.
         */
        // Box b = new BoxHeight(6, 7, 8);
        // System.out.println(b.height);

        /**
         * Line 4: Creating a `BoxHeight` object with a `Box` constructor (will not compile)
         * This line will result in a compilation error because `BoxHeight` is a subclass
         * of `Box`, and you cannot assign a `Box` object to a `BoxHeight` variable.
         */
        // BoxHeight bh = new Box(4, 6);
        // bh.height = 10;

    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * ### Inheritance Working and Type Compatibility:
 * The provided code snippet demonstrates the concept of inheritance, specifically concerning type compatibility
 * between the superclass and its subclass. It involves creating objects of both the superclass (`Box`) and
 * the subclass (`BoxHeight`) and understanding the limitations and errors that arise due to their relationships.
 * <p>
 * ### Key Points:
 * 1. **Creating Objects:**
 * - Line 1: Creating a `Box` object (`b`) with length and width attributes.
 * - Line 2: Creating a `BoxHeight` object (`bh`) with length, width, and height attributes.
 * <p>
 * 2. **Type Compatibility:**
 * - Line 3: Attempting to create a `Box` object (`b`) and accessing 'height' (will not compile).
 * - Explanation: This line results in a compilation error because 'height' is not a member of the `Box` class.
 * - Concept: You cannot access subclass-specific members using a reference variable of the superclass.
 * <p>
 * - Line 4: Attempting to create a `BoxHeight` object (`bh`) with a `Box` constructor (will not compile).
 * - Explanation: This line results in a compilation error because `BoxHeight` is a subclass of `Box`,
 * and you cannot assign a `Box` object to a `BoxHeight` variable directly.
 * - Concept: While a subclass object can be assigned to a superclass reference variable, the reverse is not allowed
 * without explicit type casting, as a superclass object may not have all the members of the subclass.
 */
