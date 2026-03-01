
package arreglo_3_2;

public class Curso {
    Estudiantes arr[];
    int cantidadEst;

    public Curso(Estudiantes[] arr, int cantidadEst ) {
        this.arr = arr;
        this.cantidadEst = cantidadEst;
    }

    
    
    public int EstuAprobaron (){
        int cont = 0;            
        for (int i = 0; i <  arr.length; i++) {
            if (arr[i].notafinal()>2.9){
                cont++;
            }
        }
        return cont;
    }
    public int EstudReprobaron(){
        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].notafinal()<2.9){
                cont++;
            }
        }
        return cont;
    } 
    public int EstuMejorNota(){
        double mejorNota=0;
        int posicion = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].notafinal()>mejorNota){
                mejorNota = arr[i].notafinal();
                posicion = i;            
            }                                     
        }
        return posicion;
    }
    public int EstuPeorNota(){
        double peorNota = 5.0;
        int posicion = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].notafinal()<peorNota){
                peorNota = arr[i].notafinal();
                posicion = i;
            }
        }
        return posicion;
    }
    public double PromedioCurso(){
        double prom = 0;
        for(int i = 0; i < arr.length; i++) {
           prom += arr[i].notafinal();
       }
       return prom/arr.length;
    }
    
}
