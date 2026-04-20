package Lesson33.Validator;

class Lamp {
    private int brightness; // encapsulated
    private BrightnessValidator validator; // strategy

    public Lamp(BrightnessValidator validator) {
        this.validator = validator;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setValidator(BrightnessValidator validator) {
        this.validator = validator;
    }

    public void setBrightness(int brightness) throws Exception {
        validator.validate(brightness); // strategy bruges her
        this.brightness = brightness;
        System.out.println("Brightness set to: " + brightness);
    }
}