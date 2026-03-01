
import java.util.Scanner;

public class Ejercicio_java_numeros_mul {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        Float a;

        System.out.println("Digite el número");
        a = x.nextFloat();
        if (a % 5 == 0) {
            System.out.println("La mitad es: " + (a / 2));
        } else {
            System.out.println("El cuadrado es: " + Math.pow(a,2));
        }
    }

}
