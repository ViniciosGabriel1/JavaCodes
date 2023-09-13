package Application;
import Entities.Numbers;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a value for N : ");
        int n = sc.nextInt();
       int[] vect = new int [n];

        for (int i = 0 ; i<vect.length ; i++) {
            System.out.println("Enter a number : ");
            vect[i] = sc.nextInt();
            }

        System.out.println( "Negative numbers : ");

        for (int i = 0; i<n ; i++){
            if (vect[i]<0){
                System.out.println(vect[i]);

            }


        }


    }

}