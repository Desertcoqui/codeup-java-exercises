import java.util.Random;

/**
 * Created by PapoteDetres1 on 1/19/17.
 */
public class Computer {
    public Move getMove() {
        Move[] moves = Move.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
}
