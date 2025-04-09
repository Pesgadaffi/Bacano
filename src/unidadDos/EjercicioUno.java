package unidadDos;

import java.util.Random;

public class ejercicioUno {
    public static void main(String[] args) {
        int[] vectorNumeros = new int[10];
        Random rand = new Random();
        for (int i = 0; i < vectorNumeros.length; i++) {
            vectorNumeros[i] = rand.nextInt(10) + 1; 
        }
        System.out.println("Número | Cuadrado | Cubo");
        System.out.println("--------------------------");
        for (int i = 0; i < vectorNumeros.length; i++) {
            int numero = vectorNumeros[i];
            
            System.out.println(numero + " | " + (numero * numero) + " | " + (numero * numero * numero));
        }
    }
}
