package unidadDos.Arrays;

import java.util.Scanner;

public class EjercicioDiez {
    public static void main(String[] args) {
        final int FILAS = 5;
        final int COLUMNAS = 5;
        int[][] matriz = new int[FILAS][COLUMNAS];
        Scanner scanner = new Scanner(System.in);

        // Cargar la matriz con datos ingresados por el usuario
        System.out.println("Ingrese los valores para la matriz 5x5:");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Sumar filas
        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < FILAS; i++) {
            int sumaFila = 0;
            for (int j = 0; j < COLUMNAS; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        // Sumar columnas
        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < COLUMNAS; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < FILAS; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaColumna);
        }

        scanner.close();
    }
}
