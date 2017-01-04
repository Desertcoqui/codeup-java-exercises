import java.util.Scanner;

/**
 * Created by PapoteDetres1 on 1/4/17.
 */
public class loopsInJava {
    public static void main(String[] args) {

//while loop print5 to 15
        int i = 5;
        while (i < 16) {
            System.out.println(i);
            i++;
        }

//do while loop count by 2's to 100
        int j = 0;
        do {
            System.out.println("this is number " + j);
            j += 2;
        } while (j <= 100);


//do while loop count from 100 to -10 in increments of 5
        int k = 100;
        do {
            System.out.println(k);
            k -= 5;
        } while (k > -15);


//do while loop squared by 2 upto 1,000,000
       for(long l=2; l<1000000; l*=l){
           System.out.println(l);
           if(l==0){
               break;
           }
       }


//FIZZBUZZ
        for(int fizz=1; fizz<101; fizz+=1){
            if (((fizz % 3)==0) && ((fizz % 5)==0)) System.out.println("Fizzbuzz");
            else if((fizz % 3)==0) System.out.println("Fizz");
            else if((fizz % 5)==0) System.out.println("Buzz");
            else System.out.println(fizz);
        }









    }
}
