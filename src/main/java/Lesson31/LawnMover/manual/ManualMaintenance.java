package Lesson31.LawnMover.manual;


import Lesson31.LawnMover.interfaces.Maintenance;
import java.time.LocalDateTime;

/**
 * The ManualMaintenance class implements the Maintenance interface and keeps track
 * of the last time the manual mower was serviced.
 *
 * It stores the date of the most recent maintenance and allows it to be retrieved
 * as a formatted string.
 *
 * If no maintenance has been performed yet, it returns a default message indicating this.
 *
 * This class demonstrates how state (data over time) is managed within the system.
 */
public class ManualMaintenance implements Maintenance {

    private LocalDateTime lastService;

    public void service(LocalDateTime date) {
        lastService = date;
    }

    public String getLastService() {
        return lastService == null ? "No service yet" : lastService.toString();
    }
}