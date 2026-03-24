package ZooSystem;

/**
 * Dog is a concrete class that IMPLEMENTS the Animal interface.
 * 
 * UML Relationship:
 * Dog --------▷ Animal (Realization)
 * 
 * This means:
 * - Dog must provide implementation for makeSound()
 * - Dog "is a type of" Animal
 */

public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof");
    }
}
