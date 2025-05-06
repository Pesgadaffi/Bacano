package unidadDos.Arrays;

public class EjercicioTrece {

    public static void main(String[] args) {
        // Número de conductores
        int numConductores = 5; // Puedes cambiar este número según sea necesario
        int diasSemana = 7; // Días de la semana (Lunes a Domingo)

        // Arreglo para almacenar los nombres de los conductores
        String[] nombres = new String[numConductores];
        
        // Tabla bidimensional para almacenar los kilómetros recorridos cada día de la semana
        int[][] kms = new int[numConductores][diasSemana];
        
        // Arreglo para almacenar el total de kilómetros recorridos por cada conductor
        int[] total_kms = new int[numConductores];
        
        // Llenamos el arreglo de nombres (esto se puede hacer de forma manual o dinámica)
        nombres[0] = "Juan";
        nombres[1] = "Carlos";
        nombres[2] = "Maria";
        nombres[3] = "Lucia";
        nombres[4] = "Pedro";

        // Llenamos la tabla de kilómetros para cada conductor y cada día de la semana
        // Esto también se puede hacer dinámicamente dependiendo de la entrada del usuario
        // Ejemplo de kilómetros recorridos por cada conductor (suponiendo que los días son Lunes a Domingo)
        kms[0] = new int[]{50, 60, 70, 80, 90, 100, 110}; // Juan
        kms[1] = new int[]{40, 50, 60, 70, 80, 90, 100}; // Carlos
        kms[2] = new int[]{30, 40, 50, 60, 70, 80, 90}; // Maria
        kms[3] = new int[]{20, 30, 40, 50, 60, 70, 80}; // Lucia
        kms[4] = new int[]{10, 20, 30, 40, 50, 60, 70}; // Pedro

        // Calculamos el total de kilómetros recorridos por cada conductor
        for (int i = 0; i < numConductores; i++) {
            total_kms[i] = 0;
            for (int j = 0; j < diasSemana; j++) {
                total_kms[i] += kms[i][j]; // Sumamos los kilómetros de cada día
            }
        }

        // Mostrar los resultados
        System.out.println("Nombre del conductor | Kilómetros realizados");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < numConductores; i++) {
            System.out.println(nombres[i] + " | " + total_kms[i]);
        }
    }
}
