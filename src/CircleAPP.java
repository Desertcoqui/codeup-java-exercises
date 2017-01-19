import java.util.Scanner;

/**
 * Created by PapoteDetres1 on 1/17/17.
 */
public class CircleAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);
        double userInputRadius;

        userInputRadius = validator.getDouble("Please enter the radius of the circle: ");
        Circle yourCircle= new Circle(userInputRadius);

        System.out.println("Your radius is " + userInputRadius);
        System.out.println(yourCircle.getCircumference() + " Is the circumference of "+ userInputRadius);
        System.out.println(yourCircle.getArea() + " Is the area of your circle");
        System.out.println("You have created " + yourCircle.circlesCreated+" circle/s");
    }
}
