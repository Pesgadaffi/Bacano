package unidadDos.Arrays;

import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        // Ingreso de valores para vector1
        System.out.println("Ingrese 5 valores para el vector1:");
        for (int i = 0; i < 5; i++) {
            System.out.print("vector1[" + i + "]: ");
            vector1[i] = scanner.nextInt();
        }

        // Ingreso de valores para vector2
        System.out.println("\nIngrese 5 valores para el vector2:");
        for (int i = 0; i < 5; i++) {
            System.out.print("vector2[" + i + "]: ");
            vector2[i] = scanner.nextInt();
        }

        // Suma de los vectores
        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        // Mostrar resultado
        System.out.println("\nResultado de vector3 (suma de vector1 + vector2):");
        for (int i = 0; i < 5; i++) {
            System.out.println("vector3[" + i + "] = " + vector3[i]);
        }

        scanner.close();
    }
}
