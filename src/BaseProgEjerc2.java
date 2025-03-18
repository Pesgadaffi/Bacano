import java.util.Scanner;

public class BaseProgEjerc2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
        //mostrar un mensaje "Promocionado".
       
        System.out.print("Ingrese la primera nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Ingrese la segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Ingrese la tercera nota: ");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Promedio: " + promedio);

        if (promedio >= 7) {
            System.out.println("Promocionado");
        }else{
            System.out.println("Ya perdio papi");
        }

        scanner.close();
    }
}

