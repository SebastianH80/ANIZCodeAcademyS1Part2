package Lesson33.TheSmartShoeSystem.app;

import Lesson33.TheSmartShoeSystem.model.Shoe;
import Lesson33.TheSmartShoeSystem.validation.NormalValidator;
import Lesson33.TheSmartShoeSystem.validation.KidsValidator;
import Lesson33.TheSmartShoeSystem.exception.InvalidShoeSizeException;

/**
 * Main class to test the Shoe system
 */
public class Main {

    public static void main(String[] args) {

        // Create shoe with NORMAL validation strategy
        Shoe shoe = new Shoe(new NormalValidator());

        try {
            // Valid size
            shoe.setSize(40);

            // Invalid size for normal shoes → exception
            shoe.setSize(60);

        } catch (InvalidShoeSizeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Switch strategy at runtime
        shoe.setValidator(new KidsValidator());

        try {
            // Valid for kids
            shoe.setSize(30);

            // Invalid for kids → exception
            shoe.setSize(50);

        } catch (InvalidShoeSizeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Final state
        System.out.println("Final shoe size: " + shoe.getSize());
    }
}