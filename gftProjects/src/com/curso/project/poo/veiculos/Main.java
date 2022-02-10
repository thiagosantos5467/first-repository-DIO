package com.curso.project.poo.veiculos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Carro carrao = new Carro();
        Moto motao = new Moto();
        Caminhao caminhao = new Caminhao();

        /* Criando um carro */
        System.out.print("Qual a cor do carro? ");
        carrao.setCor(in.next());

        System.out.print("Qual a marca do carro? ");
        carrao.setMarca(in.next());

        System.out.print("Qual o modelo do carro? ");
        carrao.setModelo(in.next());

        System.out.print("Qual a capacidade do tanque? ");
        carrao.setCapacidadeTanque(in.nextInt());

        System.out.print("Qual a quantidade de portas? ");
        carrao.setQuantPortas(in.nextInt());


        System.out.println("\nSeu carro é da marca " + carrao.getMarca() + " do modelo " + carrao.getModelo()
                + " da cor " + carrao.getCor() + ", tem " + carrao.getQuantPortas()
                + " portas e capacidade de " + carrao.getCapacidadeTanque() + " litros.");

        System.out.println("Para completar o tanque do " + carrao.getModelo() + " custa, R$ "
                + carrao.valorTanque(5.50) + " reais.");


        /* Criando uma moto */
        System.out.print("\nQual a cor da moto? ");
        motao.setCor(in.next());

        System.out.print("Qual a marca da moto? ");

        motao.setMarca(in.next());
        System.out.print("Qual o modelo da moto? ");
        motao.setModelo(in.next());

        System.out.print("Qual a capacidade do tanque? ");
        motao.setCapacidadeTanque(in.nextInt());

        System.out.print("Tem quantas cilindradas? ");
        motao.setCilindradas(in.nextInt());


        System.out.println("\nSua moto é da marca " + motao.getMarca() + " do modelo " + motao.getModelo()
                + " da cor " + motao.getCor() + " com " + motao.getCilindradas()
                + " cilindradas e tem capacidade de " + motao.getCapacidadeTanque() + " litros.");

        System.out.println("Para completar o tanque da " + motao.getModelo() + " custa, R$ "
                + motao.valorTanque(5.50) + " reais.");


        /* Criando um caminhão */
        System.out.print("\nQual a cor do caminhão? ");
        caminhao.setCor(in.next());

        System.out.print("Qual a marca do caminhao? ");
        caminhao.setMarca(in.next());

        System.out.print("Qual o modelo do caminhao? ");
        caminhao.setModelo(in.next());

        System.out.print("Qual a capacidade do tanque? ");
        caminhao.setCapacidadeTanque(in.nextInt());

        System.out.print("Aguenta quantos quilos? ");
        caminhao.setCapacidadePeso(in.nextInt());


        System.out.println("\nSeu caminhão é da marca " + caminhao.getMarca() + " do modelo "
                + caminhao.getModelo() + " da cor " + caminhao.getCor() + ", aguenta " + caminhao.getCapacidadePeso()
                + " quilos e tem capacidade de " + caminhao.getCapacidadeTanque() + " litros.");

        System.out.println("Para completar o tanque do " + caminhao.getModelo() + " custa, R$ "
                + caminhao.valorTanque(5.50) + " reais.");







    }
}
