import java.lang.Math;
 import java.util.Scanner;

// * Created by PapoteDetres1 on 1/17/17.

public class Circle {
    Scanner sc = new Scanner(System.in);
    public double radius;

    public static int circlesCreated;



    public Circle(double radius) {
        this.radius = radius;
    }

    public Double getCircumference() {
        double circumference= Math.PI * 2* radius;
        return circumference;
    }

    public Double getArea() {
       double area= Math.PI*(radius*radius);
        circlesCreated++;
        return area;
    }

}
