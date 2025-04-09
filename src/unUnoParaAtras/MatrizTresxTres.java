package unUnoParaAtras;
import java.util.Arrays;

public class MatrizTresxTres {
    public static void main(String[] args) {
        int[][] tablero = {
            {1, 0, 1},
            {0, 1, 0},
            {1, 0, 1}
        };
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
