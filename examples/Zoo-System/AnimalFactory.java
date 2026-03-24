package ZooSystem;

/**
 * AnimalFactory is responsible ONLY for creating Animal objects.
 * 
 * Design Pattern:
 * This is the Factory Pattern.
 * 
 * Main Responsibility:
 * - Centralize object creation
 * - Avoid duplication across classes
 * 
 * UML Relationship:
 * AnimalFactory - - - > Dog / Cat / Cow (Dependency)
 * 
 * Important:
 * Factory USES these classes but does not store them.
 */

public class AnimalFactory {

    /**
     * Factory Method:
     * Creates objects based on input type
     */
    public Animal createAnimal(String type) {

        /**
         * Important Teaching Point:
         * We did NOT remove if-else.
         * 
         * We MOVED it to one place.
         * 
         * This makes:
         * - system cleaner
         * - easier to maintain
         */

        if (type.equalsIgnoreCase("dog")) {
            return new Dog();

        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();

        } else if (type.equalsIgnoreCase("cow")) {
            return new Cow();

        } else {
            throw new IllegalArgumentException("Unknown Animal Type");
        }
    }
}
