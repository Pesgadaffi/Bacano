package unidadDos.Arrays;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vectorOriginal = new String[5];
        String[] vectorInvertido = new String[5];

        // Leer 5 elementos desde el teclado
        System.out.println("Ingrese 5 cadenas de texto:");
        for (int i = 0; i < vectorOriginal.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vectorOriginal[i] = scanner.nextLine();
        }

        // Copiar elementos en orden inverso
        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorInvertido[i] = vectorOriginal[vectorOriginal.length - 1 - i];
        }

        // Mostrar el vector invertido
        System.out.println("\nVector en orden inverso:");
        for (int i = 0; i < vectorInvertido.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vectorInvertido[i]);
        }

        scanner.close();
    }
}
