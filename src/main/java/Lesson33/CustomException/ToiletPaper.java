package Lesson33.CustomException;

class ToiletPaper {
    private int rolls; // encapsulated

    public ToiletPaper(int rolls) {
        this.rolls = rolls;
    }

    public int getRolls() {
        return rolls;
    }

    // Brug toiletpapir
    public void useRoll() throws NoToiletPaperException {
        if (rolls <= 0) {
            throw new NoToiletPaperException("No toilet paper left!");
        }
        rolls--;
        System.out.println("Used 1 roll. Rolls left: " + rolls);
    }

    // Fyld op
    public void addRolls(int amount) {
        if (amount > 0) {
            rolls += amount;
            System.out.println("Added " + amount + " rolls.");
        }
    }
}