package gimnasio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gimnasio {

    public static void main(String[] args) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

        String P, Plan, S, Servicio;
        int ValorBase = 0, Extra = 0, ValorExtra, TotValor, peso, Desc = 0, ValorDesc, ValorPagar;
        double Altura, IMC;
        int ContCli = 1, Opc = 0, ContInd = 0, ContPar = 0, ContAmi = 0, ContCT = 0, ContMaq = 0, ContTod = 0, ContDes = 0, Acum = 0;
        boolean Op = true;

        while (Op != false) {
            System.out.println("CLIENTE " + ContCli);
            System.out.println("PLANES");
            System.out.println("* Individual (1)");
            System.out.println("* Pareja (2)");
            System.out.println("* Amigos (4)");

            System.out.println("Ingrese Plan");
            P = bufEntrada.readLine();
            Plan = P.toUpperCase();
            System.out.println("");

            if ("INDIVIDUAL".equals(Plan)) {
                ValorBase = 140000;
                ContInd = ContInd + 1;
            } else {
                if ("PAREJA".equals(Plan)) {
                    ValorBase = 250000;
                    ContPar = ContPar + 1;
                } else {
                    if ("AMIGOS".equals(Plan)) {
                        ValorBase = 480000;
                        ContAmi = ContAmi + 1;
                    }
                }
            }

            System.out.println("SERVICIOS");
            System.out.println("* CROSS TRAINNING");
            System.out.println("    Entrenamiento funcional");
            System.out.println("* MAQUINARIA");
            System.out.println("    Toda la maquinaria del gimnasio para nuestros clientes\n"
                    + "con el objetivo de trabajar todos los grupos musculares\n"
                    + "con diferentes herramientas, además de recibir las clases\n"
                    + "de Cross Training");
            System.out.println("* TODO INCLUIDO");
            System.out.println("    Es el servicio más completo de nuestro gimnasio, ofrece\n"
                    + "toda la maquinaria, las clases de cross training y 2 horas a\n"
                    + "la semana de nuestro turco especial.");

            System.out.println("Ingrese servicio");
            S = bufEntrada.readLine();
            Servicio = S.toUpperCase();
            System.out.println("");

            if ("CROSS TRAINNING".equals(Servicio)) {
                Extra = 0;
                ContCT = ContCT + 1;
            } else {
                if ("MAQUINARIA".equals(Servicio)) {
                    Extra = 7;
                    ContMaq = ContMaq + 1;
                } else {
                    if ("TODO INCLUIDO".equals(Servicio)) {
                        Extra = 15;
                        ContTod = ContTod + 1;
                    }
                }
            }

            ValorExtra = (Extra * ValorBase) / 100;

            TotValor = ValorBase + ValorExtra;

            System.out.println("Ingrese Peso");
            peso = Integer.parseInt(bufEntrada.readLine());
            System.out.println("");
            System.out.println("Ingrese Altura");
            Altura = Double.valueOf(bufEntrada.readLine());
            System.out.println("");

            IMC = peso / (Altura * Altura);

            if (IMC > 0 && IMC < 18.4) {
                Desc = 5;
            } else {
                if (IMC >= 18.5 && IMC <= 24.9) {
                    Desc = 2;
                } else {
                    if (IMC >= 30 && IMC <= 40) {
                        Desc = 10;
                    }
                }
            }

            if ("PAREJA".equals(Plan) && Desc == 10) {
                ContDes = ContDes + 1;
            }

            ValorDesc = (Desc * TotValor) / 100;

            ValorPagar = TotValor - ValorDesc;

            System.out.println("CLIENTE " + ContCli + ", Valor a Pagar: " + ValorPagar);
            Acum = Acum + ValorPagar;

            System.out.println("Nuevo cliente: ");
            System.out.println("1. SI");
            System.out.println("2. NO");
            Opc = Integer.parseInt(bufEntrada.readLine());

            if (Opc == 1) {
                Op = true;
                ContCli = ContCli + 1;
            } else if (Opc == 2) {
                Op = false;
            }

        }

        System.out.println("Cantidad de plan individual: " + ContInd);
        System.out.println("Cantidad de plan pareja: " + ContPar);
        System.out.println("Cantidad de plan amigos: " + ContAmi);
        System.out.println("Cantidad de servicio cross training: " + ContCT);
        System.out.println("Cantidad de servicio maquinaria: " + ContMaq);
        System.out.println("Cantidad de servicio todo incluido: " + ContTod);
        System.out.println("Cantidad de plan pareja acreedores al 10% de descuento: " + ContDes);
        System.out.println("Total recaudado a lo largo del día: " + Acum);

    }

}
