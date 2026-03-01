package notas;

import java.io.*;

public class Notas {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        int opc = 0;
        Estudiante estu = null;

        while (opc != 8) {
            System.out.println("MENU");
            System.out.println("1.  Cuantos estudiantes tiene el curso");
            System.out.println("2.  Digitar la nota de cada una de ellos");
            System.out.println("3.  Cuantos estudiantes aprobraron");
            System.out.println("4.  Cuantos estudiantes desaprobraron");
            System.out.println("5.  Cual es el promedio del curso");
            System.out.println("6.  Cual fue la mejor nota");
            System.out.println("7.  Cuantos estudiantes esta por debajo del promedio del curso");
            System.out.println("8.  SALIR");
            opc = Integer.parseInt(leer.readLine());
            System.out.println("");
            switch (opc) {
                case 1:
                    estu = new Estudiante();

                    System.out.println("--------------------------------------------------------------------------");
                    break;

                case 2:
                    estu = new Estudiante();

                    System.out.println("--------------------------------------------------------------------------");
                    break;

                case 3:
                    estu = new Estudiante();

                    System.out.println("--------------------------------------------------------------------------");
                    break;

                case 4:
                    estu = new Estudiante();

                    System.out.println("--------------------------------------------------------------------------");
                    break;

                case 5:
                    estu = new Estudiante();

                    System.out.println("--------------------------------------------------------------------------");
                    break;

                case 6:
                    estu = new Estudiante();

                    System.out.println("--------------------------------------------------------------------------");
                    break;

                case 7:
                    estu = new Estudiante();

                    System.out.println("--------------------------------------------------------------------------");
                    break;

                case 8:
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
