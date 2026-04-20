package Lesson33.TheSmartShoeSystem.model;


import Lesson33.TheSmartShoeSystem.validation.ShoeValidator;
import Lesson33.TheSmartShoeSystem.exception.InvalidShoeSizeException;

/**
 * Shoe class uses:
 * - Encapsulation (private fields)
 * - Strategy Pattern (validator can be changed)
 */
public class Shoe {

    // Encapsulated field (cannot be accessed directly)
    private int size;

    // Strategy (validator can change)
    private ShoeValidator validator;

    /**
     * Constructor where validator is injected
     */
    public Shoe(ShoeValidator validator) {
        this.validator = validator;
    }

    /**
     * Setter for validator (allows switching strategy at runtime)
     */
    public void setValidator(ShoeValidator validator) {
        this.validator = validator;
    }

    /**
     * Setter for size with validation
     */
    public void setSize(int size) throws InvalidShoeSizeException {

        // Use strategy to validate input
        validator.validate(size);

        // Only set size if validation passes
        this.size = size;

        System.out.println("Shoe size set to: " + size);
    }

    /**
     * Getter for size
     */
    public int getSize() {
        return size;
    }
}