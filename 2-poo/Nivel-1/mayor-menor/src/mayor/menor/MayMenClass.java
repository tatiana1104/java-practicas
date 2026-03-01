package mayor.menor;

import java.util.Scanner;

class MayMenClass {

    Scanner num = new Scanner(System.in);
    double a;
    double b;
    double c;
    double may;
    double men;
    String msje1 = "";
    String msje2 = "";

    void IngresaDatos() {
        System.out.println("Escriba tres numeros (pueden ser reales)");
        a = num.nextDouble();
        b = num.nextDouble();
        c = num.nextDouble();
    }

    void CalculaMay() {
        if (a >= b && a >= c) {
            may = a;
        } else {
            if (b >= a && b >= c) {
                may = b;
            } else {
                if (c >= a && c >= b) {
                    may = c;
                }
            }
        }
        msje1 = "El numero mayor es: " + may;
    }

    void CalculaMen() {
        if (a <= b && a <= c) {
            men = a;
        } else {
            if (b <= a && b <= c) {
                men = b;
            } else {
                if (c <= a && c <= b) {
                    men = c;
                }
            }
        }
        msje2 = "El numero menor es: " + men;
    }

    String MuestraDatos() {
        return (msje1 + "." + msje2 + ".");
    }
}
