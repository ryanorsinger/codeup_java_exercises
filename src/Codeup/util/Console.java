package Codeup.util;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Created by Moravia on 11/18/16.
 */
public class Console {

    public void sayHi() {
        System.out.println("Howdy");
    }

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

}
