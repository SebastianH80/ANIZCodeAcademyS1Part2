package Lesson33.TheSmartShoeSystem.Solution;


import Lesson33.TheSmartShoeSystem.exception.InvalidShoeSizeException;
import Lesson33.TheSmartShoeSystem.validation.ShoeValidator;

/**
 * Luxury shoe rules: 40–45
 */
public class LuxuryValidator implements ShoeValidator {

    @Override
    public void validate(int size) throws InvalidShoeSizeException {
        if (size < 40 || size > 45) {
            throw new InvalidShoeSizeException("Luxury shoes must be between 40 and 45");
        }
    }
}