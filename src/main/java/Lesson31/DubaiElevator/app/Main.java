package Lesson31.DubaiElevator.app;

import Lesson31.DubaiElevator.interfaces.ElevatorFactory;
import Lesson31.DubaiElevator.luxury.LuxuryFactory;
import Lesson31.DubaiElevator.standard.StandardFactory;
import Lesson31.DubaiElevator.emergency.EmergencyFactory;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                boolean running = true;

                System.out.println("🏙️ Welcome to Dubai Elevator System!");

                while (running) {

                    System.out.println("\nChoose elevator system:");
                    System.out.println("1. Standard");
                    System.out.println("2. Luxury (VIP)");
                    System.out.println("3. Emergency");
                    System.out.println("0. Exit");

                    System.out.print("Your choice: ");
                    int choice = scanner.nextInt();

                    ElevatorFactory factory = null;

                    // 🔹 if/switch logik
                    switch (choice) {
                        case 1:
                            factory = new StandardFactory();
                            break;
                        case 2:
                            factory = new LuxuryFactory();
                            break;
                        case 3:
                            factory = new EmergencyFactory();
                            break;
                        case 0:
                            running = false;
                            System.out.println("Goodbye ");
                            continue;
                        default:
                            System.out.println("Invalid choice!");
                            continue;
                    }

                    // Kør system
                    ElevatorSystem system = new ElevatorSystem(factory);

                    System.out.println("\nRunning system...");
                    system.run();

                    // ekstra interaction
                    System.out.println("\nRun again? (yes/no)");
                    String again = scanner.next();

                    if (!again.equalsIgnoreCase("yes")) {
                        running = false;
                        System.out.println("System shutting down...");
                    }
                }

                scanner.close();
            }
        }
