import java.util.Scanner;

public class soma {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("DIgite um número : ");
        int N = sc.nextInt();
        int soma = 0;

          for (int i = 0 ; i<N ; i++){
              System.out.println("Número : ");
              int x = sc.nextInt();
              soma = soma  + x;


          } System.out.println(soma);

          sc.close();

    }
}
