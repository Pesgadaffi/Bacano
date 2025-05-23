package unidadDos.EjerciciosPracticos;

public class Ejercicio3 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.print("Antes del método: ");
        imprimirArray(numeros);

        modificarArray(numeros);

        System.out.print("Después del método: ");
        imprimirArray(numeros);
    }

    public static void modificarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
    }

    public static void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
