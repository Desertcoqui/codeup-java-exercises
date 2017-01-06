import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
/**
 * Created by PapoteDetres1 on 1/5/17.
 */


public class javaMethodsArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //Below is the hardcoded firstNumber and secondNumber
//        double firstNumber= 5;
//        double secondNumber= 25;
        System.out.println("Input the first number");
        double firstNumber= sc.nextDouble();
        System.out.println("Input the second number");
        double secondNumber= sc.nextDouble();

        //main variables
        double addition = add(firstNumber, secondNumber);
        double subtraction = subtract(firstNumber, secondNumber);
        double multiplication = multiply(firstNumber, secondNumber);
        double division = divide(firstNumber, secondNumber);
        double remainder = modulus(firstNumber, secondNumber);


        //Hardcoded print out of the firstNumber and secondNumber example
//        System.out.println("Here is the number 5 and 25 when you add them " + addition);
//        System.out.println("Here is the number 5 and 25 when you subtract them " + subtraction);
//        System.out.println("Here is the number 5 and 25 when you multiply them " + multiplication);
//        System.out.println("Here is the number 5 and 25 when you divide them " + division);
//        System.out.println("Here is the number 5 and 25 when you add a modulus " + remainder);

        System.out.println(firstNumber + " + "+ secondNumber + " = " + addition);
        System.out.println(firstNumber + " - "+ secondNumber + " = " + subtraction);
        System.out.println(firstNumber + " * "+ secondNumber + " = " + multiplication);
        System.out.println(firstNumber + " / "+ secondNumber + " = " + division);
        System.out.println(firstNumber + " % "+ secondNumber + " = " + remainder);
    }

    public static double add( double firstNumber, double secondNumber){

        return firstNumber + secondNumber;
    }


    public static double subtract(double firstNumber, double secondNumber ){
        return firstNumber - secondNumber;
    }

    public static double multiply(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }

    public static double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static double modulus(double firstNumber, double secondNumber){
        return firstNumber % secondNumber;
    }
















}
