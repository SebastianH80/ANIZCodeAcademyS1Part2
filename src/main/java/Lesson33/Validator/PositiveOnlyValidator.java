package Lesson33.Validator;

class PositiveOnlyValidator implements BrightnessValidator {
    public void validate(int brightness) throws Exception {
        if (brightness < 0) {
            throw new Exception("Brightness cannot be negative");
        }
    }
}