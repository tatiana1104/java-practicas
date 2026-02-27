/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineflix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
* @author ASUS
 */
public class CINEFLIX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
	
        
        
        int a, b,c, d, e, f, g, h, FeNa, Co, op1, op2, op3, Bol = 0, Cant, ValP, Desc, TotDesc = 0, ValT;
	String FN, FecNac, Cod , fec, cod, DD, MM, YYYY, NomPel, Pel = null;
		
        a = (int) (Math.random() * 10);
        b = (int) (Math.random() * 10);
        c = (int) (Math.random() * 10);
        d = (int) (Math.random() * 10);
        e = (int) (Math.random() * 10);
        f = (int) (Math.random() * 10);
        g = (int) (Math.random() * 10);
        h = (int) (Math.random() * 10);
        
        Cod = Integer.toString(a)+ Integer.toString(b) + Integer.toString(c) + Integer.toString(d) + Integer.toString(e) + Integer.toString(f) + Integer.toString(g) + Integer.toString(h);
         
        System.out.println("Fecha denacimiento (DD-MM-YYYY)");
        FN = bufEntrada.readLine();

        DD = FN.substring(0, 2);
        MM = FN.substring(3, 5);
        YYYY = FN.substring(6, 10);
        FecNac = DD + MM + YYYY;

        System.out.println("TARIFAS");
        System.out.println(" 1. Entre semana");
        System.out.println(" 2. Mi�rcoles");
        System.out.println(" 3. Fines de semana y Festivos");
        op1 = Integer.parseInt(bufEntrada.readLine());
       
        System.out.println("Pelicula");
        System.out.println(" 1. 2D");
        System.out.println(" 2. 3D");
        op2 = Integer.parseInt(bufEntrada.readLine());

        switch (op2) {
            case 1:
                Pel = "2D";
                break;
            case 2:
                Pel = "3D";
                break;
        }
                
        if (op1 == 1 && op2 == 1) {
            System.out.println(" 1. Tarjeta CINEFLIX $20.000");
            System.out.println(" 2. Tarifa Plena $23.000");
            op3 = Integer.parseInt(bufEntrada.readLine());

            switch (op3) {
                case 1:
                    Bol = 20000;
                    break;
                case 2:
                    Bol = 23000;
                    break;
            }
            
        } else {
            
            if (op1 == 1 && op2 == 2) {
                System.out.println(" 1. Tarjeta CINEFLIX $23.000");
                System.out.println(" 2. Tarifa Plena $26.000");
                op3 = Integer.parseInt(bufEntrada.readLine());
                switch (op3) {
                    case 1:
                        Bol = 23000;
                        break;
                    case 2:
                        Bol = 26000;
                        break;
                }
                
            } else {
                if (op1 == 2 && op2 == 1) {
                    
                    System.out.println(" 1. Tarjeta CINEFLIX $10.000");
                    System.out.println(" 2. Tarifa Plena $11.500");
                    op3 = Integer.parseInt(bufEntrada.readLine());
                    
                    switch (op3) {
                        case 1:
                            Bol = 10000;
                            break;
                        case 2:
                            Bol = 11500;
                            break;
                    }
                    
		} else {
                    
                    if (op1==2 && op2==2) {
                        
			System.out.println(" 1. Tarjeta CINEFLIX $11.500");
                        System.out.println(" 2. Tarifa Plena $13.000");
                        op3 = Integer.parseInt(bufEntrada.readLine());
                        switch (op3) {
                            case 1:
                                Bol = 11500;
                                break;
                            case 2:
                                Bol = 13000;
                                break;
                        }
                        
                    } else {
			
                        if (op1==3 && op2==1) {
			
                            System.out.println(" 1. Tarjeta CINEFLIX $23.000");
                            System.out.println(" 2. Tarifa Plena $26.000");
                            op3 = Integer.parseInt(bufEntrada.readLine());
                            
                            switch (op3) {
                                case 1:
                                    Bol = 23000;
                                    break;
                                case 2:
                                    Bol = 26000;
                                    break;
                            }
                        
                        } else {
                            
                            if (op1==3 && op2==2) {
                                
                                System.out.println(" 1. Tarjeta CINEFLIX $25.000");
                                System.out.println(" 2. Tarifa Plena $28.500");
                                op3 = Integer.parseInt(bufEntrada.readLine());
                                switch (op3) {
                                    case 1:
                                        Bol = 25000;
                                        break;
                                    case 2:
                                        Bol = 28500;
                                        break;
                                }
                            }
			}
                    }
		}
            }
	}
        
        System.out.println("Cantidad de boletas");
	Cant = Integer.parseInt(bufEntrada.readLine());
	
        System.out.println("Nombre de la pelicula");
        NomPel = bufEntrada.readLine();
        
	ValP = Bol *Cant;
	
        fec = FecNac.substring(0, 4);
        cod = Cod.substring(3, 7);
        
        if (cod.equals(fec)) {
            Desc = 25;
            TotDesc = (Desc * ValP) / 100;
        } else {
            Desc = 0;
        }
        
        ValT = ValP - TotDesc;
        
        System.out.println("--------------------");
        System.out.println("FACTURA");
        System.out.println("Codigo: " + Cod);
        System.out.println("Fecha de Nacimiento: " + FecNac);
        System.out.println("Pelicula ");
        System.out.println("  Nombre: " + NomPel);
        System.out.println("  Tipo: " + Pel);
        System.out.println("Valor de boleta: " + Bol);
        System.out.println("Cantidad: " + Cant);
        System.out.println("Valor a pagar: " + ValP);
        System.out.println("Descuento: " + Desc + "%");
        System.out.println("Total descuento: " + TotDesc);
        System.out.println("Valor total: " + ValT);
        
    }
    
}
