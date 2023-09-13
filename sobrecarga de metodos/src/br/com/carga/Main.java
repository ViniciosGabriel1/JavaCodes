package br.com.carga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User userA = new User("Show" , "Lindo");
        System.out.println(userA.output());
        System.out.println(userA.output(false));
    }

}