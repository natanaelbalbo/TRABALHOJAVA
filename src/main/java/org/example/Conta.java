package org.example;

class Conta {
    private int numero;
    private Pessoa titular;
    private double saldo;

    public Conta(int numero, Pessoa titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public int getNumero() {
        return numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da Conta " + numero + " - Saldo: R$" + saldo);
    }
}
