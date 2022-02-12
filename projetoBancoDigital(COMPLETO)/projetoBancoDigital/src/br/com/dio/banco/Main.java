package br.com.dio.banco;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Banco banco = new Banco();
        Cliente clienteCc = new Cliente();
        Cliente clientePp = new Cliente();
        ContaCorrente cc = new ContaCorrente(clienteCc);
        ContaPoupanca poupanca = new ContaPoupanca(clientePp);


        System.out.println("=======================================");
        System.out.println("=== SEJA BEM VINDO AO BANCO " + banco.getNome() + " ===");
        System.out.println("Digite 0 para criar uma conta corrente");
        System.out.println("Digite 1 para criar uma conta poupança");
        System.out.println("=======================================");
        System.out.print("Escolha: ");
        int seletor = scan.nextInt();

        /**
         * Se o numero informado for diferente de 0 ou 1, entrará em
         * loop infinito até que o usuário insira um numero válido.
         */

        while (seletor != 0 && seletor != 1) {
            System.out.println("=== Essa opção não existe!! ===");
            System.out.print("Digite uma opção válida: ");
            seletor = scan.nextInt();
        }
        if (seletor == 0) {
            cc.criarContaX(clienteCc, cc);
        } else {
            poupanca.criarContaX(clientePp, poupanca);
        }

        // Chama os recursos do banco para conta poupança ou conta corrente(de acordo com o seletor).
        if (seletor == 0) {
            cc.recursosBanco(cc, poupanca);
        } else {
            poupanca.recursosBanco(poupanca, cc);
        }
    }
}