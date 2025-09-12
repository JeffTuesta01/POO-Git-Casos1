package practica3_pregunta5;

/**
 * Excepción personalizada para números negativos
 */
public class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String message) {
        super(message);
    }
}