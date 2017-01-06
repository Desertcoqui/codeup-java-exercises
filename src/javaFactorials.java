/**
 * Created by PapoteDetres1 on 1/5/17.
 */

import java.util.Scanner;

public class javaFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input an integer from 1-10");
        int integer = sc.nextInt();
        while ((integer <= 10) || (integer > 0)) {
            System.out.println("you have chosen the number " + integer);
            if (integer) {
                System.out.println("Please try again");
            } else {
                System.out.println("ERROR Please enter a valid age");
                System.out.println("");
                System.out.println("What is your age?\n");
                integer = sc.nextInt();
            }

        }
    }
}
