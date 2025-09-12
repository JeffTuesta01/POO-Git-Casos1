package practica3_pregunta5;

import java.util.Scanner;

/**
 * P5 - Manejo de múltiples excepciones
 */
public class ValidacionNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        String input = sc.nextLine();

        try {
            int value = Integer.parseInt(input); // puede lanzar NumberFormatException
            if (value < 0) {
                throw new NumeroNegativoException("El número no puede ser negativo: " + value);
            }
            System.out.println("Número válido ingresado: " + value);
        } catch (NumberFormatException nfe) {
            System.out.println("Error: valor no numérico. Por favor ingrese un entero.");
        } catch (NumeroNegativoException nne) {
            System.out.println("Error: número negativo detectado -> " + nne.getMessage());
        } finally {
            sc.close();
        }
    }
}