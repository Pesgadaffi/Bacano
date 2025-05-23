package unidadDos.EjerciciosPracticos;

public class Ejercicio1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Antes del intercambio: a = " + a + ", b = " + b);

        intercambiar(a, b);

        System.out.println("Después del intercambio: a = " + a + ", b = " + b);
    }

    public static void intercambiar(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Dentro del método: x = " + x + ", y = " + y);
    }
}
