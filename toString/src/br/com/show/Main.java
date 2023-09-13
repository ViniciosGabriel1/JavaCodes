package br.com.show;

public class Main {
    public static void main(String[] args) {
       User userA = new User("vinícios" , "gabriel");
        User userB = new User("vinícios" , "gabriel");
        System.out.println(userA);
        System.out.println(userA.hashCode());
        System.out.println(userB);
        System.out.println(userB.hashCode());
        System.out.println(userA.equals(userB));
    }
}