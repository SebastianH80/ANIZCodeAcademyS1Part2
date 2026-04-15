package Lesson31.LawnMover.app;


import Lesson31.LawnMover.interfaces.MowerFactory;
import Lesson31.LawnMover.manual.ManualFactory;
import Lesson31.LawnMover.model.LawnSize;
import Lesson31.LawnMover.robot.RobotFactory;
import Lesson31.LawnMover.sensor.Sensor;
import Lesson31.LawnMover.service.LawnService;

/**
 * The Main class is the entry point of the application.
 *
 * It initializes the system, uses the Sensor to detect the lawn size,
 * selects the appropriate factory, and starts the LawnService.
 *
 * This class is responsible for controlling the overall flow of the program,
 * but does not contain business logic itself.
 */
public class Main {




    public static void main(String[] args) {

        UI ui = new UI();
        // change factory here 👇



            Sensor sensor = new Sensor();

            // 🔥 Detect lawn automatically
            LawnSize size = sensor.detectLawnSize();

            System.out.println("Detected lawn size: " + size);

            MowerFactory factory;

            // 🔥 Choose correct factory
            if (size == LawnSize.SMALL) {
                factory = new ManualFactory();
            } else {
                factory = new RobotFactory();
            }



        LawnService service = new LawnService(factory);

        boolean running = true;

        while (running) {

            int choice = ui.menu();

            switch (choice) {
                case 1:
                    service.run();
                    break;
                case 2:
                    service.serviceNow();
                    break;
                case 3:
                    System.out.println(service.lastService());
                    break;
                case 0:
                    running = false;
                    break;
            }
        }
    }
}