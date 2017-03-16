import java.util.Random;

/**
 * Created by Eva on 21/12/2016.
 */
public class Calendario {
    private String[] dias;
    private String[] dia = {"lunes" , "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
    private int diass;

    public Calendario(int d){
        diass = d;
        dias = new String[d];
        generar();
     }
     public void generar(){
        int di = dias.length;
        int num = 0;
        while(num < di){
            Random rnd = new Random();
            int number = rnd.nextInt(6);
            if(number == 1){
                dias[num] = "TALF";
            } else if(number == 2){
                dias[num] = "Haskell";

            } else if(number == 3){
                dias[num] = "ADA";

            } else if(number == 4){
                dias[num] = "DB";

            } else if(number == 5){
                dias[num] = "ADA";

            } else{
                dias[num] = "procastinate";
            }
            num++;
        }
    }
    public void imprimirTabla(){
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < diass; i++){
            if(i%7 == 0 && i != 0){
                System.out.println();
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
            }
            System.out.print(dia[i%7] + ": " + dias[i] + " || ");

         }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
    }

}
