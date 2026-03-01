package clase_17_Nov;

public class ejer_1 {

    public static void main(String[] args) {

        int[][] x = new int[5][3];
        float[] vprom = new float[5];
        float prom = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = (int) (Math.random() * 10);
                vprom[i] += x[i][j];
                prom += x[i][j];
            }
            vprom[i] = (vprom[i] / 3);
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < vprom.length; i++) {
            System.out.println("Promedio fila " + (i+1)+ " = "+vprom[i]);
        }
        System.out.println("Promedio total de la matriz = " + (prom/15));
    }

}
