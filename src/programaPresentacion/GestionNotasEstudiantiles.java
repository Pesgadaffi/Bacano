package programaPresentacion;
import java.util.Scanner;

public class GestionNotasEstudiantiles {

    // Definimos la constante para la aprobación
    final static double LIMITE_APROBACION = 3.0;

    public static void main(String[] args) {
        // Creamos el scanner para ingresar datos
        Scanner scanner = new Scanner(System.in);

        // Número de estudiantes
        final int NUM_ESTUDIANTES = 5;
        
        // Declaramos arrays para almacenar los nombres y las notas
        String[] nombresEstudiantes = new String[NUM_ESTUDIANTES];
        double[][] notasEstudiantes = new double[NUM_ESTUDIANTES][3]; // Matriz para almacenar las 3 asignaturas

        // Recibimos los datos de los estudiantes
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombresEstudiantes[i] = scanner.nextLine(); // Guardamos el nombre

            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese la nota de la asignatura " + (j + 1) + " de " + nombresEstudiantes[i] + ": ");
                notasEstudiantes[i][j] = scanner.nextDouble(); // Guardamos las notas de cada asignatura
            }
            scanner.nextLine();  // Consumimos el salto de línea
        }

        // Mostramos el reporte
        mostrarReporte(nombresEstudiantes, notasEstudiantes);
        scanner.close();
    }

    // Función para mostrar el reporte final
    public static void mostrarReporte(String[] nombresEstudiantes, double[][] notasEstudiantes) {
        System.out.println("\nReporte Final:");
        // Iteramos por cada estudiante
        for (int i = 0; i < nombresEstudiantes.length; i++) {
            double promedio = calcularPromedio(notasEstudiantes[i]); // Calculamos el promedio de cada estudiante
            System.out.print("Estudiante: " + nombresEstudiantes[i] + " | Promedio: " + promedio + " | Estado: ");
            
            // Determinamos si aprobó o reprobó
            if (promedio >= LIMITE_APROBACION) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
        }
    }

    // Función para calcular el promedio de un estudiante
    public static double calcularPromedio(double[] notas) {
        double suma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i]; // Sumamos las tres notas
        }
        return suma / notas.length; // Dividimos entre 3 para obtener el promedio
    }
}