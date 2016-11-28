/**
 * Created by Moravia on 11/28/16.
 */
import java.util.ArrayList;

class Fruit {
    String name;
    Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        Fruit aFruit = new Fruit("Orange");
        Fruit anotherFruit = new Fruit("Apple");

        ArrayList<Fruit> fruits = new ArrayList<>();

        fruits.add(aFruit);
        fruits.add(anotherFruit);

        for (Fruit fruit : fruits) {
            System.out.println(fruit.toString());
        }
    }
}
