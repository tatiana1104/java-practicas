package Clase_10_Nov;

public class ejercicio_01 {

    public static void main(String[] args) {
        int a = 0, b = 0;
        for (int i = 1; i <= 5; i++) {
            a = (int) (Math.random() * 11) * 200 + 2000;
            System.out.println("Estudiante #" + i + ": " + a);
            b = b + a;
        }
        System.out.println("Total de aportes: " + b);
        System.out.println("Promedio: " + (b / 5));
    }
}
