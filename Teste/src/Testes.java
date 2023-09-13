import java.util.ArrayList;
import java.util.Scanner;

public class Testes {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        //ArrayList<String> nomeLista = new ArrayList<String>();
        ArrayList<String> valorLista = new ArrayList<String>();

        for (int i = 1; i < 4; i++) {
            /*System.out.println("Digite o " + i + "º " + "nome:");
            String nome1 = scanner.nextLine();
            nomeLista.add(nome1);*/
            System.out.println("Digite " + i + " valor:");
            String valorLendo = scanner.nextLine();
            valorLista.add(valorLendo);
        }
        System.out.println("Valor: " + valorLista);
        //System.out.println(nomeLista);


    }

}
