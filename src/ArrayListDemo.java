/**
 * Created by Ryan on 11/28/16.
 */
import java.util.ArrayList;

class Fruit {
    String name;
    String type;
    Fruit(String type, String name) {
        this.name = name;
        this.type = type;
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList of fruit objects
        ArrayList<Fruit> fruits = new ArrayList<>();

        Fruit aFruit = new Fruit("Tangerine", "Orange");
        Fruit banana = new Fruit("red", "banana");
        Fruit apple = new Fruit("honeycrisp", "apple");

        fruits.add(aFruit);
        fruits.add(banana);
        fruits.add(apple);

        // iterating across ArrayList of objects with enhanced for loop
        for(Fruit fruit : fruits) {
            System.out.println(fruit.type + " " + fruit.name);
        }

        // iterating across ArrayList w/ plain ol' for loop
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i).type + " " + fruits.get(i).name);
        }
    }
}
