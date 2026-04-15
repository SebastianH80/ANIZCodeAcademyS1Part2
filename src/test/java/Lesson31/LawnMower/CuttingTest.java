package Lesson31.LawnMower;


import Lesson31.LawnMover.manual.ManualCutting;

import Lesson31.LawnMover.robot.RobotCutting;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class CuttingTest {

    @Test
    public void testManualCutting_evenDay_shouldCut() {

        ManualCutting cutting = new ManualCutting();

        LocalDateTime date = LocalDateTime.of(2024, 1, 2, 10, 0);

        assertTrue(cutting.shouldCut(date));
    }

    @Test
    public void testManualCutting_oddDay_shouldNotCut() {

        ManualCutting cutting = new ManualCutting();

        LocalDateTime date = LocalDateTime.of(2024, 1, 3, 10, 0);

        assertFalse(cutting.shouldCut(date));
    }

    @Test
    public void testRobotCutting_shouldAlwaysCut() {

        RobotCutting cutting = new RobotCutting();

        LocalDateTime date = LocalDateTime.now();

        assertTrue(cutting.shouldCut(date));
    }
}