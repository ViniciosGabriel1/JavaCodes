package Application;

import Entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Student student = new Student();

        System.out.println("Enter with the data : ");
        System.out.println("Your name : ");
        student.name = sc.nextLine();

        System.out.println("Note one : ");
        student.note1 = sc.nextDouble();

        System.out.println("Note two : ");
        student.note2 = sc.nextDouble();

        System.out.println("Note three : ");
        student.note3 = sc.nextDouble();

        System.out.println("Final grade : " + student.totalGrade());
        if (student.totalGrade()<60){

            System.out.println("FAILED !!");
            System.out.println("MISSING : " + student.lackNote() + " POINTS");
        }else{
            System.out.println("PASS  !!");

        }



    }
}