package practica3_pregunta1;

/**
 * P1 - Sobrecarga de Métodos: Calculadora
 * Implementa tres métodos sumar sobrecargados.
 */
public class Calculadora {

    // Sumar dos enteros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Sumar tres enteros
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Sumar dos double
    public static double sumar(double a, double b) {
        return a + b;
    }

    // main para demostrar uso
    public static void main(String[] args) {
        System.out.println("P1 - Sobrecarga de métodos (Calculadora)");

        int r1 = sumar(2, 3);
        System.out.println("sumar(2,3) = " + r1);

        int r2 = sumar(1, 2, 3);
        System.out.println("sumar(1,2,3) = " + r2);

        double r3 = sumar(2.5, 3.7);
        System.out.println("sumar(2.5, 3.7) = " + r3);
    }
}