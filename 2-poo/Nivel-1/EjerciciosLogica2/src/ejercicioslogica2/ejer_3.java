package clase_17_Nov;

import java.util.Scanner;

public class ejer_3 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        int a = x.nextInt();

        int[][] matriz = new int[a][a];
        System.out.println("MATRIZ PRINCIPAL :)");
        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz[fil].length; col++) {
                matriz[fil][col] = (int) (Math.random() * 10);
                System.out.print(matriz[fil][col] + " ");
            }
            System.out.println("");
        }
        System.out.println("TRIANGULO SUPERIOR A LA DIAGONAL PRINCIPAL");
        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz[fil].length; col++) {
                if (col > fil) {
                    System.out.print(matriz[fil][col] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
        System.out.println("TRIANGULO INFERIOR A LA DIAGONAL PRINCIPAL");
        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz[fil].length; col++) {
                if (col < fil) {
                    System.out.print(matriz[fil][col] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
        System.out.println("MARCO");
        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz[fil].length; col++) {
                if (fil == 0 || fil == a - 1 || col == 0 || col == a - 1) {
                    System.out.print(matriz[fil][col] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
    }
}
