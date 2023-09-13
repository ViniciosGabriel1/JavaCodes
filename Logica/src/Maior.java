import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para A : ");
        double A = scanner.nextDouble();
        System.out.println("Digite um número para B : ");
        double B = scanner.nextDouble();
        System.out.println("Digite um número para C : ");
        double C = scanner.nextDouble();

        if ((A<B) && (A<C) && (B<C)){
            System.out.println(C + " eh maior ");

        } else if (((A>B) && (A>C) && (B<C))) {
            System.out.println(A+ " eh maior");

        }else if ((C>A) && (C>B) && (B>A)) {
            System.out.println(B + " eh mawwior ");

        } else if ((C<A) && (C<B) && (B<A)){
            System.out.println(A + " eh maior ");

        } else if ((B>A) && (B>C) && (A<C)) {

            System.out.println(B + " eh maior");



        }


    }
}
