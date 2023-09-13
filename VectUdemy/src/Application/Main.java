package Application;

import Entitites.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i=0 ; i< vect.length ; i++){
            sc.nextLine();
            System.out.println(" NAME OF PRODUCT : ");
            String name = sc.nextLine();
            System.out.println("PRICE OF PRODUCT:");
            double price = sc.nextDouble();

            vect[i] = new Product(name,price);
        }

        double sum = 0;

        for (int i = 0; i< vect.length ; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum/ vect.length;

        System.out.println("AVERAGE PRICE : " + avg);

    }
}