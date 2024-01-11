package Pack_02_Concept_of_Static_Keyword;

/**
 * The Human class represents a person with attributes such as name, age, and gender.
 */
class Human {
    // Instance variables
    String name;
    int age;
    String gender;

    // Class variable to keep track of the population
    static int population;

    // Static block initializes the population and prints a message.
    static {
        population = 100;
        System.out.println("Static Block Initialized");
    }

    /**
     * Constructor for the Human class.
     *
     * @param name   The name of the human.
     * @param age    The age of the human.
     * @param gender The gender of the human.
     */
    Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        // Increment the population when a new human is created
        Human.population += 1;
    }

    /**
     * Static method to check if a human can vote based on age.
     *
     * @param human The human to check for voting eligibility.
     * @return True if the human can vote, false otherwise.
     */
    static boolean canVote(Human human) {
        return (human.age >= 18);
    }

    //  Method to display information about the human.
    void display() {
        System.out.println(name + " " + age + " " + gender);
    }
}

/**
 * The `C_01_Main` class serves as the entry point for the program,
 * showcasing the usage of the `Human` class and demonstrating static variables and methods.
 */
public class C_01_Main {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Creating instances of the Human class
        Human person1 = new Human("Sushil", 20, "Male");
        Human person2 = new Human("Sushila", 20, "Female");

        // Displaying information about the created humans
        person1.display();
        person2.display();

        // Displaying the current population
        System.out.println("Current Population: " + Human.population);

        // Checking if a human can vote
        System.out.println("Can " + person1.name + " vote? " + Human.canVote(person1));
    }
}

/**
 * ## Object-Oriented Programming (OOP) Concepts:
 * <p>
 * ### Static Variables and Methods:
 * Static variables and methods belong to the class rather than instances of the class. In the `Human` class,
 * the `population` variable is static, shared among all instances, and the `canVote` method is a static method
 * that checks voting eligibility based on age.
 * <p>
 * ### Static Block:
 * The static block in the `Human` class is executed when the class is loaded. It is used here to initialize
 * the static variable `population` and prints a message. Static blocks are executed only once when the class is
 * loaded into memory.
 */
