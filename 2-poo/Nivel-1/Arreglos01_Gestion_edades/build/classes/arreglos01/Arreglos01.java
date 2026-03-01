package arreglos01;

import java.io.*;

public class Arreglos01 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader leer = new BufferedReader(new InputStreamReader (System.in));

        int opc = 0;
        Edad per = null;

        while (opc != 6) {
            System.out.println("MENU");
            System.out.println("1. Mostrar edades");
            System.out.println("2. Promedio de la edad");
            System.out.println("3. En qué posición está el arreglo de menor edad");
            System.out.println("4. En qué posición está el arreglo de mayor edad");
            System.out.println("5. Identificar cuántas personas están por encima del promedio");
            System.out.println("6. Salir");
            opc = Integer.parseInt(leer.readLine());
            System.out.println("");
            switch (opc) {
                case 1:
                    per = new Edad();
                    System.out.println(per.MostrarEdad());
                    System.out.println("--------------------------------------------------------------------------");
                    break;

                case 2:
                    per = new Edad();
                    System.out.println("El promedio de la edad es " + per.PromedioEdad());
                    System.out.println("--------------------------------------------------------------------------");
                    break;

                case 3:
                    per = new Edad();
                    System.out.println("En la posicion " + per.PosicionMenor() + " esta el menor");
                    System.out.println("--------------------------------------------------------------------------");
                    break;

                case 4:
                    per = new Edad();
                    System.out.println("En la poscion" + per.PosicionMayor() + " esta el mayor");
                    System.out.println("--------------------------------------------------------------------------");
                    break;

                case 5:
                    per = new Edad();
                    System.out.println(per.PromedioEdad()+ " estan por encima del promedio de la edad");
                    System.out.println("--------------------------------------------------------------------------");
                    break;

                case 6:
                    System.out.println("Hasta la proxima");
                    System.out.println("--------------------------------------------------------------------------");
                    break;

                default:
                    System.out.println("ERROR");
                    break;
            }
        }
    }

}
