package Lesson33.Validator;

class NormalValidator implements BrightnessValidator {
    public void validate(int brightness) throws Exception {
        if (brightness < 0 || brightness > 100) {
            throw new Exception("Brightness must be between 0 and 100");
        }
    }
}