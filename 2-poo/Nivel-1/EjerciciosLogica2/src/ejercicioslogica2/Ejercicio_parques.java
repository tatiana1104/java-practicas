package Clase_10_Nov;

public class Ejercicio_parques {

    public static void main(String[] args) {
        System.out.println("PARQUÉS");
        int dado1, dado2, dado3, dado4, n = 0, max = 6, min = 1, fichas = 4, fichas1 = 4;
        do {
            for (int i = 1; i <= 3; i++) {
                System.out.println("JUGADOR 1");
                dado1 = (int) (Math.random() * ((max - min) + 1) + min);
                System.out.println("Dado 1: " + dado1);
                dado2 = (int) (Math.random() * ((max - min) + 1) + min);
                System.out.println("Dado 2: " + dado2);
                System.out.println("");
                if ((dado1 == 1 && dado2 == 1) || (dado1 == 6 && dado2 == 6)) {
                    fichas = 0;
                    break;
                } else if (dado1 == dado2) {
                    fichas = fichas - 2;
                    break;
                }
            }
            if (fichas == 0) {
                System.out.println("JUGADOR 1 GANA EL JUEGO");
            } else {
                for (int j = 1; j <= 3; j++) {
                    System.out.println("JUGADOR 2");
                    dado3 = (int) (Math.random() * ((max - min) + 1) + min);
                    System.out.println("Dado 1: " + dado3);
                    dado4 = (int) (Math.random() * ((max - min) + 1) + min);
                    System.out.println("Dado 2: " + dado4);
                    System.out.println("");
                    if ((dado3 == 1 && dado4 == 1) || (dado3 == 6 && dado4 == 6)) {
                        fichas1 = 0;
                        break;
                    } else if (dado3 == dado4) {
                        fichas1 = fichas1 - 2;
                        break;
                    }
                }
            }
            if(fichas1 == 0){
                System.out.println("JUGADOR 2 GANA EL JUEGO");
            }
            System.out.println("-------------------------------------");
        } while (fichas != 0 && fichas1 != 0);

    }
}