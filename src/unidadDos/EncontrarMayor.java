package unidadDos;

import java.util.Random;

public class EncontrarMayor {

    public static int encontrarMayor(int num1, int num2, int num3) {
        int mayor = num1; // Asumimos que el primer número es el mayor inicialmente
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        return mayor;
    }

    public static void main(String[] args) {
        // Probando la función con diferentes entradas
        int resultado1 = encontrarMayor(5, 10, 3);
        System.out.println("El mayor de 5, 10 y 3 es: " + resultado1); // Salida: 10

        int resultado2 = encontrarMayor(-2, 8, 1);
        System.out.println("El mayor de -2, 8 y 1 es: " + resultado2); // Salida: 8

        int resultado3 = encontrarMayor(15, 15, 7);
        System.out.println("El mayor de 15, 15 y 7 es: " + resultado3); // Salida: 15

        int resultado4 = encontrarMayor(-5, -10, -2);
        System.out.println("El mayor de -5, -10 y -2 es: " + resultado4); // Salida: -2
    }
}