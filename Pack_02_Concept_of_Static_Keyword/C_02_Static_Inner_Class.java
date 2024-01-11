package Pack_02_Concept_of_Static_Keyword;

/**
 * The `Outer` class contains a static inner class `Inner`. This example demonstrates
 * the usage of static inner classes and their interaction with outer class variables.
 */
class Outer {
    static int outerClassVariable = 10;

    /**
     * The static inner class `Inner` is nested within the `Outer` class.
     */
    static class Inner {
        static int innerClassVariable = 100;

        /**
         * Method to display information from the inner class.
         */
        void display() {
            System.out.println("InnerClassVariable: " + innerClassVariable);
            System.out.println("OuterClassVariable: " + outerClassVariable);
        }
    }
}

/**
 * The `C_02_Static_Inner_Class` class serves as the entry point for the program,
 * showcasing the usage of a static inner class and its interaction with outer class variables.
 */
public class C_02_Static_Inner_Class {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating an instance of the static inner class
        Outer.Inner in = new Outer.Inner();
        // Displaying information from the inner class
        in.display();
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * ### Static Inner Classes:
 * A static inner class is a nested class that belongs to the outer class rather than to instances of the outer class.
 * In this example, the `Inner` class is static and nested within the `Outer` class.
 * <p>
 * ### Static Variables in Inner Classes:
 * The `Inner` class has a static variable `innerClassVariable`, which is accessed directly within the inner class.
 * <p>
 * ### Interaction with Outer Class Variables:
 * The inner class has direct access to static variables of the outer class. In this example, `Inner` can access
 * the `outerClassVariable` of the `Outer` class without creating an instance of the outer class.
 */
