package Pack_01_Class_Object_Constructor_Method;

/**
 * The `Student` class represents a basic model for student information, including name, age, and marks.
 * It demonstrates the use of constructors, copy constructors, and method invocation in Java.
 */
class Student {

    // Fields to store student information
    String name;
    int age;
    int marks;

    /**
     * Constructor with 3 parameters.
     * @param name The name of the student.
     * @param age The age of the student.
     * @param marks The marks obtained by the student.
     */
    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    /**
     * Constructor with 2 parameters.
     * @param name The name of the student.
     * @param marks The marks obtained by the student.
     */
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    /**
     * Copy constructor.
     * @param ref Another `Student` object to copy from.
     */
    Student(Student ref) {
        this.name = ref.name;
        this.age = ref.age;
        this.marks = ref.marks;
    }

    /**
     * Copy constructor with an additional parameter.
     * @param ref Another `Student` object to copy from.
     * @param marks The updated marks for the new student.
     */
    Student(Student ref, int marks) {
        this.name = ref.name;
        this.age = ref.age;
        this.marks = marks;
    }

    /**
     * Method to display student information.
     */
    void display() {
        System.out.println(name + " " + age + " " + marks);
    }
}

/**
 * The `C_01_Main` class serves as the entry point for the program,
 * showcasing the usage of the `Student` class by creating objects and invoking methods.
 */
public class C_01_Main {
    /**
     * The main method where the program execution begins.
     * @param args Command-line arguments (unused in this program).
     */
    public static void main(String[] args) {

        // Creating instances of the Student class and displaying information
        Student st1 = new Student("Sushil", 20, 19);
        st1.display();

        Student st2 = new Student("Sushil Soniwal", 20, 16);
        st2.display();

        Student st3 = new Student(st2, 17);
        st3.display();

        Student st4 = new Student(st2);
        st4.display();

        Student st5 = new Student("Brendon", 18);
        st5.display();
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 *
 * ### Classes:
 * Classes are the blueprint for objects. The `Student` class defines the structure and behavior of student objects,
 * including attributes like name, age, and marks, as well as methods for initialization and display.
 *
 * ### Objects:
 * Objects are instances of a class. In this program, instances of the `Student` class (st1, st2, etc.) represent
 * individual students with specific attributes and behaviors.
 *
 * ### Constructors:
 * Constructors are special methods used to initialize objects. In the `Student` class, there are constructors
 * with different parameters to create instances of the class.
 *
 * ### Constructor Overloading:
 * Constructor overloading allows a class to have multiple constructors with different parameter lists.
 * The `Student` class demonstrates constructor overloading with constructors accepting 2 or 3 parameters.
 *
 * ### Copy Constructors:
 * Copy constructors create a new object by copying the attributes of an existing object. The `Student` class
 * has two copy constructors, one with the same attributes and another with an additional parameter.
 *
 * ### Method Invocation:
 * The `display` method in the `Student` class is an example of method invocation. It is called on instances of
 * the class to display student information.
 *
 * ### Object Creation:
 * The `main` method in the `C_01_Main` class demonstrates creating instances of the `Student` class, showcasing
 * different constructors and copy constructors.
 */