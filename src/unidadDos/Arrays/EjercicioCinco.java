package unidadDos.Arrays;

import java.util.Arrays;
import java.util.Random;

public class EjercicioCinco {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        // Llenar el vector con números aleatorios entre 0 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101); // 0 a 100
        }

        // Mostrar el vector original
        System.out.println("Vector original:");
        System.out.println(Arrays.toString(numeros));

        // Ordenar el vector de menor a mayor
        Arrays.sort(numeros);

        // Mostrar el vector ordenado
        System.out.println("\nVector ordenado de menor a mayor:");
        System.out.println(Arrays.toString(numeros));
    }
}
