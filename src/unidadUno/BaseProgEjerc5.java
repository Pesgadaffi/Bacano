package unidadUno;
import java.util.Scanner;

public class BaseProgEjerc5 {
    public static void main(String[] args) {
    //Realizar un programa que solicite ingresar
    //dos números distintos y muestre por pantalla el mayor de ellos.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce el primer numero: ");
    double num1= scanner.nextDouble();

    System.out.println("Introduce el segundo numero: ");
    double num2= scanner.nextDouble();

    if (num1 > num2) {
        System.out.println(" El " + num1 + " es mayor ");
    }else{
         System.out.println(num2 + " es mayor ");
     }
     scanner.close();
}
}

