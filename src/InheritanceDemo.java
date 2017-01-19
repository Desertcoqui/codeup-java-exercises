import java.util.Scanner;

/**
 * Created by PapoteDetres1 on 1/18/17.
 */


public class InheritanceDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.make = "bamboo";
        vehicle.model = "rickshaw";
        vehicle.accelerate();
        System.out.println("My vehicle is a " + vehicle.make + " " + vehicle.model + " and I have traveled " + vehicle.miles + " in it.");
        vehicle.honk();

        System.out.println();
        System.out.println("Below is the truck");
        Truck truck = new Truck();
        truck.make = "Toyota";
        truck.model = "Pickup";
        truck.accelerate();
        truck.accelerate();
        truck.accelerate();
        truck.honk();
        truck.honk("HONK HONK HONK HONK");
        System.out.println("My vehicle is a " + truck.make + " " + truck.model + " and I have traveled " + truck.miles + " in it.");

        ATV myMudder= new ATV();
        myMudder.make = "DMX";
        myMudder.model = "Hoopty";
        myMudder.numberOfWheels = 4;
        myMudder.existsOnRapAlbumCovers = true;
        myMudder.accelerate();
        myMudder.accelerate();
        myMudder.decelerate();
        System.out.println("My vehicle is a " + myMudder.make + " " + myMudder.model + ".");
        System.out.println("it has" + myMudder.numberOfWheels + " number of wheels");
        System.out.println("It has travled " + myMudder.miles + " and has a current speed of " + myMudder.speed + ".");
        if(myMudder.existsOnRapAlbumCovers) {
            System.out.println("Somebody better pay me some royalties");
        }

        System.out.println(myMudder.getClass());
        System.out.println(myMudder instanceof Vehicle);
        System.out.println(myMudder instanceof Motorcycle);
        System.out.println(myMudder instanceof ATV);

        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);

        String vehicleType = validator.getString(sc,"What kind of vehicle do you want to make?");

        // the myNewVehicle variable can hold ANY type of object that is or has a vehicle parent
        Vehicle myNewVehicle = new Vehicle();


        if(vehicleType.equalsIgnoreCase("van")) {
            myNewVehicle = new Van();
        }

        if(vehicleType.equalsIgnoreCase("ATV")) {
            myNewVehicle = new ATV();
        }

        if(vehicleType.equalsIgnoreCase("Truck")) {
            myNewVehicle = new Truck();
        }

        System.out.println("My new vehicle is a " + myNewVehicle.getClass());



    }
}

class Vehicle {
    String make;
    String model;
    int miles;
    int speed;

    public final void accelerate() {
        speed++;
        miles++;
    }

    public final void decelerate() {
        speed--;
        miles++;
    }

    public void honk() {
        System.out.println("beep beep");
    }
}

class Truck extends Vehicle {
    int towingCapacity;
    boolean hasFourWheelDrive;

    public void honk() {
        System.out.println("HONK HONK");
    }

    public void honk(String honkSound) {
        System.out.println(honkSound);
    }
}

class Van extends Vehicle {
    boolean hasIceCream;
}

class Motorcycle extends Vehicle {
    short numberOfWheels;


}

class ATV extends Motorcycle {
    boolean existsOnRapAlbumCovers;
}

class RV extends Vehicle {

}

class Boat extends Vehicle {
    public void honk() {
        System.out.println("<insert loud boat horn here>");
    }
}

class SpeedBoat extends Boat {

}