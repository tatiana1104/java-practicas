package multiplicacion;

import java.util.Scanner;

class MulClass {

    Scanner num = new Scanner(System.in);
    int d;
    int e;
    String msje = "";

    void IngresaDatos() {
        System.out.println("Escriba dos numeros enteros");
        d = num.nextInt();
        e = num.nextInt();
    }

    void Calcula() {
        msje = "El resultado de la multiplicacion es: " + d * e;
    }

    String MuestraDatos() {
        return (msje);
    }
}
