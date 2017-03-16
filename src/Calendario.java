import java.util.Random;
import java.util.Scanner;
/**
 * Created by Eva on 21/12/2016.
 */
public class Calendario {
    private String[] days;
    private String[] subjects;
    private String[] day = {"Monday" , "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private int daysss;


    public Calendario(int d, int subj){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(";");
        daysss = d;
        days = new String[d];
        subjects = new String[subj];
        int i = 0;
        while(i < subj){
            subjects[i] = sc.next();
        }
        generar();
    }
    public void generar(){
        int di = days.length;
        int num = 0;
        while(num < di){
            Random rnd = new Random();
            int number = rnd.nextInt(subjects.length);
            days[num] = subjects[number];
            num++;
        }
    }
    public void imprimirTabla(){
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < daysss; i++){
            if(i%7 == 0 && i != 0){
                System.out.println();
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
            }
            System.out.print(day[i%7] + ": " + days[i] + " || ");

        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
    }

}
