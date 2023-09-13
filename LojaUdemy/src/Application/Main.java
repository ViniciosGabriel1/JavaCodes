package Application;
import Entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();


        System.out.println("digite um opção :");
        System.out.println("1 para adicionar  ou 2 pra remover!:");
        int opcaoEscolha = sc.nextInt();
        while(opcaoEscolha<1 || opcaoEscolha>2 ){
            System.out.println("TENTE NOVAMENTE");
            System.out.println("digite um opção :");
            System.out.println("1 para adicionar  ou 2 pra remover!:");
            int opcaoEscolha= sc.nextInt();
        }

        switch (opcaoEscolha){
            case 1:

                System.out.println("Enter product data . ");

                System.out.println("Name : ");
                sc.nextLine();
                product.name = sc.nextLine();

                System.out.println("price : ");
                product.price = sc.nextInt();

                System.out.println("Quantity : ");
                product.quantity = sc.nextInt();

                System.out.println(product);

                System.out.println("Enter the number of products to be added in stock: ");
                int quantity = sc.nextInt();
                product.addProduct(quantity);

                System.out.println();
                System.out.println(product);

                break;

            case 2:

                System.out.println("Enter product data . ");

                System.out.println("Name : ");
                product.name = sc.nextLine();

                System.out.println("price : ");
                product.price = sc.nextInt();

                System.out.println("Quantity : ");
                product.quantity = sc.nextInt();

                System.out.println(product);

                System.out.println("Enter the number of products to be removed from stock: ");
                quantity = sc.nextInt();
                product.removeProduct(quantity);

                System.out.println();
                System.out.println(product);

        }




    }
}