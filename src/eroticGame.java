/**
 * Created by PapoteDetres1 on 1/9/17.
 */

public class eroticGame {

    public int die1;   // Number showing on the first die.
    public int die2;   // Number showing on the second die.
    //constructor
    public eroticGame() {

        roll();  //method to call the roll
    }

    public void roll() {
        // Roll the dice by setting each of the dice to be a random number between 1 and 6.

        die1 = (int)(Math.random()*20) + 1;
        die2 = (int)(Math.random()*20) + 1;
    }

    public int getDie1() {
        // Return the number showing on the first die.
        return die1;
    }

    public int getDie2() {
        // Return the number showing on the second die.
        return die2;
    }

    public int getTotal() {
        // Return the total showing on the two dice.
        return die1 + die2;
    }

}  // end class PairOfDice