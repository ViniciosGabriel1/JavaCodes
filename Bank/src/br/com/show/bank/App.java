package br.com.show.bank;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {

        //criar uma conta (agencia,conta,nome)
        // limitar o nome = 12 caracters

        Account account = new Account("0019","1234","Vinicios gabriel");


        //nao pode sacar mais do que tem
       boolean success = account.Get_the_drift(100);
       if(!success){
           System.out.println("Saldo insuficiente !");
       }
      //depositar
       account.deposit(100);
       account.deposit(20);
       account.deposit(00);


       if(! account.Get_the_drift(100)){
           System.out.println("Saldo insuficiente !");
       }
        if(! account.Get_the_drift(100)){
            System.out.println("Saldo insuficiente !");
        }

    }
        //informar para o usuario as operaçoes ( saque e deposito)

      }
