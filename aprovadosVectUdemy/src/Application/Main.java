package Application;

import Entities.Nota;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Nota nota = new Nota();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        Nota[] vect = new Nota[n];
        String[] vectName = new String[n];
        double[] vectNota1 = new double[n];
        double[] vectNota2 = new double[n];


        for (int i = 1 ; i <= vect.length ; i++ ){

            System.out.println(" Digite nome, primeira e segunda nota do 4"+i+ "aluno: ");
            System.out.println("Aluno # " + i);
            System.out.println("Name : ");
            sc.nextLine();
            String vectName[] = sc.nextLine();

            System.out.println("1° nota : ");
           nota.nota1 = sc.nextDouble();

            System.out.println("2° nota : ");
            nota.nota2 = sc.nextDouble();

           double media = (nota.nota1+nota.nota2)/2;
           if (media<6) {
              System.out.println("Não passou");
           }else{
             System.out.println(nota.name);

          }

        }


        }





    }
