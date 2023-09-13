import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números serão digitados ? ");
        int n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];

        System.out.println("Digite os valores do vetor A: ");

        for ( int i = 0 ; i < vectA.length ; i++ ){
            vectA[i]= sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");

        for ( int i = 0 ; i < vectA.length ; i++ ){
            vectB[i]= sc.nextInt();
        }
        System.out.println("VETOR RESULTANTE: ");

        for ( int i = 0 ; i < n ; i++ ){
            System.out.println(vectA[i]+vectB[i]);
        }


    }
}