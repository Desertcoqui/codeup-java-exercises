import java.util.Arrays;

/**
 * Created by PapoteDetres1 on 1/11/17.
 */
public class NameGenerator {

    String[] nouns = {"Texas", "Nebraska", "Mars", "Venus", "Iraq", "Montreal", "NewYork", "Iceland", "Jersey", "Cali"};
    String[] adjectives = {"Great", "Ugly", "Little", "Sleek", "Brilliant", "Svelt", "Patriotic", "Active", "Graceful", "Stout"};




    public static void main(String[] args) {



        int tenAdjectives;
        int tenNouns;
               tenAdjectives = (int) (Math.random() * 9) + 1;
               tenNouns = (int) (Math.random() * 9) + 1;


        //to get access to the strings outside the Main Class we had to create an object from NameGenerator
        NameGenerator ng= new NameGenerator();


        System.out.println(ng.adjectives[tenAdjectives]+" " + ng.nouns[tenNouns]);
   }
}
