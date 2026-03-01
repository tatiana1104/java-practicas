package clase_17_Nov;

public class ejer_4 {

    public static void main(String[] args) {

        System.out.println("SALON 1");
        int[][] s1 = new int[3][5];
        int c1 = 0, c2 = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length; j++) {
                s1[i][j] = (int) (Math.random() * ((25 - 15) + 1) + 15);
                System.out.print(s1[i][j] + " ");
            }
            System.out.println("");
        }
        int ini = s1[0][0];
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length; j++) {
                if (s1[i][j] < ini) {
                    ini = s1[i][j];
                }
            }
        }
        System.out.println("");
        System.out.println("La edad del menor estudiante es = " + ini);
        System.out.println("");
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length; j++) {
                if (ini == s1[i][j]) {
                    c1 += 1;
                    System.out.println("Está en la posición [" + i + "][" + j + "]");
                }
            }
        }
        if(c1 > 1){
            System.out.println("Se encuentra " + c1 + " veces");
        }else{
            System.out.println("Se encuentra " + c1 + " vez");
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("SALON 2");
        int[][] s2 = new int[3][5];
        for (int i = 0; i < s2.length; i++) {
            for (int j = 0; j < s2[i].length; j++) {
                s2[i][j] = (int) (Math.random() * ((25 - 15) + 1) + 15);
                System.out.print(s2[i][j] + " ");
            }
            System.out.println("");
        }
        int ini1 = s2[0][0];
        for (int i = 0; i < s2.length; i++) {
            for (int j = 0; j < s2[i].length; j++) {
                if (s2[i][j] > ini1) {
                    ini1 = s2[i][j];
                }
            }
        }
        System.out.println("");
        System.out.println("La edad del mayor estudiante es = " + ini1);
        System.out.println("");
        for (int i = 0; i < s2.length; i++) {
            for (int j = 0; j < s2[i].length; j++) {
                if (ini1 == s2[i][j]) {
                    c2 += 1;
                    System.out.println("Está en la posición [" + i + "][" + j + "]");
                }
            }
        }
        if(c2 > 1){
            System.out.println("Se encuentra " + c2 + " veces");
        }else{
            System.out.println("Se encuentra " + c2 + " vez");
        }
    }
}
