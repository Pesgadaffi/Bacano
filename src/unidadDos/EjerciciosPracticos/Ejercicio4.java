package unidadDos.EjerciciosPracticos;

public class Ejercicio4 {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Antes del método: " + x);

        incrementar(x);  // Este valor se ignora
        System.out.println("Después del método sin usar el retorno: " + x);

        x = incrementar(x);  // Se usa el valor retornado
        System.out.println("Después del método usando el retorno: " + x);
    }

    public static int incrementar(int x) {
        x = x + 1;
        return x;
    }
}
