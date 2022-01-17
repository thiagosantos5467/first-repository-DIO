package exercitando.metodos.sobrecargas;

public class sobrecarga {
    public static void areaQuadrado(double lado) {
        System.out.println("A área do quadrado é: " + (lado * lado));
    }

    public static void areaRetangulo(double lado1, double lado2) {
        System.out.println("A área do retangulo é: " + (lado1 * lado2));
    }

    public static void areaTrapezio(double baseMenor, double baseMaior, double altura) {
        System.out.println("A área do trapézio é: " + (baseMenor + baseMenor) * altura);
    }

    public static void areaLosango(float diagMaior, float diagMenor) {
        System.out.println("A área do Losango é: " + (diagMaior * diagMenor) / 2);
    }
}
