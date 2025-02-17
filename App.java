import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa un numero entero: ");
        numero = input.nextInt();

        try {
            Verificar(numero);
        } catch (Exception e) {
            System.out.println("El numero ingresado no es par.");
        }
    }

    public static void Verificar(int numero) throws Exception {
        if (numero % 2 != 0) {
            throw new Exception();
        }
    }
}
