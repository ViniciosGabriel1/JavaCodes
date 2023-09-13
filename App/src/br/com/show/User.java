package br.com.show;

public class User {


    public String firstName;
    public String lastName;
    public String Apelido;



    public void setFirstName(String firstName){
        this.firstName = firstName.toUpperCase();

    }
    public String getFirstName () {

        return firstName;
    }

    public void setLastName(String lastName){
       this.lastName = lastName.toUpperCase();

    }

    public String getLastName(){
        return lastName;

    }

    public void setApelido(String Apelido){

        this.Apelido = Apelido.toUpperCase();
    }

    public String getApelido(){
        return Apelido;

    }



}








