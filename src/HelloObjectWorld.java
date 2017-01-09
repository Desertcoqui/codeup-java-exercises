import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by PapoteDetres1 on 1/6/17.
 */
public class HelloObjectWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // the first Person is pulling from the Person.java file under the "constructor" comment. newPerson is the object
        Person newPerson = new Person(getUserName(sc), getEmail(sc));
        System.out.println("Hello " + newPerson.username + ",we have your email as " + newPerson.email);

                //newPerson1 is the object
        Person newPerson1 = new Person(getUserName(sc), getEmail(sc));
        System.out.println("Hello " + newPerson1.username + ",we have your email as " + newPerson1.email);

                //newPerson2 is the object
        Person newPerson2= new Person(getUserName(sc), getEmail(sc));
        System.out.println("Hello " + newPerson2.username + ",we have your email as " + newPerson.email);
    }

        public static String getUserName(Scanner sc) {
            System.out.println("Type your first and last name");
            return sc.nextLine();
        }

        public static String getEmail(Scanner sc) {
            System.out.println("Type in your email bruh");
            return sc.nextLine();
        }
}



