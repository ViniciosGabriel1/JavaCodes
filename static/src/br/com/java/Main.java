package br.com.java;

public class Main {
    public static void main(String[] args) {
    User show = new User("Vini" , "lindo");
    User marcos = new User("marcos" , "vini");
        User cremilda = new User("dinha" ,"severina");

        User.setCount(2);


        System.out.println(show.getCount());
        System.out.println(marcos.getCount());
        System.out.println(cremilda.getCount());

    }
}