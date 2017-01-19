import java.util.Scanner;

/**
 * Created by PapoteDetres1 on 1/18/17.
 */
public class Movie {
    Scanner sc = new Scanner(System.in);
    String category="";
    String title="";


    public Movie(String title, String category) {
        this.category = category;
        this.title = title;
    }
}