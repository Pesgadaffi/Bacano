public class ContadorNumPares {
    public static void main(String[] args) {
        int contPares = 0;  

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {  
                contPares++; 
            }
        }

        System.out.println("Cantidad de números pares entre 1 y 100: " + contPares);
    }
}
