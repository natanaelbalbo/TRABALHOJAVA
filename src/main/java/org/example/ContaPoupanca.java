package org.example;
    public class ContaPoupanca extends Conta {
        private static final double SALDO_MINIMO = 50.0;

        public ContaPoupanca(int numero, Pessoa titular) {
            super(numero, titular, SALDO_MINIMO);
        }
    }

