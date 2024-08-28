package entities;

public class ContaBancaria {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    // Construtores
    public ContaBancaria(){
    }

    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial);
    }

    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    // Encapsulamento
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Metodos
    public void deposito(double quantidade) {
        saldo += quantidade;
    }

    public void saque(double quantidade) {
        saldo -= (quantidade + 5.0);
    }

    public String toString() {
        String str = "Account " + numeroConta + ", Holder: " + nomeTitular + ", Balance: $ " + String.format("%.2f", saldo);
        return str;
    }
}
