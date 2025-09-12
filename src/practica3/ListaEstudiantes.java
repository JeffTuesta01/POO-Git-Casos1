package practica3;

import java.util.ArrayList;

/**
 * P3 - Colecciones (ArrayList)
 */
public class ListaEstudiantes {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();

        // Agregamos 5 nombres
        estudiantes.add("Ana");
        estudiantes.add("Bruno");
        estudiantes.add("Carlos");
        estudiantes.add("Diana");
        estudiantes.add("Eduardo");

        System.out.println("Lista completa:");
        System.out.println(estudiantes);

        // Eliminamos el tercer nombre (índice 2)
        if (estudiantes.size() >= 3) {
            estudiantes.remove(2);
        }

        System.out.println("Después de eliminar el tercer nombre:");
        for (String nombre : estudiantes) {
            System.out.println("- " + nombre);
        }
    }
}