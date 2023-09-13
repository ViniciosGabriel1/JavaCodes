import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos elementos vai ter o vetor?  ");
        int n = sc.nextInt();

        Double[] number = new Double[n];
       double cont = 0;

        for ( int i = 0 ; i < number.length ; i++ ){
            System.out.println("Digite um número : ");
            number[i]= sc.nextDouble();
            cont += (number[i]/n);
       }
        System.out.println("MEDIA DO VETOR = " + cont);
        System.out.println();
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for ( int i = 0 ; i < number.length ; i++ ){
            if (number[i]<cont)
                System.out.println(number[i]);

        }

    }
}