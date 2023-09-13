package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        List<Integer> listInt = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        for ( int i = 1 ; i <= n ; i++ ){
            System.out.println("Employee # " + i);
            System.out.println("ID : ");
            sc.nextLine();
            int id = sc.nextInt();
            System.out.println("");


        }


    }
}