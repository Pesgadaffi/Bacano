package unidadDos.Arrays;

public class EjercicioDoce {

    public static void main(String[] args) {
        // Definir el tamaño de la matriz (5x15)
        int filas = 5;
        int columnas = 15;
        
        // Crear una tabla de 5x15, inicializada con ceros
        int[][] marco = new int[filas][columnas];
        
        // Rellenar los bordes con 1
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Si es borde (primer fila, última fila, primera columna o última columna)
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    marco[i][j] = 1;
                }
            }
        }

        // Mostrar la tabla en pantalla
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(marco[i][j]);
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}
