package unidadDos.Arrays;

public class EjercicioOnce {
    public static void main(String[] args) {
        final int TAM = 5;
        int[][] diagonal = new int[TAM][TAM];

        // Cargar la matriz: 1 en la diagonal, 0 en el resto
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }

        // Mostrar la matriz
        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println(); // Salto de línea por fila
        }
    }
}
