
import java.io.IOException;
import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args )throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome ? ");
        String name = scanner.nextLine();


        System.out.println("Quanto o valor do seu salário fixo ? ");
        double salary = scanner.nextDouble();
        if (salary < 0){
            System.out.println("DIGITE UMA QUANTIA VÁLIDA !!!");
            return;
        }

        System.out.println("Quantas vendas fez este mês ? ");
        double totalVendasMes = scanner.nextDouble();
        if (totalVendasMes < 0){
            System.out.println("DIGITE UMA QUANTIA VÁLIDA !!!");
            return;
        }


        double salaryTotal = (salary * 0.15) + totalVendasMes;
        System.out.println("\n"+"================================================================");
        System.out.println("================================================================"+ "\n");


        System.out.println(name );
        System.out.println(salary );
        System.out.println(totalVendasMes);
        System.out.printf("%.2f", salaryTotal);











    }
}