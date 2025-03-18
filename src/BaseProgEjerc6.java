import java.util.Scanner;

public class BaseProgEjerc6 {
    public static void main(String[] args) {
    //Se ingresa por teclado un valor entero,
    //mostrar una leyenda que indique si el número es positivo,
    //negativo o nulo (es decir cero)
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número entero: ");
    int numero = scanner.nextInt();

    // Verificar si es positivo, negativo o nulo
    if (numero > 0) {
        System.out.println("El número es positivo.");
    } else if (numero < 0) {
        System.out.println("El número es negativo.");
    } else {
        System.out.println("El número es nulo (cero).");
    }

    scanner.close();
}
}


