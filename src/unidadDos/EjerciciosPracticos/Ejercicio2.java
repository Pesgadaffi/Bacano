package unidadDos.EjerciciosPracticos;

public class Ejercicio2 {

    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo(5, 10);
        System.out.println("Antes del método: ancho = " + rect.ancho + ", alto = " + rect.alto);

        modificarRectangulo(rect);

        System.out.println("Después del método: ancho = " + rect.ancho + ", alto = " + rect.alto);
    }

    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 20;
        r.alto = 40;
        System.out.println("Dentro del método: ancho = " + r.ancho + ", alto = " + r.alto);
    }
}

class Rectangulo {
    int ancho;
    int alto;

    Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}
