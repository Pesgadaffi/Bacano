package unidadDos.Arrays;

import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vector con nombres de los meses
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        // Vector con cantidad de días de cada mes (suponiendo febrero con 28 días)
        int[] diasMeses = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Pedir número de mes
        System.out.print("Ingrese el número de un mes (1 a 12): ");
        int numeroMes = scanner.nextInt();

        // Validar y mostrar resultado
        if (numeroMes >= 1 && numeroMes <= 12) {
            String nombreMes = nombresMeses[numeroMes - 1];
            int dias = diasMeses[numeroMes - 1];

            System.out.println("Mes: " + nombreMes);
            System.out.println("Cantidad de días: " + dias);
        } else {
            System.out.println("Número de mes inválido. Debe estar entre 1 y 12.");
        }

        scanner.close();
    }
}
