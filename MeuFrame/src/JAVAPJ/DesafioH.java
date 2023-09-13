package JAVAPJ;

import java.util.Locale;
import java.util.Scanner;

public class DesafioH {
    public static void main(String[] args) {

        int h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {

            i = (int) (i + h);
            i++;
            h +=  1/1;

        }
        System.out.println(h);
    }
}


