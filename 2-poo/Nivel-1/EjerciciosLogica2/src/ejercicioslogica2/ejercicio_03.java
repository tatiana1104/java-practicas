package Clase_10_Nov;

import java.util.Scanner;

public class ejercicio_03 {

    public static void main(String[] args) {

        /*
        ALEATORIO 1 . 6
        6 - 6 y 1 - 1 salen las 4
         */
        int fichas = 4, winYo, winUsted, dado1, dado2, dado3, dado4, max = 6, min = 1;
        Scanner x = new Scanner(System.in);
        System.out.println("PARQUES");
        System.out.println("");
        dado1 = (int) (Math.random() * ((max - min) + 1) + min);
        dado2 = (int) (Math.random() * ((max - min) + 1) + min);
        System.out.println(dado1 + " + " + dado2);
        if (dado1 == 6 && dado2 == 6) {
            System.out.println("Usted ha ganado el juego");
            fichas = 0;
        } else if (dado1 == dado2) {
            System.out.println("Usted puede sacar 1 ficha");
            fichas = fichas - 1;
        } else {
            System.out.println("No puede sacar nada");
        }
        System.out.println("Fichas restantes: " + fichas);
    }

}
