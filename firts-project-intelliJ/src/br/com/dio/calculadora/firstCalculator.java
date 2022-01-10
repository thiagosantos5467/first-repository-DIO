package br.com.dio.calculadora;

import java.io.IOException;
import java.util.Scanner;

public class firstCalculator {
    public static void main(String[] args) throws IOException {
        int a, b, c, calc;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        a = scan.nextInt();

        System.out.println("Digite outro numero: ");
        b = scan.nextInt();

        System.out.println("Para somar, digite 1");
        System.out.println("Para subtrair, digite 2");
        System.out.println("Para multiplicar, digite 3");
        System.out.println("Para dividir, digite 4");

        calc = scan.nextInt();

        if (calc == 1) {
            c = a + b;
            System.out.println("A soma dos numeros digitados é: " + c);
        }
        if (calc == 2) {
            c = a - b;
            System.out.println("O resto dos numeros digitados é: " + c);
        }
        if (calc == 3) {
            c = a * b;
            System.out.println("O produto dos numeros digitados é: " + c);
        }
        if (calc == 4) {
            c = a / b;
            System.out.println("O consciente dos numeros digitados é: " + c);
        }
    }
}