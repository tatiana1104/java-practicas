
package gimnasio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gimnasio {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        
        String p, plan, s, servicio;
        int ValorBase = 0, Extra = 0, ValorExtra, TotValor, peso, Desc = 0, ValorDesc, ValorPagar;
        double altura, IMC;
        
        System.out.println("PLANES");
        System.out.println("* Individual (1)");
        System.out.println("* Pareja (2)");
        System.out.println("* Amigos (4)");
        
        System.out.println("Ingrese Combos");
        p = bufEntrada.readLine();
        plan = p.toUpperCase();
        System.out.println("");
        
        if ("INDIVIDUAL".equals(plan)) {
            ValorBase = 140000;
        } else {
            if ("PAREJA".equals(plan)) {
                ValorBase = 250000;
            } else {
                if ("AMIGOS".equals(plan)) {
                    ValorBase = 480000;
                }
            }
        }
        
        System.out.println("SERVICIOS");
        System.out.println("* CROSS TRAINNIG");
        System.out.println("    Entrenamiento funcional");
        System.out.println("* MAQUINARIA");
        System.out.println("    Toda la maquinaria del gimnasio para nuestros clientes\n" +
                                "con el objetivo de trabajar todos los grupos musculares\n" +
                                "con diferentes herramientas, además de recibir las clases\n" +
                                "de Cross Training");
        System.out.println("* TODO INCLUIDO");
        System.out.println("    Es el servicio más completo de nuestro gimnasio, ofrece\n" +
                                "toda la maquinaria, las clases de cross training y 2 horas a\n" +
                                "la semana de nuestro turco especial.");
        
        System.out.println("Ingrese servicio");
        s = bufEntrada.readLine();
        servicio = s.toUpperCase();
        System.out.println("");
        
        if ("CROSS TRAINNIG".equals(servicio)) {
            Extra = 0;
        } else {
            if ("MAQUINARIA".equals(servicio)) {
                Extra = 7;
            } else {
                if ("AMIGOS".equals(plan)) {
                    Extra = 15;
                }
            }
        }
        
        ValorExtra = (Extra * ValorBase) / 100;
        
        TotValor = ValorBase + ValorExtra;
        
        System.out.println("Ingrese Peso");
        peso = Integer.parseInt(bufEntrada.readLine());
        System.out.println("");
        System.out.println("Ingrese Altura");
        altura = Double.valueOf(bufEntrada.readLine());
        System.out.println("");
        
        IMC = peso / (altura*altura);
                
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
        
        
        ValorDesc = (Desc * TotValor) / 100;
        
        ValorPagar = TotValor - ValorDesc;
        
        System.out.println("Valor a Pagar: " + ValorPagar);
    }
    
}
