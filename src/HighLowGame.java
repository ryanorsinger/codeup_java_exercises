/**
 * Created by Ryan on 11/16/16.
 *
 * The specs for the game are:
 * Game picks a random number between 1 and 100.
 * Prompts user to guess the number
 * All user inputs are validated
 * If user's guess is less than the number, it outputs "HIGHER"
 * If user's guess is more than the number, it outputs "LOWER"
 * If a user guesses the number, the game should declare "GOOD GUESS!"
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class HighLowGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userWantsToContinue;

        do {
            playHighLowGame();
            System.out.println("Do you want to play again? y/n");
            userWantsToContinue = sc.next();
        } while (userWantsToContinue.equalsIgnoreCase("y") || userWantsToContinue.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing, yay!");
    }

    private static void playHighLowGame() {
        int random;
        int userGuess;

        random = getRandomInt();

        do {
            userGuess = getUserGuess();

            System.out.println("The game guessed " + random);

            if (random > userGuess) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }

        } while(random != userGuess);

        System.out.println("Good guess!");
    }

    private static int getRandomInt() {
        return (int) Math.ceil(Math.random() * 100);
    }

    private static int getUserGuess() {
        int userInput;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please guess a number between 1 and 100: ");

        try {
            userInput = sc.nextInt();
            if(userInput < 1 || userInput > 100) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Guess must be an integer");
            return getUserGuess();
        }

        return userInput;
    }
}
