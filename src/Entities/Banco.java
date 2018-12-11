package Entities;

public class Banco {

    private double numero_conta;
    private String titular_conta;
    private double deposito_inicial;


    public Banco(double numero_conta, String titular_conta, double depositoInicial) {
        this.numero_conta = numero_conta;
        this.titular_conta = titular_conta;
        deposit_money(depositoInicial);
    }
    public Banco(double numero_conta, String titular_conta) {
        this.numero_conta = numero_conta;
        this.titular_conta = titular_conta;
    }

    public double getNumero_conta() {
        return numero_conta;
    }

    public String getTitular_conta() {
        return titular_conta;
    }
    public void setTitular_conta(String titular_conta) {
        this.titular_conta = titular_conta;
    }
    public double getDeposito_inicial() {
        return deposito_inicial;
    }



    public void deposit_money(double deposito_inicial){

       this.deposito_inicial = this.deposito_inicial + deposito_inicial;
    }
    public void withdraw_money(double deposito_inicial){

        this.deposito_inicial = this.deposito_inicial - deposito_inicial - 5;
    }

    public String toString() {
        return " Account " + numero_conta + " Holder: " + titular_conta + ", Balance: $ " + deposito_inicial;

    }






}
