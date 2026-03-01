package restaurante_universitario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Restaurante_Universitario {

    public static void main(String[] args) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int opc1, opc2, ValorBase = 0, Desc = 0, TotDesc = 0, ValorPagar = 0;
        double prome;

        System.out.println("COMBOS");
        System.out.println("1. Combo 1");
        System.out.println("    Desayuno, almuerzo, cena y (2) snacks.");
        System.out.println("2. Combo 2");
        System.out.println("    Desayuno y almuerzo.");
        System.out.println("2. Combo 3");
        System.out.println("    Desayuno, almuerzo y cena.");
        opc1 = Integer.parseInt(bufEntrada.readLine());
        System.out.println("");

        System.out.println("DIAS");
        System.out.println("1. 3 dias");
        System.out.println("2. 5 dias");
        opc2 = Integer.parseInt(bufEntrada.readLine());
        System.out.println("");

        if (opc1 == 1 && opc2 == 1) {

            ValorBase = 220000;

        } else {

            if (opc1 == 1 && opc2 == 2) {

                ValorBase = 360000;

            } else {

                if (opc1 == 2 && opc2 == 1) {

                    ValorBase = 145000;

                } else {

                    if (opc1 == 2 && opc2 == 2) {

                        ValorBase = 240000;

                    } else {

                        if (opc1 == 3 && opc2 == 1) {

                            ValorBase = 180000;

                        } else {

                            if (opc1 == 3 && opc2 == 2) {

                                ValorBase = 300000;

                            }

                        }

                    }

                }

            }

        }

        System.out.println("Ingrese promedio");
        prome = Double.valueOf(bufEntrada.readLine());
        System.out.println("");

        if (prome > 0 && prome <= 3.2) {
            Desc = 0;
        } else {
            if (prome >= 3.3 && prome <= 3.8) {
                Desc = 5;
            } else {
                if (prome >= 3.9 && prome <= 4.3) {
                    Desc = 8;
                } else {
                    if (prome >= 4.4 && prome <= 5) {
                        Desc = 15;
                    }
                }
            }
        }

        if (prome <= 5) {
            TotDesc = (Desc * ValorBase) / 100;

            ValorPagar = ValorBase - TotDesc;

            System.out.println("Valor a Pagar: " + ValorPagar);
        } else {

            System.out.println("Los sentimos, existe errores en los valores de entrada");
            
        }

    }

}
