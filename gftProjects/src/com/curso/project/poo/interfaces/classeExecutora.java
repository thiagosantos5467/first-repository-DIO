package com.curso.project.poo.interfaces;

public class classeExecutora implements interfaceExemplo {

    // Apos a implementação, deve ser usado todas as entidades da interface.

    @Override
    public void soma(int a, int b){
        System.out.println("A soma dos operandos é: " + (a + b));
    }
    @Override
    public void sub(int a, int b){
        System.out.println("A subtração dos operandos é: " + (a - b));
    }
    @Override
    public void mult(int a, int b){
        System.out.println("A multiplicação dos operandos é: " + (a * b));
    }

}
