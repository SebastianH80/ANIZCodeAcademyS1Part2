package Lesson33.Validator;
//Strategy Pattern = vi kan skifte adfærd (regler) uden at ændre klassen
interface BrightnessValidator {
    void validate(int brightness) throws Exception;
}