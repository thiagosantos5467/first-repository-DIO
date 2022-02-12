package br.com.dio.banco;

public interface iConta {

    void sacar(Conta conta, double valor);

    void depositar(Conta conta, double valor);

    void transferir(Conta conta, double valor, Conta contaDestino);

    void imprimirDados();

    void criarConta(Cliente cliente, Conta conta);

    void criarContaX(Cliente cliente, Conta conta);

    void imprimirExtrato();

    void recursosBanco(Conta conta, Conta contaDois);


}
