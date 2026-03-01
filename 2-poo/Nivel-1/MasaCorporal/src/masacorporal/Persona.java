package masacorporal;

import java.util.Scanner;

public class Persona {

    Scanner dat = new Scanner(System.in);
    double peso, altura;

    public Persona() {
        peso = 0;
        altura = 0;
    }

    void IngresePeso() {
        double Peso = dat.nextDouble();
    }

    void IngreseAltura() {
        double altura = dat.nextDouble();
    }

    double CalculaMasa() {
        double Masa = peso / (altura * altura);
        return Masa;
    }

    String IMC() {
        if (CalculaMasa() < 16.00) {
            String a = "Infrapeso: Delgadez Severa";
            return a;
        } else if (CalculaMasa() >= 16.00 || CalculaMasa() <= 16.99) {
            String b = "Infrapeso: Delgadez moderada";
            return b;
        } else if (CalculaMasa() >= 17.00 || CalculaMasa() <= 18.49) {
            String c = "Infrapeso: Delgadez aceptable";
            return c;
        } else if (CalculaMasa() >= 18.50 || CalculaMasa() <= 24.99) {
            String d = "Infrapeso: Delgadez aceptable";
            return d;
        }else if (CalculaMasa() >= 25.00 || CalculaMasa() <= 29.99) {
            String e = "Peso Normal";
            return e;
        } else if (CalculaMasa() >= 30.00 || CalculaMasa() <= 34.99) {
            String f = "Sobrepeso";
            return f;
        } else if (CalculaMasa() >= 30.00 || CalculaMasa() <= 34.99) {
            String g = "Sobrepeso";
            return g;
        } else if (CalculaMasa() >= 30.00 || CalculaMasa() <= 34.99) {
            String h = "Sobrepeso";
            return h;
        } else if (CalculaMasa() >= 30.00 || CalculaMasa() <= 34.99) {
            String i = "Sobrepeso";
            return i;
        } 

    }
