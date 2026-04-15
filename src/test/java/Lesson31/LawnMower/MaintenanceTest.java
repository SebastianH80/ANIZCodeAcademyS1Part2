package Lesson31.LawnMower;


import Lesson31.LawnMover.manual.ManualMaintenance;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class MaintenanceTest {

    @Test
    public void testNoServiceYet() {

        ManualMaintenance maintenance = new ManualMaintenance();

        assertEquals("No service yet", maintenance.getLastService());
    }

    @Test
    public void testServiceUpdatesDate() {

        ManualMaintenance maintenance = new ManualMaintenance();

        LocalDateTime now = LocalDateTime.of(2024, 1, 1, 10, 0);

        maintenance.service(now);

        assertEquals(now.toString(), maintenance.getLastService());
    }

    @Test
    public void testServiceMultipleTimes() {

        ManualMaintenance maintenance = new ManualMaintenance();

        LocalDateTime first = LocalDateTime.of(2024, 1, 1, 10, 0);
        LocalDateTime second = LocalDateTime.of(2024, 2, 1, 10, 0);

        maintenance.service(first);
        maintenance.service(second);

        assertEquals(second.toString(), maintenance.getLastService());
    }
}