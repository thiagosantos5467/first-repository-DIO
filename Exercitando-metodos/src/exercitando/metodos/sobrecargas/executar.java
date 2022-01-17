package exercitando.metodos.sobrecargas;

import java.util.Scanner;

public class executar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lado, lado1, lado2, baseMenor, baseMaior, diagMenor, diagMaior, altura;
        int ladoQuadrado;
        int ladoRetangulo, ladoDoisRetangulo;
        int baseMenorTrapezio, baseMaiorTrapezio, h;
        int diagMaiorLos, diagMenorLos;


        System.out.println("Digite o lado do quadrado: ");
        ladoQuadrado = scan.nextInt();

        sobrecarga.areaQuadrado(lado = ladoQuadrado);


        System.out.println("Digite o primeiro lado menor do retangulo: ");
        ladoRetangulo = scan.nextInt();

        System.out.println("Digite o primeiro lado maior do retangulo: ");
        ladoDoisRetangulo = scan.nextInt();

        sobrecarga.areaRetangulo(lado1 = ladoRetangulo, lado2 = ladoDoisRetangulo);


        System.out.println("Digite a base menor do trapezio: ");
        baseMenorTrapezio = scan.nextInt();

        System.out.println("Digite a base maior do trapezio: ");
        baseMaiorTrapezio = scan.nextInt();

        System.out.println("Digite a altura do trapezio: ");
        h = scan.nextInt();

        sobrecarga.areaTrapezio(baseMenor = baseMenorTrapezio, baseMaior = baseMaiorTrapezio, altura = h);


        System.out.println("Digite a diagonal maior do losango: ");
        diagMaiorLos = scan.nextInt();

        System.out.println("Digite a diagonal menor do losango: ");
        diagMenorLos = scan.nextInt();

        sobrecarga.areaLosango(diagMaior = diagMaiorLos, diagMenor = diagMenorLos);
    }

}
