/**
 * Created by PapoteDetres1 on 1/9/17.
 */
public class eroticGameMain {

    public static void main(String[] args) {

        eroticGame dice;
        int rollCount;

        dice = new eroticGame();  // Create the PairOfDice object.
        rollCount = 0;

//will spit random number
        do {
            dice.roll();
            System.out.println(" You have been awarded with " + dice.getDie1()
                    + " minutes worth of favors. You pick the favors, which can be used upto " + dice.getDie2() + " times");
            rollCount++;
        } while (dice.getTotal() <2);


        System.out.println("\n\n"  + rollCount + " voucher used requires you to reciprocate the favor");

    }

}  // end class RollFor2
