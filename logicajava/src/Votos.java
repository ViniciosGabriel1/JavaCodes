import java.sql.SQLOutput;
import java.util.Scanner;

public class Votos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de eleitores do municipio: ");
        int totalVotos = scanner.nextInt();
        System.out.println("Digite a quantidade de votos válidos : ");
        int numVotosValidos = scanner.nextInt();
        if (numVotosValidos > totalVotos) {
            System.out.println("digite um número correspondente");
            return;
        }
        System.out.println("Digite a quantidade de votos brancos : ");
        int numVotosBrancos = scanner.nextInt();
        if (numVotosBrancos > totalVotos) {
            System.out.println("digite um número correspondente");
            return;
        }
            System.out.println("Digite a quantidade de votos nulos : ");
            int numVotosNulos = scanner.nextInt();

            double percVotoBrancos = (numVotosBrancos * 100) / totalVotos;
            double percVotoValidos = (numVotosValidos * 100) / totalVotos;
            double percVotoNulos = (numVotosNulos * 100) / totalVotos;

            System.out.println("A porcentagem de votos válidos é de : " + percVotoValidos);
            System.out.println("A porcentagem de votos brancos é de : " + percVotoBrancos);
            System.out.println("A porcentagem de votos nulos é de : " + percVotoNulos);



    }
}