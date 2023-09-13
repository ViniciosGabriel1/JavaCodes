package JAVAPJ;
import java.util.*;

public class desafioDio {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int cont = 0;
        double media = 0;
        double x = 0;


        for (int i = 0 ; i<6 ; i++) {
            double numbers = sc.nextDouble();
            if (numbers>0){
                cont ++;
                x = x + numbers;
            }
        }
        media = x/cont;
        System.out.println(cont + " valores positivos");
        System.out.printf(String.format("%.1f", media));

    }


}
