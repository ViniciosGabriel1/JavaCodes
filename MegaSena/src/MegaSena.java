import java.util.Random;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");

        String name = scanner.nextLine();
        Random generate = new Random();

        int i = 0;
        while (i < 6) {

            int number = generate.nextInt(99);

            i++;
            System.out.println(" Ok "+ name + " , os números da mega são : "+ number);
        }

    }
}
