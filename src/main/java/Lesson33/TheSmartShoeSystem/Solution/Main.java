package Lesson33.TheSmartShoeSystem.Solution;

//import Lesson33.TheSmartShoeSystem.Solution.Shoe;
import Lesson33.TheSmartShoeSystem.validation.*;
import Lesson33.TheSmartShoeSystem.exception.InvalidShoeSizeException;

/**
 * Main class for testing different validators
 */
public class Main {

    public static void main(String[] args) {

        Shoe shoe = new Shoe(new NormalValidator());

        try {
            shoe.setSize(40); // valid
            //shoe.printInfo();

            shoe.setSize(60); // invalid
        } catch (InvalidShoeSizeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Switch to SportsValidator
        shoe.setValidator(new SportsValidator());

        try {
            shoe.setSize(45); // valid
            shoe.printInfo();

            shoe.setSize(50); // invalid
        } catch (InvalidShoeSizeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Switch to LuxuryValidator
        shoe.setValidator(new LuxuryValidator());

        try {
            shoe.setSize(42); // valid
            shoe.printInfo();

            shoe.setSize(50); // invalid
        } catch (InvalidShoeSizeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}