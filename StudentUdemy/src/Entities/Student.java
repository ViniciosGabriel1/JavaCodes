package Entities;

public class Student {

    public String name;
    public double note1;
    public double note2;
    public double note3;
    public double lack;

    public double totalGrade(){

     return note1+note2+note3;

     }
     public double lackNote(){

         return  lack = 60 - totalGrade();

     }

    }



