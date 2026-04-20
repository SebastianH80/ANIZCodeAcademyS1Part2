package Lesson33.TheSmartShoeSystem.Solution;


import Lesson33.TheSmartShoeSystem.validation.ShoeValidator;
import Lesson33.TheSmartShoeSystem.exception.InvalidShoeSizeException;

/**
 * Shoe class demonstrates:
 * - Encapsulation
 * - Strategy Pattern
 */
public class Shoe {

    private int size;
    private ShoeValidator validator;

    public Shoe(ShoeValidator validator) {
        this.validator = validator;
    }

    public void setValidator(ShoeValidator validator) {
        this.validator = validator;
    }

    public void setSize(int size) throws InvalidShoeSizeException {
        validator.validate(size);
        this.size = size;
        System.out.println("Size set to: " + size);
    }

    public int getSize() {
        return size;
    }

    /**
     * Extra method for extension exercise
     */
    public void printInfo() {
        System.out.println("Size: " + size);
        System.out.println("Validator: " + validator.getClass().getSimpleName());
    }
}