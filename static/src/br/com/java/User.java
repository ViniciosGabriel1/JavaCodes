package br.com.java;

public class User {
    private String firstName;
    private String lastName;

    private  static int count ;


    public static void setCount(int c) {
       count =count + c;
    }

    public int getCount() {
        return count;
    }


    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public void setLastNameName(String lastName) {
        this.lastName = lastName;

    }

    public String getFirstName(){
        return firstName;

    }

    public String getLastNameName(){
        return lastName;

    }

}
