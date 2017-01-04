import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by PapoteDetres1 on 1/3/17.
 */
public class TypesDemo {
    public static void main(String[] args) {
        byte smallNumbers= 45;
        short theShorts= 343;
        double pi= 31.234325;
        int approximitelyPi = (int) pi;
        String eagleSix="rt";
        char fav='5';
        long maxLong= Long.MAX_VALUE;
        long maxLongPlusOne= maxLong + 2;
        int favoriteNumber= '0';

        System.out.println(smallNumbers);
        System.out.println(theShorts);
        System.out.println(pi);
        System.out.println(approximitelyPi);
        System.out.println(eagleSix);
        System.out.println(fav);
        System.out.println(maxLong);
        System.out.println(maxLongPlusOne);
        System.out.println(favoriteNumber);


        String firstInput;
        int secondInput;
        String thirdInput;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please input your input: ");
        firstInput = sc.nextLine();
        System.out.println(firstInput);

        System.out.print("Please input an integer ");
        secondInput = sc.nextInt();
        //This sc.nextline below must be added after an INT printout to clear the line for the next
        //print out which is a string
        sc.nextLine();
        System.out.println(secondInput);

        System.out.print("Please input your third input");
        thirdInput = sc.nextLine();
        System.out.println(thirdInput);

        double classLength;
        double classWidth;
        byte yes;

        System.out.print("Please input the class length");
        classLength = sc.nextDouble();
        System.out.println(classLength);

        System.out.print("Please input the class width");
        classWidth = sc.nextDouble();
        System.out.println(classWidth);


        System.out.println("The area of the room is: " + (classLength * classWidth));
        System.out.println("The perimeter of the room is: " + (classLength + classWidth * 2));


        System.out.println("Type 1 to continue 2 to quit");
        yes= sc.nextByte();

        if(yes==(1)){
            System.out.println("Continue you shall");
        } else{
            System.out.println("Goodbye");
        }



    }
}
