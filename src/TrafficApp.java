import java.util.Scanner;

/**
 * Created by PapoteDetres1 on 1/12/17.
 */

public class TrafficApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);

        String userChoice = validator.getString(scan, "Type in one of the following colors in CAPS: RED, BLUE, YELLOW, WHITE, TEAL, BLACK, PURPLE, GREEN, MAGENTA, CYAN to find its function");
        TrafficLightColor light = TrafficLightColor.valueOf(userChoice);
        WhatItDoes(light);
    }

    private static void WhatItDoes(TrafficLightColor light) {
        if (light.equals(TrafficLightColor.RED)) {
            System.out.println("You were suppose to STOP");

        } else if (light.equals(TrafficLightColor.BLUE)) {
            System.out.println("The BLUE light is better on the eyes at night than Green. It means go");

        } else if (light.equals(TrafficLightColor.YELLOW)) {
            System.out.println("This is a yellow light, slow it down!");


        } else if (light.equals(TrafficLightColor.WHITE)) {
            System.out.println("White is the color of chalk");

        } else if (light.equals(TrafficLightColor.TEAL)) {
            System.out.println("I once went to an all Teal party");

        } else if (light.equals(TrafficLightColor.BLACK)) {
            System.out.println("A blackhole is the color black from what we know");

        } else if (light.equals(TrafficLightColor.PURPLE)) {
            System.out.println("Remember that ugly Dinosaur? What color was he again");

        } else if (light.equals(TrafficLightColor.GREEN)) {
            System.out.println("What is the color of Marijuana");


        } else if (light.equals(TrafficLightColor.MAGENTA)) {
            System.out.println("I do not recall what the color magenta looks like");


        } else if (light.equals(TrafficLightColor.CYAN)) {
            System.out.println("Cyan is a screen printing color I believe");


        }
    }

}
