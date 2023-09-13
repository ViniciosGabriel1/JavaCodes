package br.com.show;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

       List<User> users = new ArrayList<>();

        int i = 1;
       while ( i<=10 ){
           User actual = new User();
           users.add(actual);

           i++;

           System.out.println(users.get(0).getFirstName());
           System.out.println(users.get(0).getLastName());

       }


    }





    }

