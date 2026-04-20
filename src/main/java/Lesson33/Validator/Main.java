package Lesson33.Validator;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(new NormalValidator());

        try {
            lamp.setBrightness(50);   // OK
            lamp.setBrightness(150);  // FEJL
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Skift strategi!
        lamp.setValidator(new PositiveOnlyValidator());

        try {
            lamp.setBrightness(150);  // OK nu
            lamp.setBrightness(-10);  // FEJL
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}