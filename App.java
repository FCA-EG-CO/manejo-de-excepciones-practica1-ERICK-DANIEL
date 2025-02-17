import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingresa un numero entero: ");

        Verificar();
    }

    public static void Verificar() {
        Scanner input = new Scanner(System.in);
        int numero;

        try {
            numero = input.nextInt();
            if (numero % 2 == 0) {
                
            } else {
                throw new Exception("El numero ingresado es par");
            }
        } catch (Exception e) {
            System.out.println("El numero es impar");
        }
    }
}
