package unidadUno;
import java.util.Scanner;

public class BaseProgEjerc3 {
    public static void main(String[] args) {
        //Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
        //mostrar un mensaje indicando si el número tiene uno o dos dígitos.
        //(Tener en cuenta que condición debe cumplirse para tener dos dígitos
        //un número entero)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número positivo de dos digitos: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 99) {
            if (numero < 10) {
                System.out.println("El número tiene un dígito");
            } else {
                System.out.println("El número tiene dos dígitos");
            }
        } else {
            System.out.println("El número ingresado tiene mas de dos digitos ahi si pailas ñero");
        }

        scanner.close();
    }
}

