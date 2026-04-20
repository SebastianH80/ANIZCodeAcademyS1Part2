package Lesson33.CustomException;

class NoToiletPaperException extends Exception {
    public NoToiletPaperException(String message) {
        super(message);
    }
}