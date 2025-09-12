package practica3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * P4 - Inventario con sobrecarga y validación
 */
public class Inventario {

    // Clase interna para producto
    public static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name) {
            this(name, 0.0, 0);
        }

        public Product(String name, double price) {
            this(name, price, 0);
        }

        public Product(String name, double price, int quantity) {
            if (price < 0) throw new IllegalArgumentException("Precio no puede ser negativo");
            if (quantity < 0) throw new IllegalArgumentException("Cantidad no puede ser negativa");
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%s - Precio: %.2f - Cantidad: %d", name, price, quantity);
        }
    }

    private ArrayList<Product> productos = new ArrayList<>();

    // Agregar solo nombre
    public void agregar(String name) {
        productos.add(new Product(name));
    }

    // Agregar nombre y precio
    public void agregar(String name, double price) {
        productos.add(new Product(name, price));
    }

    // Agregar nombre, precio y cantidad
    public void agregar(String name, double price, int quantity) {
        productos.add(new Product(name, price, quantity));
    }

    public void listar() {
        for (Product p : productos) {
            System.out.println(p);
        }
    }

    // Demo con scanner en main
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        Scanner sc = new Scanner(System.in);

        System.out.println("P4 - Inventario: Prueba rápida");
        try {
            inv.agregar("Lapicero");
            inv.agregar("Cuaderno", 12.5);
            inv.agregar("Mouse", 45.0, 3);
            System.out.println("Productos iniciales:");
            inv.listar();

            // Intento de agregar inválido (demostración de manejo)
            try {
                inv.agregar("ProductoNeg", -5.0, 1);
            } catch (IllegalArgumentException iae) {
                System.out.println("Error detectado al agregar producto: " + iae.getMessage());
            }
        } finally {
            sc.close();
        }
    }
}