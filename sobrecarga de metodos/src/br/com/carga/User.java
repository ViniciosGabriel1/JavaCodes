package br.com.carga;

public class User {

    private String firstName;
    private String lastName;

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

    public String output(){
        return firstName.toUpperCase() + " " +  lastName.toUpperCase();

    }

    public String output(boolean  showLastName){
        if(showLastName){
            return output();

        }
        return firstName.toLowerCase();
    }





}
