package entities;

public class Employee {

    public int Id;
    public String name;
    public double salary;

    public  int percentage;

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        this.Id = Id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(){

        this.salary = (salary + (salary*percentage)/100);

    }
}

