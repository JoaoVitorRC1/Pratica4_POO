package br.com.Pratica4_OO.Questao1_ContaAbstrata;

public class Main {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        cp.setSaldo(2121);
        cp.imprimeExtrato();
    }

}