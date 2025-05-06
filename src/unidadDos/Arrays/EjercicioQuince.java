package unidadDos.Arrays;

import java.util.Scanner;

public class EjercicioQuince {

    public static void main(String[] args) {
        // Crear las tablas: una para los equipos y otra para los resultados
        String[][] equipos = new String[15][2]; // 15 partidos, 2 equipos por partido
        int[][] resultados = new int[15][2]; // 15 partidos, 2 columnas para los goles

        Scanner scanner = new Scanner(System.in);

        // Pedir los nombres de los equipos para cada partido
        System.out.println("Introduce los equipos para los 15 partidos:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Partido " + (i + 1) + ": ");
            System.out.print("Equipo 1: ");
            equipos[i][0] = scanner.next();
            System.out.print("Equipo 2: ");
            equipos[i][1] = scanner.next();
        }

        // Pedir los resultados de los partidos
        System.out.println("\nIntroduce los resultados de los 15 partidos (goles del equipo 1 y del equipo 2):");
        for (int i = 0; i < 15; i++) {
            System.out.print("Partido " + (i + 1) + " (" + equipos[i][0] + " vs " + equipos[i][1] + "): ");
            System.out.print("Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = scanner.nextInt();
            System.out.print("Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = scanner.nextInt();
        }

        // Mostrar los resultados de la quiniela
        System.out.println("\nResultados de los partidos:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Partido " + (i + 1) + ": " + equipos[i][0] + " " + resultados[i][0] +
                    " - " + resultados[i][1] + " " + equipos[i][1]);
        }

        scanner.close();
    }
}

