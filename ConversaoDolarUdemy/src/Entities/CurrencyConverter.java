package Entities;

public class CurrencyConverter {
    public static double cotacaoDolar;
    public static double qtdDolar;


    public static  double valorDolarIof(){

        return cotacaoDolar*qtdDolar*6/100;
    }

    public static double valorDolar(){
        return cotacaoDolar*qtdDolar;

    }



}
