package unidadDos.EjerciciosPracticos;

public class Ejercicio5 {

    public static void main(String[] args) {
        String mensaje = "Texto original";
        System.out.println("Antes del método: " + mensaje);

        modificarCadena(mensaje);

        System.out.println("Después del método: " + mensaje);
    }

    public static void modificarCadena(String texto) {
        texto = texto + " modificado";
        System.out.println("Dentro del método: " + texto);
    }
}
