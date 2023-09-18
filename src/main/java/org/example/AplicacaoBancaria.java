package org.example;

public class AplicacaoBancaria {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", "123.456.789-00");
        Pessoa pessoa2 = new Pessoa("Maria", "987.654.321-00");

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(1, pessoa1);
        ContaSalario contaSalario1 = new ContaSalario(2, pessoa1);
        ContaCorrente contaCorrente1 = new ContaCorrente(3, pessoa1);

        ContaCorrente contaCorrente2 = new ContaCorrente(4, pessoa2);

        contaPoupanca1.depositar(100.0);
        contaPoupanca1.imprimirExtrato();

        contaSalario1.depositar(2000.0);
        contaSalario1.sacar(500.0);
        contaSalario1.imprimirExtrato();

        contaCorrente1.depositar(500.0);
        contaCorrente1.sacar(200.0);
        contaCorrente1.imprimirExtrato();

        contaCorrente2.depositar(1000.0);
        contaCorrente2.sacar(300.0);
        contaCorrente2.imprimirExtrato();
    }
}

