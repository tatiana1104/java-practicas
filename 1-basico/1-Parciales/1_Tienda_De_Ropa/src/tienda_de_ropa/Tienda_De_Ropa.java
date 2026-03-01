
package tienda_de_ropa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tienda_De_Ropa {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        
        int Busto, Cintura, PrecioBase = 0, Extra = 0, PrecioExtra, PrecioFinal;
        String e, Estilo, Talla = null;
        
        System.out.println("Ingrese Busto: ");
        Busto = Integer.parseInt(bufEntrada.readLine());
        System.out.println("");
        System.out.println("Ingrese Cintura: ");
        Cintura = Integer.parseInt(bufEntrada.readLine());
        System.out.println("");
        
        if ((Busto >= 89 && Busto <= 94) && (Cintura >= 67 && Cintura <= 72)) {
            Talla = "S";
        } else {
            if ((Busto >= 95 && Busto <= 100) && (Cintura >= 73 && Cintura <= 78)) {
                Talla = "M";
            } else {
                if ((Busto >= 101 && Busto <= 105) && (Cintura >= 79 && Cintura <= 92)) {
                    Talla = "L";
                }
            }
        }
        
        System.out.println("ESTILOS");
        System.out.println("* CAMELIA");
        System.out.println("* PARADISE");
        System.out.println("* SAFARI");
        System.out.println("* EXOTIC");
        System.out.println("");
        System.out.println("Ingrese Estilo");
        e = bufEntrada.readLine();
        Estilo = e.toUpperCase();
        System.out.println("");
        
        if ("CAMELIA".equals(Estilo)) {
            PrecioBase = 35000;
        } else {
            if ("PARADISE".equals(Estilo)) {
                PrecioBase = 40000;
            } else {
                if ("SAFARI".equals(Estilo)) {
                    PrecioBase = 48000;
                } else {
                    if ("EXOTIC".equals(Estilo)) {
                        PrecioBase = 52000;
                    }
                }
            }
        }
        
        if ("S".equals(Talla)) {
            Extra = 0;
        } else {
            if ("M".equals(Talla)) {
                Extra = 3;
            } else {
                if ("L".equals(Talla)) {
                    Extra = 5;
                }
            }
        }
        
        PrecioExtra = (Extra * PrecioBase) / 100;
        
        PrecioFinal = PrecioBase + PrecioExtra;
        
        if (Talla != null) {
            System.out.println("Precio Final: " + PrecioFinal);
            
        } else {
            System.out.println("Lo sentimos, en “Macarena no tenemos blusas con esas medidas");
        }
         
    }
    
}
