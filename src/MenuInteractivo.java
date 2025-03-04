import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar menú
        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Restar dos números");
        System.out.println("3. Multiplicar dos números");
        System.out.println("4. Dividir dos números");
        System.out.print("Ingrese su opción: ");
        
        int opcion = scanner.nextInt();

        double num1, num2, resultado = 0;

        if (opcion >= 1 && opcion <= 4) {
            System.out.print("Ingrese el primer número: ");
            num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            num2 = scanner.nextDouble();
        } else {
            System.out.println("Opción inválida.");
            scanner.close();
            return;  
        }

        switch (opcion) {
            case 1:
            resultado = num1 + num2;
            System.out.println("Resultado de la suma: " + resultado);
            break;
        case 2:
            resultado = num1 - num2;
            System.out.println("Resultado de la resta: " + resultado);
            break;
        case 3:
            resultado = num1 * num2;
            System.out.println("Resultado de la multiplicación: " + resultado);
            break;
        case 4:
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado de la división: " + resultado);
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
            }
            break;
        default:
            System.out.println("Opción inválida.");
    }

    scanner.close();
    }
}
