package Pack_04_Inheritance;

/**
 * The `Parent` class serves as the immediate parent class for the `Child` class.
 */
class Parent {
    // Member variable
    int num = 10;

    // Constructor
    Parent() {
        System.out.println("Parent Class Constructor");
    }

    // Method
    void display() {
        System.out.println("Parent Class Method");
    }
}

/**
 * The `Child` class extends the `Parent` class, demonstrating the use of the `super` keyword.
 */
class Child extends Parent {
    // Member variable specific to the Child class
    int num = 20;

    // Constructor
    Child() {
        super(); // Call to the constructor of the immediate superclass (Parent)
        System.out.println("Child Class Constructor");
    }

    // Method overridden from the superclass
    @Override
    void display() {
        System.out.println("Child Class Method");
        super.display(); // Call to the display method of the immediate superclass (Parent)
    }
}

/**
 * The `C_04_Super_Keyword` class serves as the entry point for the program,
 * demonstrating the use of the `super` keyword in Java.
 */
public class C_04_Super_Keyword {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create an instance of the Child class
        Child c1 = new Child();

        // Call the display method of the Child class
        c1.display();
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * ### `super` Keyword:
 * The `super` keyword in Java is a reference variable used to refer to the immediate parent class object.
 * It is used to invoke the immediate parent class methods, access parent class fields, and invoke the parent class constructor.
 * <p>
 * ### Why `super` Keyword is Required:
 * - **Accessing Superclass Members:** When a subclass has a member with the same name as a member in the superclass,
 * the `super` keyword helps differentiate and access the superclass member.
 * - **Invoking Superclass Methods:** It is used to invoke methods of the immediate parent class when overridden in the subclass.
 * - **Invoking Superclass Constructor:** The `super()` statement is used to call the constructor of the immediate parent class.
 * <p>
 * ### Conditions for Using `super` Keyword:
 * 1. **To Call Superclass Methods:**
 * - Used when a method in a subclass has the same name as a method in the superclass, and we want to call the superclass method.
 * - Example: `super.display();` in the `Child` class.
 * <p>
 * 2. **To Access Superclass Fields:**
 * - Used to access the member variables of the immediate parent class when they are hidden by a variable in the subclass.
 * - Example: `super.num;` in the `Child` class.
 * <p>
 * 3. **To Invoke Superclass Constructor:**
 * - Used to call the constructor of the immediate parent class from the constructor of the subclass.
 * - Example: `super();` in the constructor of the `Child` class.
 */
