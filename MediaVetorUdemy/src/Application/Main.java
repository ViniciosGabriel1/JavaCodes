package Application;

import Entities.Average;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        System.out.println("How many numbers are you going to type?");
        int n = sc.nextInt();

        Average[] vect = new Average[n];

        double number;

        for (int i =0 ; i< vect.length ; i++){
            System.out.println("Enter a number : ");
            number = sc.nextDouble();
            vect[i] = new Average(number);

        }

        double  sum = 0;

        for (int i = 0; i< vect.length ; i++){
            sum += vect[i].getAverage();
        }

        double avg = sum/ vect.length;

        System.out.print(" Values : ");

        for (int i = 0; i<vect.length ; i++){

            System.out.printf("%.1f " ,vect[i].average );


        }

        System.out.print("\n"+" Sum : " + sum );
        System.out.println();
        System.out.print(" Average : " + avg);


    }
}