import java.util.Scanner;


/**
 * Created by PapoteDetres1 on 1/19/17.
 */

public class You {
    static Scanner sc = new Scanner(System.in);


    public static Move getMove() {
//Prompt the user for Rock, Paper, or scissor
        System.out.print("Rock, paper, or scissors? ");
//Get imput from user

        String userInput = sc.nextLine();
        userInput = userInput.toUpperCase();
//With char we will check the first letter or index of zero from
//what the user inputs incase they misspell a word, if that
//doesn't match any index of zero we will reprompt the user
//So we will check for R,P and S
        char firstLetter = userInput.charAt(0);
        if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
// User has entered a valid input
            switch (firstLetter) {
                case 'R':
                    return Move.ROCK;
                case 'P':
                    return Move.PAPER;
                case 'S':
                    return Move.SCISSORS;
            }
        }
        // User has not entered a valid input. Prompt again.
        return getMove();
    }
    public static boolean playAgain() {
        System.out.print("To play again type 'Y' and 'enter'");
        String userInput = sc.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0) == 'Y';
    }

}
