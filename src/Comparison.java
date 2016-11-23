import java.util.Scanner;

/**
 * Created by Pablo Sanchez on 14/11/2016.
 */
public class Comparison {
    //@param -- Strign que se usa en la comparacion
    private String selec;
    public Comparison(){
        selec = "";
    }
    public Comparison(String selec){
        this.selec = selec;
    }
    public void getVar(){
        //Selecion de calculo
        System.out.printf("%s ", "Enter the calculation(fib -> Fibonacci, fact -> Factorial): ");
        Scanner sc = new Scanner(System.in);
        //Entrada de valor para la comparacion
        selec = sc.nextLine();
        sc.close();
    }
    public void rec(){
        //
        if(selec.equals("fib")){
            //Coge un int para calcular la secuencia de fibonacci
            System.out.printf("%s ","Type the numbers you require of the fibonacci sequence:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            fibonacci f = new fibonacci();
            //Crea un array en el que se guardara los valorres de la secuencia
            int[] fibo = new int[n+1];
            //Rellena el array con la funcion fibonacci
            for(int i = 0; i <= n; i++) {
                fibo[i] = f.fibonacci(i);
            }
            //Imprime el array
            for (int s: fibo) {
                System.out.printf(" " + s);
            }

        }else if(selec.equals("fact")) {
            //Como lee los comentarios el maricon
            System.out.printf("%s ", "Type the number to calculate the factorial:");
            //Pide por teclado un valor para calcular el factorial
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            factorial f = new factorial();
            System.out.println(f.factorial(n));

        }else if(selec.equals("han")) {
            System.out.printf("%S ", "wrong value!");
        }else{
            System.out.printf("%S ", "wrong value!");
        }
    }
}
