package ZooSystem;

/**
 * Scenario:
 * We are building a Zoo System where we have different types of animals.
 * Each animal has a behavior: making a sound.
 * 
 * Design Idea:
 * Instead of writing separate unrelated classes, we define a common interface.
 * This allows us to treat all animals in a unified way.
 * 
 * UML Concept:
 * This represents an INTERFACE.
 * Later, classes like Dog, Cat, Cow will implement it (Realization relationship).
 */

public interface Animal {
    
    /**
     * Each animal must implement this behavior.
     */
    public void makeSound();
}
