package unidadUno;

import java.util.Scanner;

public class BaseProgEjerc1 {

    public static void main(String[] args) {
        //Realizar un programa que solicite la carga por teclado de dos números,
        //si el primero es mayor al segundo informar su suma y diferencia,
        //en caso contrario informar el producto y la división
        //del primero respecto al segundo.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        double num1= scanner.nextDouble();

        System.out.println("Introduce el segundo numero: ");
        double num2= scanner.nextDouble();

        if (num1 > num2) {
            double suma = num1 + num2;
            double diferencia = num1 - num2;
            System.out.println("El primer numero es mayor ");
            System.out.println("Suma: " + suma);
            System.out.println("Diferencia: " + diferencia);

        }
        else {
            double producto = num1 * num2;
            System.out.println("El primer numero no es mayor: ");
            System.out.println("Producto: " + producto);

            if (num2 !=0){
                double division = num1 / num2;
                System.out.println("Division: " + division);
            }

        }
    scanner.close();

}
}