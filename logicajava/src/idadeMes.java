import java.util.Scanner;

public class idadeMes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digiite sua idade : ");
        int idade  = scanner.nextInt();

         int calcIdadeDia = idade*365;
         int calcIdadeMes = idade*365/30;

        System.out.println("Sua idade em anos é : " + idade + " e em dias é : " + calcIdadeDia + " e em meses é " + calcIdadeMes );


    }
}