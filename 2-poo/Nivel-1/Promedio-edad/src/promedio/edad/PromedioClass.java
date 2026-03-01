package promedio.edad;

import java.util.Scanner;

class PromedioClass {

    Scanner dato = new Scanner(System.in);
    int acum;
    int edad;
    int prom;

    void IngresaDatos() {
        int i;
        i = 1;
        for (i = 1; i <= 5; i++) {
            acum = 0;
            System.out.println("Ingresa la edad de la persona: " + i);
            edad = dato.nextInt();
            acum = acum + edad;
        }

    }

    void CalculaProm() {
        prom = acum / 5;
    }

    String MuestraDatos() {
        return ("el promedio de edad de las 5 personas es: " + prom);
    }
}
