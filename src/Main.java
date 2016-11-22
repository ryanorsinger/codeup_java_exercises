import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args)
    {
        int sidesOfDice = 0;
        int rollResult;

        sidesOfDice = getSidesOfDice();
        rollResult = rollDice(sidesOfDice);

        System.out.println("You rolled a " + rollResult);
    }

    public static int getSidesOfDice() {
        Scanner sc = new Scanner(System.in);
        int sidesOfDice = 0;
        boolean inputIsValid;


        System.out.println("Please input the number of sides of dice");
        try {
            sidesOfDice = sc.nextInt(); //.nextInt() throws InputMismatch if input aint Integer
            if (sidesOfDice <= 0){
                // If sidesOfDice is negative or zero, throw InputMismatch
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Only input whole numbers greater than 0");
            return getSidesOfDice();
        }

        return sidesOfDice;
    }

    public static int rollDice(int numberOfSides) {
        return (int) Math.ceil(Math.random() * numberOfSides);
    }
}
