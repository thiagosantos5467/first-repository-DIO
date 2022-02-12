package br.com.dio.banco;

public class ContaCorrente extends Conta{

    String nome = "Conta Corrente";

    public String getNome() {
        return nome;
    }

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    // Esse método imprime as informações da conta com o cabeçalho de conta corrente.
    @Override
    public void imprimirDados(){
        System.out.println("=== Informações da Conta Corrente ===");
        imprimirInfos();
    }

    // Esse método imprime o cabeçalho do método criarConta.
    @Override
    public void criarContaX(Cliente cliente, Conta conta){
        System.out.println("\n======================================");
        System.out.println("====== Criação de conta corrente =====");
        System.out.println("======================================");
        conta.criarConta(cliente, conta);
    }
}
