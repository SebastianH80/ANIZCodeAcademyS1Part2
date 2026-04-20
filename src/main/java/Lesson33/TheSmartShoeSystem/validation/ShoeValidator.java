package Lesson33.TheSmartShoeSystem.validation;


import Lesson33.TheSmartShoeSystem.exception.InvalidShoeSizeException;

/**
 * Strategy interface for validation
 * Different implementations = different rules
 */
public interface ShoeValidator {

    // Method every validator must implement
    void validate(int size) throws InvalidShoeSizeException;
}