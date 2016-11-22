/**
 * Created by Moravia on 11/21/16.
 */
import java.util.Scanner;

public class LuckyColorDiscount {
    public static void main(String[] args) {
        double payment;
        double discount;
        String discountInformation;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your total before the discount: ");
        payment = sc.nextDouble();

        // Get a random number between 1 and 6 (inclusive)
        int random = (int) Math.ceil(Math.random() * 6);

        if(random == 1) {
            discount = Colors.RED.applyDiscount(payment);
        } else if(random == 2) {
            discount = Colors.BLUE.applyDiscount(payment);
        } else if(random == 3) {
            discount = Colors.YELLOW.applyDiscount(payment);
        } else if(random == 4) {
            discount = Colors.GREEN.applyDiscount(payment);
        } else if (random == 5) {
            discount = Colors.PURPLE.applyDiscount(payment);
        } else {
            discount = Colors.PINK.applyDiscount(payment);
        }

        discountInformation = outputDiscount(payment, discount);

        System.out.println(discountInformation);

        sc.close();
    }

    protected static String outputDiscount(double payment, double discount) {
        double total = payment - discount;
        return "The discount for $" + String.format("%.2f", payment) + " is $" + String.format("%.2f", discount) + " for a grand total of $" + String.format("%.2f", total);
    }
}
