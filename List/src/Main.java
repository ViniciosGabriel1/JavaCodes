import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int number = sc.nextInt();

        for (int i=1; i<=number; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Employee(name , id , salary));

            }


        System.out.println("Enter the employee id that will have salary increase :");
        int id = sc.nextInt();

        System.out.println("Enter the percentage:");
         emp.percentage = sc.nextInt();

        System.out.println();









        }



    }
