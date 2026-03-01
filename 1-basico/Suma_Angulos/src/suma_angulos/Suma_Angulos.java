/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_angulos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class Suma_Angulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int grados1, grados2, gradosrta = 0, minutos1, minutos2, minutosrta = 0, segundos1, segundos2, segundosrta;
        System.out.println("SUMA DE ANGULOS");
        System.out.println("");

        System.out.println("Datos del primer angulo");

        System.out.print("Grados: ");
        grados1 = Integer.parseInt(bufEntrada.readLine());
        while (grados1 > 90) {
            System.out.println("ERROR. VOLVER A INGRESAR DATO");
            System.out.print("Grados: ");
            grados1 = Integer.parseInt(bufEntrada.readLine());
        }

        System.out.print("Minutos: ");
        minutos1 = Integer.parseInt(bufEntrada.readLine());
        while (minutos1 > 60) {
            System.out.println("ERROR. VOLVER A INGRESAR DATO");
            System.out.print("Minutos: ");
            minutos1 = Integer.parseInt(bufEntrada.readLine());
        }

        System.out.print("Segundos: ");
        segundos1 = Integer.parseInt(bufEntrada.readLine());
        while (segundos1 > 60) {
            System.out.println("ERROR. VOLVER A INGRESAR DATO");
            System.out.print("Segundos: ");
            segundos1 = Integer.parseInt(bufEntrada.readLine());
        }
        System.out.println("");

        System.out.println("Datos del segundo angulo");
        System.out.print("Grados: ");
        grados2 = Integer.parseInt(bufEntrada.readLine());
        while (grados2 > 90) {
            System.out.println("ERROR. VOLVER A INGRESAR DATO");
            System.out.print("Grados: ");
            grados2 = Integer.parseInt(bufEntrada.readLine());
        }

        System.out.print("Minutos: ");
        minutos2 = Integer.parseInt(bufEntrada.readLine());
        while (minutos2 > 60) {
            System.out.println("ERROR. VOLVER A INGRESAR DATO");
            System.out.print("Minutos: ");
            minutos2 = Integer.parseInt(bufEntrada.readLine());
        }

        System.out.print("Segundos: ");
        segundos2 = Integer.parseInt(bufEntrada.readLine());
        while (segundos2 > 60) {
            System.out.println("ERROR. VOLVER A INGRESAR DATO");
            System.out.print("Segundos: ");
            segundos2 = Integer.parseInt(bufEntrada.readLine());
        }

        segundosrta = segundos1 + segundos2;
        if (segundosrta > 60) {
            minutosrta = 1;
            segundosrta = segundosrta - 60;
        }

        minutosrta = minutosrta + minutos1 + minutos2;
        if (minutosrta > 60) {
            grados1 = 1;
            minutosrta = minutosrta - 60;
        }

        gradosrta = gradosrta + grados1 + grados2;

        System.out.println("El resultado de la suma es:");
        System.out.println(gradosrta + "° " + minutosrta + "' " + segundosrta + "''");

    }

}
