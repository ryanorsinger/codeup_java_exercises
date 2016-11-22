/**
 * Created by Moravia on 11/16/16.
 */
public class CarApp {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setMiles(40000);
        myCar.setMake("Hyundai");

        String make = myCar.getMake();
        int miles = myCar.getMiles();

        System.out.println("My car is a " + make + " with " + miles + " miles.");

        Car justinCar = new Car();
        justinCar.setMiles(10);
        System.out.println("Justin's car has " + justinCar.getMiles() + " miles on it.");
    }
}
