import java.util.Scanner;

/**
 * Created by PapoteDetres1 on 1/12/17.
 */

public class TrafficApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);

        String userChoice = validator.getString(scan, "Type in one of the following colors: BLUE, YELLOW or RED to find its function");
        TrafficLightColor light= TrafficLightColor.valueOf(userChoice);
        WhatItDoes(light);
    }
    private static void WhatItDoes(TrafficLightColor light) {
        if (light.equals(TrafficLightColor.RED)) {
            System.out.println("You were suppose to STOP");

        } else if (light.equals(TrafficLightColor.BLUE)) {
            System.out.println("The BLUE light is better on the eyes at night than Green. It means go");

        } else if (light.equals(TrafficLightColor.YELLOW)) {
            System.out.println("This is a yellow light, slow it down!");

        } else {

        }
    }
}




