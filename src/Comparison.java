import java.util.Scanner;

/**
 * Created by Pablo Sanchez on 14/11/2016.
 */
public class Comparison {
    private String selec;
    public Comparison(String selec){
        this.selec = selec;
    }

    public void rec(){
        if(selec.equals("fib")){
            //Start fibonacci

            System.out.printf("%s ","Type the numbers you require of the fibonacci sequence:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            fibonacci f = new fibonacci();
            int[] fibo = new int[n+1];
            for(int i = 0; i <= n; i++) {
                fibo[i] = f.fibonacci(i);
            }
            for (int s: fibo) {
                System.out.printf(" " + s);
            }
            //End fibonacci
        }else if(selec.equals("fact")) {
            System.out.printf("%s ", "Type the number to calculate the factorial:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            factorial f = new factorial();
            System.out.println(f.factorial(n));

        }
    }
}
