/**
 * Created by PapoteDetres1 on 1/17/17.
 */
public class Car {

    public String make;
    public String model;
    public int miles;

    // number of cars created
    public static int numberOfCarsProduced;

    public Car(String make, String model, int miles) {
        this.make = make;
        this.model = model;
        this.miles = miles;
        numberOfCarsProduced++;
    }

    public static int getNumberOfCarsProduced() {
        return numberOfCarsProduced;
    }

    public static void getCarsThatHaveBeenRecalled() {
        System.out.println("Corollas and Audis have been recalled");
    }
}