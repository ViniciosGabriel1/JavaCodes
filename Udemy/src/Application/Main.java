package Application;
import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangule X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangule Y : " );
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.println(areaX);
        System.out.println(areaY);

         if (areaX>areaY){
             System.out.printf(" X Is larger : %.4f%n" , areaX);

         }else if (areaX==areaY){

            System.out.println("Are equal");
        }
         else {
             System.out.printf(" Y IS larger : %.4f%n" , areaY);
         }
    }

}