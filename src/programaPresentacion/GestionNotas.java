package programaPresentacion;
import java.util.Scanner;

public class GestionNotas {
     // Miembro 1: Declaración de variables, arrays y entrada de datos
    public static void main(String[] args) {
        final int NUM_ESTUDIANTES = 5;
        final int NUM_ASIGNATURAS = 3;
        final double LIMITE_APROBACION = 3.0;

        // Miembro 1: Declaración de variables, arrays y entrada de datos
        String[] nombres = new String[NUM_ESTUDIANTES];  //String: textos o cadenas de caracteres
        String[] identificaciones = new String[NUM_ESTUDIANTES];
        double[][] notas = new double[NUM_ESTUDIANTES][NUM_ASIGNATURAS];  //Double: Numeros decimales
        double[] promedios = new double[NUM_ESTUDIANTES];
        boolean[] aprobado = new boolean[NUM_ESTUDIANTES];  //Boolean: Tipo de dato que solo puede ser true o false

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            nombres[i] = scanner.nextLine();

            System.out.println("Ingrese la identificación del estudiante " + (i + 1) + ":");
            identificaciones[i] = scanner.nextLine();

            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                double nota;
                do {
                    System.out.println("Ingrese la nota " + (j + 1) + " del estudiante " + nombres[i] + " (entre 0.0 y 5.0):");  //do-while: ejecuta un bloque del codigo al menos una vez y luego lo repite mientras se repita una condicion, aqui es ngresar al menos una vez la nota
                    nota = scanner.nextDouble();
                    if (nota < 0.0 || nota > 5.0) {
                        System.out.println("Nota inválida. Debe estar entre 0.0 y 5.0.");
                    }
                } while (nota < 0.0 || nota > 5.0); //Garantizar q el usuario ingrese una nota valida sin necesidad de bucles complejos
                notas[i][j] = nota;
            }
            scanner.nextLine(); // Limpiar el buffer de entrada
        }
        // Miembro 2: Cálculo de promedios y estado
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            double suma = 0;
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / NUM_ASIGNATURAS;
            promedios[i] = promedio;
            aprobado[i] = promedio >= LIMITE_APROBACION;
        }

        // Miembro 3: Reporte final sin uso de formatos especiales
        System.out.println("\nReporte Final:");
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            String estado = aprobado[i] ? "Aprobado" : "Reprobado";
            // Truncar promedio a dos decimales sin usar formato
            double promedio = Math.floor(promedios[i] * 100) / 100.0;
            System.out.println(nombres[i] + " (ID: " + identificaciones[i] + ") - Promedio: " + promedio + " - " + estado);
        }

        scanner.close();
    }
}
