/**
 * Created by PapoteDetres1 on 1/10/17.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Papo on 1/10/17.
 */
public class Validator {

    private Scanner sc;

    public Validator(Scanner sc) {

        this.sc = sc;
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        int userInteger;
        try {
            userInteger = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your input must be an integer, nothing else!");

            // Keeps the scanner from "skipping" the next input
            sc.next();
            return getInt(prompt);
        }

        return userInteger;
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int userInteger = getInt(prompt);
        try {
            System.out.print(prompt);
            if (userInteger < min || userInteger > max)
                throw new IllegalArgumentException("Error! Number must be greater than " + min +
                        "and number must be less than " + max + ".");
        }catch (IllegalArgumentException e) {
            System.out.println("Your input must be an integer, nothing else!");

            // Keeps the scanner from "skipping" the next input
            sc.next();
            return getIntWithinRange(prompt, min, max);

        }
        return userInteger;
    }

    public double getDouble(String prompt) {
        double userDouble;
        try {
            System.out.print(prompt);
            userDouble = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.print("Error! Invalid decimal value. Try again. ");
            sc.next();
            return getDouble(prompt);
        }
        return userDouble;
    }

    public double getDoubleWithinRange(String prompt, int min, int max) {
        int userDouble = (int) getDouble(prompt);
        try {
            System.out.println(prompt);
            if (userDouble < min || userDouble > max)
                throw new IllegalArgumentException("Error! Number must be greater than " + min +
                        " and number must be less than " + max + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("Error! Invalid decimal value. Try again.");
            sc.next();
            return getDoubleWithinRange(prompt, min, max);
        }
        return userDouble;
    }

    public String getRequiredString(String prompt) {
        String inputString;

        try {
            System.out.print(prompt);
            inputString = sc.nextLine();
        } catch (Exception e) {
            System.out.print("Whoops, something went wrong");
            sc.next();
            return getRequiredString(prompt);
        }
        return inputString;
    }
    public String getString(Scanner scan, String prompt) {

        String userStringRequiredInput;

        try {
            System.out.println(prompt);
            userStringRequiredInput = scan.next();
            if (userStringRequiredInput.equalsIgnoreCase("yes") || userStringRequiredInput.equalsIgnoreCase("y")) {
                throw new IllegalArgumentException("Error! Invalid input.");
            }
        } catch (Exception e) {
            System.out.println("You must enter 'yes' or 'no'");
            System.out.println(e.getMessage());
            return getString(scan, prompt);
        }
        return userStringRequiredInput;
    }
}
