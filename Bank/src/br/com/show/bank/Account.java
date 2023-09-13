package br.com.show.bank;

public class Account {

    private String ag;
    private String cc;
    private String name;

    private double balance;
    private Log logger;
    private static final int MAX_LENGTH = 20;


    public Account(String ag, String cc, String name) {
        this.ag = ag;
        this.cc = cc;
        setName(name);
        logger = new Log();

    }

    public void setName(String name) {
        if (name.length() > MAX_LENGTH) {
            this.name = name.substring(0, MAX_LENGTH);
        } else {
            this.name = name;
        }
        System.out.println(this.name);
    }

    public void deposit(double value) {
        balance += value;

        logger.out(" Deposito de R$ " + value + ". Seu saldo é de R$ " + balance);

    }

    public boolean Get_the_drift(double value) {

        if (balance < value) {
            logger.out(" Solicitação para saque de : " + value + ". Seu saldo atual é de : R$ " + balance);
            return false;
        } else {
            balance -= value;
            logger.out(" Solicitação para saque de : R$ " + value + ". Seu saldo é de R$ " + balance);
            return true;
        }



    }

}



