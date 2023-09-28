package br.com.Pratica4_OO.Questao2_ContaInterface;

public class GeraExtrato {
    public void geradorConta(Conta conta){
        System.out.println("Saldo Atual: "+conta.getSaldo());
    }
}
