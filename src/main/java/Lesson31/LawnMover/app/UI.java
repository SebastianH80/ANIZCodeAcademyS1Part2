package Lesson31.LawnMover.app;


import java.util.Scanner;

/**
 * The UI class handles all user interaction in the system.
 *
 * It is responsible for displaying menus, reading user input,
 * and presenting output to the user.
 *
 * By separating the UI from the business logic, the system becomes easier to maintain,
 * test, and extend.
 */
public class UI {

    private Scanner scanner = new Scanner(System.in);

    public int menu() {
        System.out.println("\n🌱 Lawn Mower System");
        System.out.println("1. Run mower");
        System.out.println("2. Service mower");
        System.out.println("3. Show last service");
        System.out.println("0. Exit");

        return scanner.nextInt();
    }
}