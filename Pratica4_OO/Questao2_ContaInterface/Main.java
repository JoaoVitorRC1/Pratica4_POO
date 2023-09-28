package br.com.Pratica4_OO.Questao2_ContaInterface;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1200.20);
        cc.sacar(300);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(500.50);
        cp.sacar(25);

        GeraExtrato gerador = new GeraExtrato();
        gerador.geradorConta(cc);
        gerador.geradorConta(cp);
    }

}
