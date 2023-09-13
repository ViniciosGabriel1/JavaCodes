package Application;
import Entities.Employee;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("NAME : ");
        employee.name= sc.nextLine();

        System.out.println("Gross salary : ");
        employee.GrossSalary= sc.nextDouble();

        System.out.println("Tax : ");
        employee.Tax = sc.nextDouble();


        System.out.println("Employee : " + employee.name +" , R$ " + employee.NetSalary()+"\n");

        System.out.println("Which percentage to increase salary : ");
        employee.percentage = sc.nextDouble();

        employee.increaseSalary(employee.percentage);

        System.out.println();
        System.out.println("Updated data : " + employee.name + " , R$ " +   employee.NetSalary());
    }
}