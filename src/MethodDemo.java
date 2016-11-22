/**
 * Created by Ryan on 11/14/16.
 */
public class MethodDemo {
    public static void main(String[] args) {
        recurToTen(1);
    }

    private static void countToTen() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static int recurToTen(int n) {
        if(n <= 10) {
            System.out.println(n);
            return recurToTen(n + 1);
        } else {
            return n;
        }
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static int rollSixSidedDie() {
        return (int) Math.ceil(Math.random() * 6);
    }

}
