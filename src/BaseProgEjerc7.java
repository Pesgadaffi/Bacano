import java.util.Scanner;

public class BaseProgEjerc7 {
    public static void main(String[] args) {
    //Confeccionar un programa que permita cargar un número entero positivo
    //de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
    //Mostrar un mensaje de error si el número de cifras es mayor.
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese un número entero positivo (hasta 3 cifras): ");
    int numero = scanner.nextInt();

    if (numero >= 1 && numero <= 9) {
        System.out.println("El número tiene 1 cifra.");
    } else if (numero >= 10 && numero <= 99) {  //"else if" es para continuar debajo, osea mas si no da
        System.out.println("El número tiene 2 cifras.");
    } else if (numero >= 100 && numero <= 999) {
        System.out.println("El número tiene 3 cifras.");
    } else {
        System.out.println("Error: El número debe tener entre 1 y 3 cifras.");
    }
    scanner.close();
    }
}



