package Lesson33.CustomException;

public class Main {
    public static void main(String[] args) {
        ToiletPaper tp = new ToiletPaper(2);

        try {
            tp.useRoll(); // OK
            tp.useRoll(); // OK
            tp.useRoll(); // fejl
        } catch (NoToiletPaperException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final rolls: " + tp.getRolls());
    }
}