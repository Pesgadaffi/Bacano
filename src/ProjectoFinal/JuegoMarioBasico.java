package ProjectoFinal;

// Juego estilo Mario básico en consola (simulación simplificada en Java con POO)

import java.util.Scanner;

public class JuegoMarioBasico {
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciar();
    }
}

class Juego {
    private Personaje mario;
    private Nivel nivel;
    private Scanner scanner;

    public Juego() {
        this.mario = new Personaje("Mario", 3);
        this.nivel = new Nivel(10); // 10 posiciones en el nivel
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("¡Bienvenido al juego de Mario básico!");
        nivel.colocarObstaculo(4);
        nivel.colocarMoneda(2);
        nivel.colocarMeta(9);

        while (!mario.haTerminado() && mario.getVidas() > 0) {
            nivel.mostrarEstado(mario.getPosicion());
            System.out.println("Vida(s): " + mario.getVidas());
            System.out.print("Presiona 'd' para avanzar o 's' para saltar: ");
            String input = scanner.nextLine();

            if (input.equals("d")) {
                mario.avanzar();
            } else if (input.equals("s")) {
                mario.saltar();
            }

            if (nivel.esObstaculo(mario.getPosicion())) {
                System.out.println("¡Oops! Mario chocó con un obstáculo. Pierde una vida.");
                mario.perderVida();
            } else if (nivel.esMoneda(mario.getPosicion())) {
                System.out.println("¡Bien hecho! Mario recogió una moneda.");
                nivel.recogerMoneda(mario.getPosicion());
            } else if (nivel.esMeta(mario.getPosicion())) {
                System.out.println("¡Felicidades! Mario alcanzó la meta.");
                mario.terminar();
            }
        }

        if (mario.getVidas() == 0) {
            System.out.println("Juego terminado. Mario se quedó sin vidas.");
        } else {
            System.out.println("Juego completado con éxito.");
        }
    }
}

class Personaje {
    private String nombre;
    private int vidas;
    private int posicion;
    private boolean terminado;

    public Personaje(String nombre, int vidas) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.posicion = 0;
        this.terminado = false;
    }

    public void avanzar() {
        posicion++;
    }

    public void saltar() {
        posicion += 2;
    }

    public void perderVida() {
        vidas--;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getVidas() {
        return vidas;
    }

    public void terminar() {
        terminado = true;
    }

    public boolean haTerminado() {
        return terminado;
    }
}

class Nivel {
    private char[] mapa;

    public Nivel(int tamaño) {
        mapa = new char[tamaño];
        for (int i = 0; i < mapa.length; i++) {
            mapa[i] = '_';
        }
    }

    public void colocarObstaculo(int posicion) {
        mapa[posicion] = 'X';
    }

    public void colocarMoneda(int posicion) {
        mapa[posicion] = 'O';
    }

    public void colocarMeta(int posicion) {
        mapa[posicion] = 'M';
    }

    public void recogerMoneda(int posicion) {
        mapa[posicion] = '_';
    }

    public boolean esObstaculo(int posicion) {
        return mapa[posicion] == 'X';
    }

    public boolean esMoneda(int posicion) {
        return mapa[posicion] == 'O';
    }

    public boolean esMeta(int posicion) {
        return mapa[posicion] == 'M';
    }

    public void mostrarEstado(int posicionMario) {
        for (int i = 0; i < mapa.length; i++) {
            if (i == posicionMario) {
                System.out.print("P "); // P = Personaje
            } else {
                System.out.print(mapa[i] + " ");
            }
        }
        System.out.println();
    }
}