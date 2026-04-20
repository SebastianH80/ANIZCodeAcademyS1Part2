package Lesson33.TheSmartShoeSystem.Solution;


import Lesson33.TheSmartShoeSystem.exception.InvalidShoeSizeException;
import Lesson33.TheSmartShoeSystem.validation.ShoeValidator;

/**
 * Sports shoe rules: 38–48
 */
public class SportsValidator implements ShoeValidator {

    @Override
    public void validate(int size) throws InvalidShoeSizeException {
        if (size < 38 || size > 48) {
            throw new InvalidShoeSizeException("Sports shoes must be between 38 and 48");
        }
    }
}