import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by PapoteDetres1 on 1/18/17.
 */

public class MovieApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);
        //get all the movies provided
        ArrayList<Movie> movieList = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            movieList.add(MovieIO.getMovie(i));







            System.out.println();


        }
    }
}