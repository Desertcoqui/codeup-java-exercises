/**
 * Created by PapoteDetres1 on 1/9/17.
 */
public class diceClassMain {

    public static void main(String[] args) {

        diceClass dice;          // A variable that will refer to the dice.
        int rollCount;    // Number of times the dice have been rolled.

        dice = new diceClass();  // Create the PairOfDice object.
        rollCount = 0;

           /* Roll the dice until they come up snake eyes. */

        do {
            dice.roll();
            System.out.println(" You rolled " + dice.getDie1()
                    + " and " + dice.getDie2());
            rollCount++;
        } while (dice.getTotal() != 6);

           /* Report the number of rolls. */

        System.out.println("\nIt took " + rollCount + " rolls to get a 6.");

    }

}  // end class RollFor2
