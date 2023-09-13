import java.util.Formattable;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números serão digitados ? ");
        int n = sc.nextInt();

        int[] number = new int[n];
        int cont = 0;

        for ( int i = 0 ; i < number.length ; i++ ){
            System.out.println("Digite um número : ");
            number[i]= sc.nextInt();
        }
         System.out.println("\nNÚMEROS PARES : ");

        for ( int i = 0 ; i < number.length; i++ ){
            if ( number[i] %  2 == 0 ){
                System.out.print(" " + number[i]);
            }
        }

        for ( int i = 0 ; i < number.length  ; i++ ){
            if ( number[i] %  2 == 0 ){
              cont = cont+1;
            }
        }
        System.out.println();
        System.out.println("\nQUANTIDADE DE PARES : " + cont);
    }
}