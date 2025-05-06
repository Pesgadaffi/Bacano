package unidadDos.Arrays;

import java.util.Scanner;

public class EjercicioNueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int DIAS = 5;
        double[] tempMin = new double[DIAS];
        double[] tempMax = new double[DIAS];

        // Ingreso de temperaturas
        for (int i = 0; i < DIAS; i++) {
            System.out.print("Día " + (i + 1) + " - Temperatura mínima: ");
            tempMin[i] = scanner.nextDouble();

            System.out.print("Día " + (i + 1) + " - Temperatura máxima: ");
            tempMax[i] = scanner.nextDouble();
        }

        // 1. Temperatura media de cada día
        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < DIAS; i++) {
            double media = (tempMin[i] + tempMax[i]) / 2;
            System.out.printf("Día %d: %.2f °C%n", i + 1, media);
        }

        // 2. Días con menor temperatura mínima
        double menorTempMin = tempMin[0];
        for (int i = 1; i < DIAS; i++) {
            if (tempMin[i] < menorTempMin) {
                menorTempMin = tempMin[i];
            }
        }

        System.out.println("\nDía(s) con menor temperatura mínima (" + menorTempMin + " °C):");
        for (int i = 0; i < DIAS; i++) {
            if (tempMin[i] == menorTempMin) {
                System.out.println("Día " + (i + 1));
            }
        }

        // 3. Buscar días con temperatura máxima igual a la indicada
        System.out.print("\nIngrese una temperatura máxima para buscar: ");
        double tempBuscada = scanner.nextDouble();
        boolean encontrada = false;

        System.out.println("Día(s) con temperatura máxima igual a " + tempBuscada + " °C:");
        for (int i = 0; i < DIAS; i++) {
            if (tempMax[i] == tempBuscada) {
                System.out.println("Día " + (i + 1));
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No hay ningún día con esa temperatura máxima.");
        }

        scanner.close();
    }
}
