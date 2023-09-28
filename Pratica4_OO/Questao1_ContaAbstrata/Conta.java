package br.com.Pratica4_OO.Questao1_ContaAbstrata;

abstract class Conta {

        private double saldo;


        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public abstract void imprimeExtrato();

    }


