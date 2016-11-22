/**
 * Created by Moravia on 11/16/16.
 */
public class ValidatorTestApp {
    public static void main(String[] args) {
        Validator validator = new Validator();
        int min = 1;
        int max = 100;
        String prompt = "Enter a number between " + min + " and " + max;
        int userInteger;

        userInteger = validator.getIntWithinRange(prompt, min, max);

        System.out.println("The user entered " + userInteger);
    }
}
