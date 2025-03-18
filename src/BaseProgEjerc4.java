import java.util.Scanner;

public class BaseProgEjerc4 {
    public static void main(String[] args) {
        //Ingresar el sueldo de una persona, si supera los 3000 dolares mostrar un
        //mensaje en pantalla indicando que debe abonar impuestos.
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su sueldo: ");
        double sueldo = scanner.nextDouble();
        
        if (sueldo > 3000) {
            System.out.println("Debe abonar impuestos.");
        } else{
            System.out.println("Felicidades cucho el gobierno no le va a robar nada");
        }
        scanner.close(); 
    }
}

