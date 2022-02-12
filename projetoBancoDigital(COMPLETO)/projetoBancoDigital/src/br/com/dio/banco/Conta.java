package br.com.dio.banco;
import java.util.Scanner;

public abstract class Conta implements iConta{
    Scanner scan = new Scanner(System.in);

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;
    protected int senha;
    String nome;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    // Esse método auxilia a criação de uma conta "geral".
    @Override
    public void criarConta(Cliente cliente, Conta conta){
        System.out.println("\nQual seu nome completo? ");
        cliente.setNome(scan.next());

        System.out.println("Qual sua idade? ");
        cliente.setIdade(scan.nextInt());
        if (cliente.getIdade() < 18) {
            System.out.println("Não podemos criar conta para menores!");
            System.exit(0);
        }

        System.out.println("Qual seu CPF? ");
        cliente.setCpf(scan.nextLong());

        System.out.println("\n===== Parabéens conta criada =====");
        conta.imprimirInfos();
        System.out.print("- Defina uma senha: ");
        conta.setSenha(scan.nextInt());
        System.out.println("=====================================\n");

    }

    // Esse método executa o recurso de saque.
    @Override
    public void sacar(Conta conta, double valor) {
        System.out.print("\nDigite sua senha: ");
        int senhaTemp = scan.nextInt();

        while (senhaTemp != conta.getSenha()) {
            System.out.println("Senha incorreta!!");
            System.out.print("Digite a senha: ");
            senhaTemp = scan.nextInt();
        }
        this.saldo -= valor;
    }

    // Esse método executa o recurso de deposito.
    @Override
    public void depositar(Conta conta, double valor) {
        System.out.print("\nDigite sua senha: ");
        int senhaTemp = scan.nextInt();

        while (senhaTemp != conta.getSenha()) {
            System.out.println("Senha incorreta!!");
            System.out.print("Digite a senha: ");
            senhaTemp = scan.nextInt();
        }
        this.saldo += valor;
    }

    // Esse método executa o recurso de transferência.
    @Override
    public void transferir(Conta conta, double valor, Conta contaDestino) {
        System.out.print("\nDigite sua senha: ");
        int senhaTemp = scan.nextInt();

        while (senhaTemp != conta.getSenha()) {
            System.out.println("Senha incorreta!!");
            System.out.print("Digite a senha: ");
            senhaTemp = scan.nextInt();
        }
        conta.setSaldo((conta.getSaldo() - valor));
        contaDestino.setSaldo((contaDestino.getSaldo() + valor));
    }

    // Esse método imprime as informações da conta.
    protected void imprimirInfos() {
        System.out.printf("Titular: %s", this.cliente.getNome());
        System.out.printf("\nCPF: %s", this.cliente.getCpf());
        System.out.printf("\nAgencia: %d", this.agencia);
        System.out.printf("\nConta: %d", this.conta);
        System.out.printf("\nSaldo: %.2f", this.saldo);
        System.out.println("\n=====================================");
    }

    // Esse método imprime o saldo da conta.
    public void imprimirExtrato() {
        System.out.println("\n======================================");
        System.out.println("Seu saldo atual é: " + this.saldo);
        System.out.println("======================================");
    }

    // Esse método apresenta ao usuário os recursos que o banco oferece.
    public void recursosBanco(Conta conta, Conta contaDois){

        System.out.println("=====================================");
        System.out.println("=== SELECIONE ABAIXO O QUE DESEJA ===");
        System.out.println("=====================================");
        System.out.println("Para depositar ------------- Digite 1");
        System.out.println("Para sacar ----------------- Digite 2");
        System.out.println("Para transferir ------------ Digite 3");
        System.out.println("Para ver seu saldo --------- Digite 4");
        System.out.println("=====================================");
        System.out.print("Escolha: ");
        int seletor = scan.nextInt();

        while (seletor != 1 && seletor != 2 && seletor != 3 && seletor != 4) {
            System.out.println("=== Essa opção não existe!! ===");
            System.out.print("Digite uma opção válida: ");
            seletor = scan.nextInt();
        }
        switch (seletor) {
            case 1:

                System.out.print("\nQual valor você deseja depositar? ");
                conta.depositar(conta, scan.nextDouble());
                conta.imprimirExtrato();
                System.out.println("Deseja fazer algo mais?");
                System.out.println("Digite 1 para SIM e 2 para NÃO!");
                int aux = scan.nextInt();
                if (aux == 1)
                    conta.recursosBanco(conta, contaDois);
                break;

            case 2:

                System.out.print("\nQual valor você deseja sacar? ");
                conta.sacar(conta, scan.nextDouble());
                conta.imprimirExtrato();
                System.out.println("Deseja fazer algo mais?");
                System.out.println("Digite 1 para SIM e 2 para NÃO!");
                aux = scan.nextInt();
                if (aux == 1)
                    conta.recursosBanco(conta, contaDois);
                break;

            case 3:

                System.out.print("\nQual valor você deseja transferir para a " + contaDois.getNome() + "?");
                conta.transferir(conta, scan.nextDouble(), contaDois);
                conta.imprimirExtrato();
                System.out.println("Saldo da " + contaDois.getNome() + " é: " + contaDois.getSaldo());
                System.out.println("======================================");
                System.out.println("Deseja fazer algo mais?");
                System.out.println("Digite 1 para SIM e 2 para NÃO!");
                aux = scan.nextInt();
                if (aux == 1)
                    conta.recursosBanco(conta, contaDois);
                break;

            case 4:

                System.out.print("\nDigite sua senha: ");
                int senhaTemp = scan.nextInt();

                while (senhaTemp != conta.getSenha()) {
                    System.out.println("Senha incorreta!!");
                    System.out.print("Digite a senha: ");
                    senhaTemp = scan.nextInt();
                }

                conta.imprimirDados();
                System.out.println("Deseja fazer algo mais?");
                System.out.println("Digite 1 para SIM e 2 para NÃO!");
                aux = scan.nextInt();
                if (aux == 1)
                    conta.recursosBanco(conta, contaDois);
                break;
        }
    }
}
