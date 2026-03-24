package ZooSystem;

/**
 * Another Animal type.
 * 
 * Notice:
 * All animals share the same interface,
 * but each provides different behavior.
 */

public class Cow implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Cow says: Moo");
    }
}
