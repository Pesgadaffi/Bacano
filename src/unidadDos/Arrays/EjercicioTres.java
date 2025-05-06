package unidadDos.Arrays;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        // Leer las 5 notas desde teclado
        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.print("Ingrese la nota " + (i + 1) + " (entre 0 y 10): ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Intente nuevamente.");
                }
            } while (nota < 0 || nota > 10);

            notas[i] = nota;
        }

        // Calcular la media, nota máxima y mínima
        double suma = 0;
        double notaMax = notas[0];
        double notaMin = notas[0];

        for (double nota : notas) {
            suma += nota;
            if (nota > notaMax) {
                notaMax = nota;
            }
            if (nota < notaMin) {
                notaMin = nota;
            }
        }

        double media = suma / notas.length;

        // Mostrar todas las notas
        System.out.println("\nNotas ingresadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        // Mostrar resultados
        System.out.println("\nNota media: " + media);
        System.out.println("Nota más alta: " + notaMax);
        System.out.println("Nota más baja: " + notaMin);

        scanner.close();
    }
}
