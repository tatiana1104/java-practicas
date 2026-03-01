
package arreglo_3_2;

import java.io.*;

public class Arreglos2 {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
   
        int cantEstudiante;
        Estudiantes[] arr = null;
        Estudiantes estudiante;
        Curso curso = null;
        
        String identificacion, nombre;
        double n1, n2, n3, n4, n5;
        int opc=0;
        
        CapturarDatos cap = new CapturarDatos();
        while (opc != 7) {
            System.out.println("1.Dilingenciar las notas de estudiantes");
            System.out.println("2. Cuantos estudiantes pasaron");
            System.out.println("3. Cuantos estudiantes perdieron");
            System.out.println("4. Promedio del curso");
            System.out.println("5. Quien Mejor nota del curso");
            System.out.println("6. Quien peor nota del curso ");
            System.out.println("7. salir");
            opc = Integer.parseInt(leer.readLine());
            switch (opc) {
                case 1:
                    System.out.println("Digite la cantidad de estudiantes");
                    cantEstudiante = Integer.parseInt(leer.readLine());
                    curso = new Curso(arr, cantEstudiante);
                    

                    for (int i = 1; i < cantEstudiante; i++) {
                        identificacion = cap.solicitar("Digite la identificaion del estudiante " + i);
                        nombre = cap.solicitar("Digite el nombre del estudiante " + i);
                        System.out.println("Digite las notas del estudiante " + i);
                        n1 = Double.parseDouble(cap.solicitar("Digite la nota 1"));
                        n2 = Double.parseDouble(cap.solicitar("Digite la nota 2"));
                        n3 = Double.parseDouble(cap.solicitar("Digite la nota 3"));
                        n4 = Double.parseDouble(cap.solicitar("Digite la nota 4"));
                        n5 = Double.parseDouble(cap.solicitar("Digite la nota 5"));
                        curso.arr[i] = new Estudiantes(identificacion, nombre, n1, n2, n3, n4, n5);
                         
                    }
                    
                    break;
                case 2:
                    System.out.println("Los estudiantes que pasaron fueron: " + curso.EstuAprobaron());
                    break;
                case 3:
                    System.out.println("Los estudiantes que perdieron fueron: " + curso.EstudReprobaron());
                    break;
                case 4:
                    System.out.println("El promedio del curso es: " + curso.PromedioCurso());
                    break;
                case 5:
                    System.out.println("La mejor nota del curso es: " + curso.EstuMejorNota());
                    break;
                case 6:
                    System.out.println("La mejor nota del curso es: " + curso.EstuPeorNota());
                    break;
                case 7:
                    System.out.println("Hasta la proxima");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

        }

    }

}
