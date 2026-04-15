package Lesson31.LawnMover.robot;


import Lesson31.LawnMover.interfaces.Maintenance;
import java.time.LocalDateTime;

public class RobotMaintenance implements Maintenance {

    private LocalDateTime lastService;

    public void service(LocalDateTime date) {
        lastService = date;
    }

    public String getLastService() {
        return lastService == null ? "No service yet" : lastService.toString();
    }
}