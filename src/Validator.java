/**
 * Created by Moravia on 11/16/16.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Validator {
    // this is the class with all the validating methods

    public int getInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        int userInput;

        System.out.println(prompt);

        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            return getInt(prompt);
        }
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int userInput = getInt(prompt);

        try {
            if(userInput < min || userInput > max) {
                throw new InputMismatchException();
            }
            return userInput;
        } catch (InputMismatchException e) {
            return getIntWithinRange(prompt, min, max);
        }


    }

//    public double getDouble(String prompt) {
//
//    }
//
//    public double getDoubleWithinRange(String prompt, double min, double max) {
//
//    }
//
//    public String getRequiredString(String prompt) {
//
//    }
//
//    public String getChoiceString(String prompt, String s1, String s2) {
//
//    }

}
