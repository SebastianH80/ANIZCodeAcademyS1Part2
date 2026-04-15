package Lesson31.LawnMover.robot;

import Lesson31.LawnMover.interfaces.Mower;

public class RobotMower implements Mower {

    public void mow() {
        System.out.println("Robot mower is mowing automatically 🤖");
    }
}