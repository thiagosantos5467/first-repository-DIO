package com.curso.project.poo.calculadora;

import java.util.Scanner;

public class calculadoraOrientada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        methods mth = new methods();


        System.out.print("Digite um numero: ");
        int a = entrada.nextInt();

        System.out.print("Digite outro numero: ");
        int b = entrada.nextInt();

        System.out.print("A soma de " + a + " mais " + b + " é igual a " + mth.soma(a, b) + ".");



    }
}