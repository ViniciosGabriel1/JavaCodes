package Application;

import Entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.println("How many rooms will be rented ? ");
        int n = sc.nextInt();

        for (int i = 1 ; i<=n ; i++ ){
            System.out.println("Rent # " + i);
            System.out.println("Name : ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email : ");
            String email = sc.nextLine();
            System.out.println("Room : ");
            int room = sc.nextInt();

            vect[room] = new Rent(name,email);

        }

        for (int i = 1 ; i<10 ; i++ ){
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }





        }


    }
