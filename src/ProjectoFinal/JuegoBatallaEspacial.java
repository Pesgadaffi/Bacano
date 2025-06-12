package ProjectoFinal;

// Juego: Batalla Espacial (Java - POO - Consola)

import java.util.Random;
import java.util.Scanner;

public class JuegoBatallaEspacial {
    public static void main(String[] args) {
        JuegoEspacial juego = new JuegoEspacial();
        juego.iniciar();
    }
}

class JuegoEspacial {
    private Nave jugador;
    private Enemigo enemigo;
    private Scanner scanner;

    public JuegoEspacial() {
        jugador = new Nave("Halcón Estelar", 100);
        enemigo = new Enemigo("Destructor Alienígena", 80);
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("¡Bienvenido a la Batalla Espacial!");

        while (jugador.estaViva() && enemigo.estaVivo()) {
            mostrarEstado();
            System.out.println("Elige tu acción: [1] Disparar [2] Defender [3] Reparar");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    jugador.disparar(enemigo);
                    break;
                case "2":
                    jugador.defender();
                    break;
                case "3":
                    jugador.reparar();
                    break;
                default:
                    System.out.println("Opción inválida. Pierdes tu turno.");
            }

            if (enemigo.estaVivo()) {
                enemigo.atacar(jugador);
            }
        }

        if (jugador.estaViva()) {
            System.out.println("\n¡Victoria! Has destruido al enemigo.");
        } else {
            System.out.println("\nDerrota... Tu nave ha sido destruida.");
        }
    }

    private void mostrarEstado() {
        System.out.println("\n--- Estado ---");
        System.out.println(jugador.getNombre() + " - Vida: " + jugador.getVida());
        System.out.println(enemigo.getNombre() + " - Vida: " + enemigo.getVida());
        System.out.println("--------------\n");
    }
}

class Nave {
    private String nombre;
    private int vida;
    private boolean defendiendo;

    public Nave(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
        this.defendiendo = false;
    }

    public void disparar(Enemigo enemigo) {
        Random rand = new Random();
        int daño = rand.nextInt(20) + 10;
        System.out.println(nombre + " dispara y causa " + daño + " de daño.");
        enemigo.recibirDaño(daño);
        defendiendo = false;
    }

    public void defender() {
        defendiendo = true;
        System.out.println(nombre + " se prepara para defenderse. Daña reducido en el próximo ataque.");
    }

    public void reparar() {
        Random rand = new Random();
        int reparacion = rand.nextInt(10) + 5;
        vida += reparacion;
        System.out.println(nombre + " repara su nave y recupera " + reparacion + " de vida.");
        defendiendo = false;
    }

    public void recibirDaño(int daño) {
        if (defendiendo) {
            daño /= 2;
            System.out.println(nombre + " se defiende y reduce el daño a " + daño);
        }
        vida -= daño;
    }

    public boolean estaViva() {
        return vida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }
}

class Enemigo {
    private String nombre;
    private int vida;

    public Enemigo(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public void atacar(Nave nave) {
        Random rand = new Random();
        int daño = rand.nextInt(15) + 5;
        System.out.println(nombre + " ataca y causa " + daño + " de daño.");
        nave.recibirDaño(daño);
    }

    public void recibirDaño(int daño) {
        vida -= daño;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }
}