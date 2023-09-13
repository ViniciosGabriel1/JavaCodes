package br.com.show.bank;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account("0019", "1234", "Vinicios gabriel de oliveira");

        // D = Deposito
        // s = Saque
        // E = sair (exit)
        while (true) {
            System.out.println(" // D = Deposito\n" + " // s = Saque\n" + " // E = sair (exit)\n");

            System.out.print("Por favor digite uma opção : ");
            String op = scanner.next();

            if (op.equals("D")) {
                System.out.println("Qual o valor você deseja depositar na sua conta ? ");
                double value = scanner.nextDouble();
                account.deposit(value);

            } else if (op.equals("S")) {
                System.out.println(" Qual o valor do saque? ");
                double value = scanner.nextDouble();

                if (!account.Get_the_drift(value)) {
                    System.out.println("Saldo insuficiente para saque.");
                }
            } else if (op.equals("E")) {
                System.out.println("Seção encerrada.");
                break;
            } else {
                System.out.println(" Comando inválido ! ");

            }



        }
    }
}
