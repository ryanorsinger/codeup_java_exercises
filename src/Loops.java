/**
 * Created by Moravia on 11/14/16.
 */
public class Loops {
    public static void main(String[] args) {
        System.out.println("While loop example below:");
        whileLoop();
        System.out.println("---");
        System.out.println("Do while loop example below:");
    }

    public static void whileLoop() {
        int i = 5;
        while(i <= 15) {
            System.out.println(i);
            i++;
        }
    }

}
