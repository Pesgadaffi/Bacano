package unidadDos.Arrays;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int contador = 0;

        System.out.println("Ingrese hasta 10 números enteros positivos. Ingrese un número negativo para detener:");

        while (contador < numeros.length) {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; // salir si es negativo
            }

            numeros[contador] = numero;
            contador++;
        }

        // Mostrar solo los valores ingresados
        System.out.println("\nNúmeros ingresados:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
        }

        scanner.close();
    }
}
