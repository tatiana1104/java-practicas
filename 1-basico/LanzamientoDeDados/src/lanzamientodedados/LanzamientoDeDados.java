package lanzamientodedados;
//generar N lanzamientos de un dado, y mostrar su promedio
//luego mostrar cuales y cuantos lanzamientos estuvieron por encima del promedio
import java.util.Scanner;

public class LanzamientoDeDados {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = 0, acum = 0, cont = 0;
        double prom = 0;
        System.out.println("Ingrese numero de lanzamientos");
        N = entrada.nextInt();
        int Lanzamientos[] = new int[N];
        for (int i = 0; i < N; i++) {
            Lanzamientos[i] = (int) (Math.random() * 6) + 1;
            acum = acum + Lanzamientos[i];
        }
        prom = acum / N;
        System.out.println("Promedio de lanzamientos: " + prom);

        System.out.println("Lanzamientos por encima del promedio");
        System.out.println("Cuales: ");
        for (int i = 0; i < N; i++) {
            if (Lanzamientos[i] > prom) {
                System.out.println(Lanzamientos[i]);
                cont = cont + 1;
            }
        }
        System.out.println("Cuantos: ");
        System.out.println(cont);

    }

}
