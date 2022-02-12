package br.com.dio.banco;

public class ContaPoupanca extends Conta {

    String nome = "Conta Poupança";

    public String getNome() {
        return nome;
    }

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    // Esse método imprime as informações da conta com o cabeçalho de conta poupança.
    @Override
    public void imprimirDados() {
        System.out.println("=== Informações da Conta Poupança ===");
        imprimirInfos();
    }

    // Esse método imprime o cabeçalho do método criarConta.
    @Override
    public void criarContaX(Cliente cliente, Conta conta) {
        System.out.println("\n======================================");
        System.out.println("====== Criação de conta poupança =====");
        System.out.println("======================================");
        conta.criarConta(cliente, conta);
    }
}
