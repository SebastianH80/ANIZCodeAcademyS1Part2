package Lesson31.LawnMover.sensor;


import Lesson31.LawnMover.model.LawnSize;

import java.util.Random;

/**
 * The Sensor class simulates a real-world sensor that detects the size of a lawn.
 *
 * It randomly generates a lawn size (SMALL, MEDIUM, or LARGE), which is then used
 * by the system to decide which type of mower should be used.
 *
 * This introduces dynamic behavior into the system and removes the need for
 * manual selection by the user.
 */
public class Sensor {

    private Random random = new Random();

    public LawnSize detectLawnSize() {

        int value = random.nextInt(3);

        if (value == 0) return LawnSize.SMALL;
        if (value == 1) return LawnSize.MEDIUM;
        return LawnSize.LARGE;
    }
}