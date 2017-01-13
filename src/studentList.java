import java.util.*;
import java.util.Scanner;
/**
 * Created by PapoteDetres1 on 1/13/17.
 */
public class studentList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);

        ArrayList<String> Students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Please enter your last name: ");
            Students.add("Last Name - " + sc.next());
            System.out.println("Please enter your first name: ");
            Students.add("First Name - " + sc.next());

            System.out.println("Please enter student score: ");
            Students.add("Students score - " + sc.next());
            for(int i = 0; i < Students.size(); i++)  {
                System.out.println(Students.get(i));
            }

        }
    }
}
