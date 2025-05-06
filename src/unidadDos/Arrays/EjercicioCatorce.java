package unidadDos.Arrays;

import java.util.Scanner;

public class EjercicioCatorce {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el número de artículos y sucursales
        int numArticulos = 5;
        int numSucursales = 4;

        // Crear arreglos para almacenar los precios de los artículos
        double[] precios = new double[numArticulos];
        
        // Crear una tabla para almacenar las cantidades vendidas en cada sucursal
        int[][] cantidades = new int[numArticulos][numSucursales];
        
        // Pedir los precios de los artículos
        System.out.println("Ingrese los precios de los 5 artículos:");
        for (int i = 0; i < numArticulos; i++) {
            System.out.print("Precio del artículo " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        // Pedir las cantidades vendidas por sucursal
        System.out.println("\nIngrese las cantidades vendidas en las 4 sucursales para cada artículo:");
        for (int i = 0; i < numArticulos; i++) {
            for (int j = 0; j < numSucursales; j++) {
                System.out.print("Artículo " + (i + 1) + " - Sucursal " + (j + 1) + ": ");
                cantidades[i][j] = scanner.nextInt();
            }
        }

        // Variables para cálculos
        int[] cantidadTotalArticulos = new int[numArticulos]; // Total por artículo
        double[] recaudacionSucursal = new double[numSucursales]; // Recaudación por sucursal
        double recaudacionTotalEmpresa = 0; // Recaudación total de la empresa

        // Calcular cantidades totales por artículo, recaudación por sucursal y total empresa
        for (int i = 0; i < numArticulos; i++) {
            cantidadTotalArticulos[i] = 0;
            for (int j = 0; j < numSucursales; j++) {
                cantidadTotalArticulos[i] += cantidades[i][j];
                recaudacionSucursal[j] += cantidades[i][j] * precios[i];
            }
            recaudacionTotalEmpresa += cantidadTotalArticulos[i] * precios[i];
        }

        // Mostrar la cantidad total de cada artículo
        System.out.println("\nCantidad total de cada artículo:");
        for (int i = 0; i < numArticulos; i++) {
            System.out.println("Artículo " + (i + 1) + ": " + cantidadTotalArticulos[i]);
        }

        // Mostrar la cantidad de artículos en la sucursal 2
        System.out.println("\nCantidad total de artículos en la sucursal 2:");
        for (int i = 0; i < numArticulos; i++) {
            System.out.println("Artículo " + (i + 1) + ": " + cantidades[i][1]);
        }

        // Mostrar la cantidad del artículo 3 en la sucursal 1
        System.out.println("\nCantidad del artículo 3 en la sucursal 1: " + cantidades[2][0]);

        // Mostrar la recaudación total de cada sucursal
        System.out.println("\nRecaudación total de cada sucursal:");
        for (int i = 0; i < numSucursales; i++) {
            System.out.println("Sucursal " + (i + 1) + ": " + recaudacionSucursal[i]);
        }

        // Mostrar la recaudación total de la empresa
        System.out.println("\nRecaudación total de la empresa: " + recaudacionTotalEmpresa);

        // Determinar la sucursal de mayor recaudación
        int sucursalMayorRecaudacion = 0;
        for (int i = 1; i < numSucursales; i++) {
            if (recaudacionSucursal[i] > recaudacionSucursal[sucursalMayorRecaudacion]) {
                sucursalMayorRecaudacion = i;
            }
        }
        System.out.println("\nSucursal de mayor recaudación: Sucursal " + (sucursalMayorRecaudacion + 1));
        
        scanner.close();
    }
}

