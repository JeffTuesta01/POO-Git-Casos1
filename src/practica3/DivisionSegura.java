package practica3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * P2 - Manejo de Errores: división con control de ArithmeticException
 */
public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese dividendo (entero): ");
            int a = sc.nextInt();
            System.out.print("Ingrese divisor (entero): ");
            int b = sc.nextInt();

            // división protegida
            try {
                int resultado = a / b; // puede lanzar ArithmeticException
                System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: división entre cero no permitida");
            }
        } catch (InputMismatchException ime) {
            System.out.println("Error: debe ingresar números enteros válidos.");
        } finally {
            sc.close();
        }
    }
}