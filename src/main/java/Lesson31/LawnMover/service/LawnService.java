package Lesson31.LawnMover.service;


import Lesson31.LawnMover.interfaces.*;

import java.time.LocalDateTime;

/**
 * The LawnService class acts as the central coordinator of the system.
 *
 * It uses a MowerFactory to create the required components and then manages
 * how these components interact during execution.
 *
 * The class does not know the specific implementations of the objects it uses,
 * only their interfaces. This ensures loose coupling and flexibility.
 *
 * Its main responsibility is to determine whether the lawn should be cut,
 * perform the mowing action, and manage maintenance operations.
 */
public class LawnService {

    //Binder hele systemet sammen
    private Mower mower;
    private CuttingStrategy cutting;
    private Maintenance maintenance;

    public LawnService(MowerFactory factory) {
        mower = factory.createMower();
        cutting = factory.createCuttingStrategy();
        maintenance = factory.createMaintenance();
    }

    public void run() {
        if (cutting.shouldCut(LocalDateTime.now())) {
            mower.mow();
        } else {
            System.out.println("No need to cut today 🌱");
        }
    }

    public void serviceNow() {
        maintenance.service(LocalDateTime.now());
        System.out.println(LocalDateTime.now());
    }

    public String lastService() {
        return maintenance.getLastService();
    }
}