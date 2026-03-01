package clase_17_Nov;

public class vectores_matrices {

    public static void main(String[] args) {

        int[] x = new int[3]; // vector 
        x[1] = 5;
        for (int i = 0; i < x.length; i++) {
            System.out.println("Pos [" + i + "]-> " + x[i]);
        }
        
        int[][] z = new int [3][2];
        z[1][1] = 5;
        for (int f = 0; f < z.length; f++) {
            for (int j = 0; j < z[f].length; j++) {
                System.out.print(z[f][j] + " ");
            }
            System.out.println("");
        }
    }
}
