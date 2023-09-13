package Entities;

public class Employee {

    public String name;
    public double GrossSalary;
    public double Tax;
    public double percentage;

      public double NetSalary(){

          return GrossSalary - Tax;

      }
    public void increaseSalary(double percentage) {

        GrossSalary += GrossSalary * percentage / 100.0;
    }
}
