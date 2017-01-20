import java.util.Scanner;
/**
 * Created by kevinjones on 1/19/17.
 */

//check to see if a string appended with an integer matches the characters specified by that integer.
public class CodingChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String challengeUserString;
        int challengeUserInt;




        System.out.println("Enter your string: ");
        challengeUserString = scan.nextLine();
        System.out.println("Enter your integer:");
        challengeUserInt = scan.nextInt();
        System.out.println(challengeUserString + challengeUserInt);
        if (challengeUserString.length() == challengeUserInt) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}