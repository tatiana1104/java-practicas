package notafinal;

import java.io.IOException;

public class NotaFinal {

    public static void main(String[] args) throws IOException {
         Estudiante num = new Estudiante (1,2,3,4,5);
        
        System.out.println("Ingerese el codigo del estudiante");
        num.IngreseCodigo();
        System.out.println("Ingrese las notas del 70% del Estudiante");
        Estudiante obj1 = new Estudiante(1,2,3,4,5);
        num.IngresaNotas70();
        System.out.println("Ingrese las notas del 30% del Estudiante");
        num.IngresaNotas30();        
        System.out.println("Nota del 70%: "+obj1.Promedio70());
        System.out.println("Nota del 30%: "+obj1.Promedio30());
        System.out.println("Nota Final: "+obj1.PromedioFinal());
    }
}
