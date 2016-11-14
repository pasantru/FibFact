/**
 * Created by Pablo Sanchez on 28/10/2016.
 */
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Suspenso {
    public static void main (String[] args){
            //Sequence selection
            System.out.printf("%s ", "Enter the calculation(fib -> Fibonacci, fact -> Factorial): ");
            Scanner ssc = new Scanner(System.in);
        if(ssc.hasNext()) {
            String text = ssc.nextLine();
            Comparison cmp = new Comparison(text);
            ssc.close();
            //Calculation of the sequence
            cmp.rec();
        }


        }
}
