package unidadDos;

import java.util.Random;
import java.util.Scanner;

// Clase base: Campeón
class Campeon {
    String nombre;
    int ataque;
    int habilidad;
    int vida;
    int energia;

    public Campeon(String nombre, int ataque, int habilidad) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.habilidad = habilidad;
        this.vida = 600;
        this.energia = 100;
    }

    public void atacar(Campeon oponente) {
        System.out.println(nombre + " lanza un ataque básico a " + oponente.nombre + " causando " + ataque + " de daño.");
        oponente.recibirDaño(ataque);
        energia += 10; // Ganar un poco de energía al atacar
        if (energia > 100) energia = 100;
    }

    public void recibirDaño(int daño) {
        vida -= daño;
        if (vida < 0) vida = 0;
        System.out.println(nombre + " ahora tiene " + vida + " puntos de vida.");
    }

    public void mostrarEstadisticas() {
        System.out.println("\n--- Estadísticas de " + nombre + " ---");
        System.out.println("Ataque: " + ataque);
        System.out.println("Habilidad: " + habilidad);
        System.out.println("Vida: " + vida + " " + barraDeVida());
        System.out.println("Energía: " + energia + "/100");
        System.out.println("-----------------------------------\n");
    }

    public void recuperarse() {
        vida += 80;
        if (vida > 600) vida = 600;
        energia += 30;
        if (energia > 100) energia = 100;
        System.out.println(nombre + " se cura. Vida: " + vida + ", Energía: " + energia);
    }

    public String barraDeVida() {
        int barra = vida * 10 / 600; // Escala a 10 segmentos
        return "[" + "=".repeat(barra) + " ".repeat(10 - barra) + "]";
    }

    public void atacarNexo() {
        System.out.println(nombre + " intenta atacar el Nexo enemigo! (No implementado en esta simulación)");
    }
}

// Clase para las Ultimates
class Ultimate {
    String nombre;
    int costoEnergia;
    int daño;

    public Ultimate(String nombre, int costoEnergia, int daño) {
        this.nombre = nombre;
        this.costoEnergia = costoEnergia;
        this.daño = daño;
    }

    public void usar(Campeon usuario, Campeon objetivo) {
        if (usuario.energia >= costoEnergia) {
            System.out.println(usuario.nombre + " usa su Ultimate: " + nombre + " causando " + daño + " de daño!");
            usuario.energia -= costoEnergia;
            objetivo.recibirDaño(daño);
        } else {
            System.out.println(usuario.nombre + " no tiene suficiente energía para usar " + nombre + ".");
        }
    }
}

// Evelyn
class Evelyn extends Campeon {
    Ultimate ulti;

    public Evelyn() {
        super("Evelyn", 45, 20); // Ataque y Habilidad base
        this.ulti = new Ultimate("Abrazo Agónico", 80, 180);
    }

    public void usarUltimate(Campeon oponente) {
        ulti.usar(this, oponente);
    }
}

// Nidalee
class Nidalee extends Campeon {
    Ultimate ulti;

    public Nidalee() {
        super("Nidalee", 40, 25); // Ataque y Habilidad base
        this.ulti = new Ultimate("Transformación Primaria", 70, 150);
    }

    public void usarUltimate(Campeon oponente) {
        ulti.usar(this, oponente);
    }
}

// Clase principal
public class BatallaLOL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        Evelyn evelyn = new Evelyn();
        Nidalee nidalee = new Nidalee();

        int opcion;
        do {
            System.out.println("\n--- MENÚ DE BATALLA ---");
            System.out.println("1. Evelyn ataca a Nidalee");
            System.out.println("2. Evelyn usa su Ultimate");
            System.out.println("3. Evelyn se cura");
            System.out.println("4. Evelyn intenta atacar el Nexo");
            System.out.println("5. Evelyn se rinde");
            System.out.println("6. Nidalee ataca a Evelyn");
            System.out.println("7. Nidalee usa su Ultimate");
            System.out.println("8. Nidalee se cura");
            System.out.println("9. Nidalee intenta atacar el Nexo");
            System.out.println("10. Nidalee se rinde");
            System.out.println("11. Mostrar estadísticas");
            System.out.println("12. Terminar");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> evelyn.atacar(nidalee);
                case 2 -> evelyn.usarUltimate(nidalee);
                case 3 -> evelyn.recuperarse();
                case 4 -> evelyn.atacarNexo();
                case 5 -> {
                    System.out.println("Evelyn se ha rendido. ¡Nidalee gana!");
                    opcion = 12; // Terminar la batalla
                }
                case 6 -> nidalee.atacar(evelyn);
                case 7 -> nidalee.usarUltimate(evelyn);
                case 8 -> nidalee.recuperarse();
                case 9 -> nidalee.atacarNexo();
                case 10 -> {
                    System.out.println("Nidalee se ha rendido. ¡Evelyn gana!");
                    opcion = 12; // Terminar la batalla
                }
                case 11 -> {
                    evelyn.mostrarEstadisticas();
                    nidalee.mostrarEstadisticas();
                }
                case 12 -> System.out.println("Fin de la batalla.");
                default -> System.out.println("Opción inválida.");
            }

            // Verificar si alguien fue derrotado
            if (evelyn.vida <= 0) {
                System.out.println("Evelyn ha sido derrotada. ¡Nidalee gana!");
                break;
            } else if (nidalee.vida <= 0) {
                System.out.println("Nidalee ha sido derrotada. ¡Evelyn gana!");
                break;
            }

        } while (opcion != 12);

        scanner.close();
    }
}