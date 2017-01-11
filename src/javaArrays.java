import java.util.Arrays;
/**
 * Created by PapoteDetres1 on 1/11/17.
 */
public class javaArrays {
    public static void main(String[] args) {
        int[] testArray;

        //here we assign the testArray 8 positions
        int number= 8;
        testArray= new int [number];
        for (int i = 0; i < testArray.length; i++){
            System.out.println(testArray[i] + "|");
        }

        System.out.println("");

        //here we tell the testArray that the 7 will be in the index of 4
        testArray[4] = 7;
        for (int i = 0; i < testArray.length; i++){
            System.out.println(testArray[i] + "|");
        }




        //Curly braces...Arrays.toString(arrayName)
        String[] animals = {"dogs, cats, cows, mice"};
        System.out.println(Arrays.toString(animals));


        //Arrays.fill(arrayName, value)method
        char[] grades = new char[5];
        //try Arrays.fill(grades, 0, 2, 'A') below
        Arrays.fill(grades, 'A');
        System.out.println(Arrays.toString(grades));

//        Arrays.equals (arrays1, array2) method

        int[] array1= {1,2,3,4};
        int[] array2= {1,2,3,4};
        System.out.println(Arrays.equals(array1, array2));


        String[] names = {"tom", "smith", "pat", "kim", "jane"};
        //the 0 means it starts at Array index0 and stops at index 3
        String[] namesTwo = Arrays.copyOfRange(names, 0,3);
        System.out.println(Arrays.toString(namesTwo));


        String[] runningPlan = new String[15];
        Arrays.fill(runningPlan, 0, 5, "1 mile"); // to fill a portion
        Arrays.fill(runningPlan, 5, 10, "1.5 miles"); // to fill a portion
        Arrays.fill(runningPlan, 10, 15, "2 miles"); // to fill a portion

        System.out.println(Arrays.toString(runningPlan));



        // Arrays.copyOf(array, length) method

        String[] foodJustinLikes = {"hamburgers", "pie", "mashed potatoes", "kale", "peanut butter"};
        String[] foodPamLikes = Arrays.copyOf(foodJustinLikes, 3);
        System.out.println(Arrays.toString(foodPamLikes));

        // Arrays.copyOfRange(array, startIndex, toIndex) method

        String[] foodJustinStillLikes = {"hamburgers", "pie", "mashed potatoes", "kale", "peanut butter"};
        String[] bellyAche = Arrays.copyOfRange(foodJustinStillLikes, 3, 5);
        System.out.println(Arrays.toString(bellyAche));


        // Arrays.sort(array, startIndex, toIndex) method

        String[] students = {"Ron", "John", "Kevin", "Jeff", "Mittsy", "Dan"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        String[] studentTopFavoriteColors = {"2", "8", "1", "Justin", "Liz", "Ben"};
        Arrays.sort(studentTopFavoriteColors, 3, 6);
        System.out.println(Arrays.toString(studentTopFavoriteColors));


        // Arrays.binarySearch(array, value)

        String[] hayStack = new String[100];

        Arrays.fill(hayStack, 0, 50, "hay");
        Arrays.fill(hayStack, 50, 100, "wheat");

        hayStack[87] = "needle";

        System.out.println(Arrays.toString(hayStack));

        int index = Arrays.binarySearch(hayStack, "needle");
        System.out.println(index);

        Arrays.sort(hayStack);

        index = Arrays.binarySearch(hayStack, "needle");
        System.out.println(index);

        // Array referencing and initializing multiple arrays from a variable name

        String[] topBondFilms = new String[10];
        topBondFilms[8] = "Quantum of Solace";
        topBondFilms = new String[3]; // new array referenced to same variable

        System.out.println(Arrays.toString(topBondFilms));

        topBondFilms[0] = "Goldfinger";
        topBondFilms[1] = "Skyfall";
        topBondFilms[2] = "Goldeneye";

        String[] myFavFilms = topBondFilms;

        System.out.println(Arrays.toString(myFavFilms));

        // Two-dimensional arrays

        int[][] spreadSheet = new int[5][5];

        for (int i = 0; i < spreadSheet.length; i++) { // iterate through rows
            System.out.println("");
            for (int j = 0; j < spreadSheet[i].length; j++) { // iterate through columns
                System.out.print(spreadSheet[i][j] + " ");
            }
        }

        // Rectangle and Jagged arrays

        int[][] jaggedArray = new int[5][];

        int[] row1 = new int[3];
        int[] row2 = new int[10];
        int[] row3 = new int[5];
        int[] row4 = new int[7];
        int[] row5 = new int[2];

        jaggedArray[0] = row1;
        jaggedArray[1] = row2;
        jaggedArray[2] = row3;
        jaggedArray[3] = row4;
        jaggedArray[4] = row5;

        System.out.println("\n");
        for (int[] singleArray : jaggedArray) {
            System.out.println(Arrays.toString(singleArray));
        }
    }
}

