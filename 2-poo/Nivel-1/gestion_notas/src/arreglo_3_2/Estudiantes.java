
package arreglo_3_2;

public class Estudiantes {
   String identificacion;
   String nombre;
   double n1, n2, n3, n4, n5;

    public Estudiantes(String identificacion, String nombre, double n1, double n2, double n3, double n4, double n5) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    
    }

   public String identiEstudiante(){
       return identificacion;
   } 
    public String nombreEst(){
        return nombre;
    }
        public double promedio70() {
        double prom70;
        prom70 = ((n1 * 0.35) + (n2 * 0.2) + (n3 * 0.15));
        return prom70;
    }
    public double promedio30() {
        double prom30;
        prom30 = ((n4 * 0.2) + (n5 * 0.1));
        return prom30;
    }
    public double notafinal(){
        double promgen;
        promgen = promedio70()+ promedio30();
        return promgen;
    }
    
}
