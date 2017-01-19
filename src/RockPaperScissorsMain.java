
import java.util.Scanner;

/**
 * Created by PapoteDetres1 on 1/18/17.
 */
public class RockPaperScissorsMain {
    static Scanner sc = new Scanner(System.in);

    static You you = new You();
    static Computer computer = new Computer();

    //these variable are static so they can be called elsewhere
    static int numberOfGames;
    static int computerScore;
    static int userScore;



    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        System.out.println("ROCK, PAPER, SCISSORS!");

        // Get moves
        Move youMove = you.getMove();
        Move computerMove = computer.getMove();
        System.out.println("\nYou played " + youMove + ".");
        System.out.println("Computer played " + computerMove + ".\n");

        // Compare moves and determine winner
        int compareMoves = youMove.compareMoves(computerMove);
        switch (compareMoves) {
            case 0: // Tie
                System.out.println("Tie!");
                break;
            case 1: // User wins
                System.out.println(youMove + " beats " + computerMove + ". You won!");
                userScore++;
                break;
            case -1: // Computer wins
                System.out.println(computerMove + " beats " + youMove + ". You lost.");
                computerScore++;
                break;
        }
        numberOfGames++;

        // Ask the user to play again
        if (you.playAgain()) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
        }
    }


    private static void printGameStats() {
        int wins = userScore;
        int losses = computerScore;
        int ties = numberOfGames - userScore - computerScore;
        double percentageWon = (wins + ((double) ties) / 2) / numberOfGames;

        // Line
        System.out.print("+");
        printDashes(68);
        System.out.println("+");

        // Print titles
        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
                "WINS", "LOSSES", "TIES", "GAMES PLAYED", "PERCENTAGE WON");

        // Line
        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");

        // Print values
        System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |  %13.2f%%  |\n",
                wins, losses, ties, numberOfGames, percentageWon * 100);

        // Line
        System.out.print("+");
        printDashes(68);
        System.out.println("+");
    }

    private static void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }
    }
