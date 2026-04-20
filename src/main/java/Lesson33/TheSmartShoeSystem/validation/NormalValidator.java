package Lesson33.TheSmartShoeSystem.validation;


import Lesson33.TheSmartShoeSystem.exception.InvalidShoeSizeException;

/**
 * Normal shoe size rules
 * Example: size must be between 35 and 50
 */
public class NormalValidator implements ShoeValidator {

    @Override
    public void validate(int size) throws InvalidShoeSizeException {

        // Check if size is outside valid range
        if (size < 35 || size > 50) {
            throw new InvalidShoeSizeException("Normal shoes must be between 35 and 50");
        }
    }
}