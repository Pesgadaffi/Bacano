package unidadDos.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        // Entrada de datos
        while (true) {
            System.out.print("Ingrese el nombre del alumno (o * para terminar): ");
            String nombre = scanner.nextLine();

            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Ingrese la edad de " + nombre + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            nombres.add(nombre);
            edades.add(edad);
        }

        // Mostrar alumnos mayores de edad
        System.out.println("\nAlumnos mayores de edad (18 o más):");
        boolean hayMayores = false;
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
                hayMayores = true;
            }
        }
        if (!hayMayores) {
            System.out.println("Ningún alumno es mayor de edad.");
        }

        // Encontrar la mayor edad
        int maxEdad = -1;
        for (int edad : edades) {
            if (edad > maxEdad) {
                maxEdad = edad;
            }
        }

        // Mostrar alumnos con la mayor edad
        System.out.println("\nAlumno(s) con mayor edad (" + maxEdad + " años):");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) == maxEdad) {
                System.out.println(nombres.get(i));
            }
        }

        scanner.close();
    }
}
