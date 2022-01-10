package br.com.dio.calculadora;

import java.util.Scanner;

public class secondCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, calc;

        System.out.println("Write the first number: ");
        a = scan.nextInt();

        System.out.println("Write the second number: ");
        b = scan.nextInt();

        System.out.println("What calculation will be done? ");
        System.out.println("Write 1 for sum;");
        System.out.println("Write 2 for subtract;");
        System.out.println("Write 3 for multiply;");
        System.out.println("Write 4 for divide;");

        calc = scan.nextInt();

        switch(calc) {
            case 1:
                System.out.println("The sum is: " + soma(a, b));
                break;

            case 2:
                System.out.println("The remainder is: " + sub(a, b));
                break;

            case 3:
                System.out.println("The product is: " + mult(a, b));
                break;

            case 4:
                System.out.println("The quotient is: " + div(a, b));
                break;
        }
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}
