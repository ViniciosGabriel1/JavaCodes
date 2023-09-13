import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota 1 : ");
        Double nota1 = sc.nextDouble();
        if (nota1>10) {
            System.out.println("Digite uma nota válida !");
            return;
        }
        else if (nota1<0) {
            System.out.println("Digite uma nota válida !");
            return;
        }

        System.out.print("Digite a nota 2 : ");
        Double nota2 = sc.nextDouble();
        if (nota2>10) {
            System.out.println("Digite uma nota válida !");
            return;
        }

        else if (nota2<0) {
            System.out.println("Digite uma nota válida !");
            return;
        }

        System.out.print("Digite a nota 3 : ");
        Double nota3 = sc.nextDouble();
        if (nota3>10) {
            System.out.println("Digite uma nota válida !");
            return;
        }
        else if (nota3<0) {
            System.out.println("Digite uma nota válida !");
            return;
        }

       Double media = (nota1+nota2+nota3)/3;
        System.out.println(media);

        if (media<7){
            System.out.println("Reprovado ! ");

        } else if (media>=7) {
            System.out.println("Aprovado ! ");

        }


    }
}