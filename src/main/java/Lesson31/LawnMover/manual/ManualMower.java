package Lesson31.LawnMover.manual;


import Lesson31.LawnMover.interfaces.Mower;

public class ManualMower implements Mower {

    public void mow() {
        System.out.println("Manual mower is cutting grass...");
    }
}