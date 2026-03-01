
package repaso_2;

import java.io.*;

public class Libros {
    
    Libro Li[];

    public Libros() {
    }

    public Libros(Libro[] Li) {
        this.Li = Li;
    }

    public Libro[] getLi() {
        return Li;
    }

    public void setLi(Libro[] Li) {
        this.Li = Li;
    }
    
    public String MostrarLibro() throws IOException{
        String mostrar = "";
        try {
        for (int i = 0; Li.length < i; i++) {
            mostrar += "El libro" + Li[i].getTitulo() +  " con ISBN " + Li[i].getISBN() + " creado por " + Li[i].getAutor() + " tiene " + Li[i].getPaginas() + " páginas.\n";
        }
        } catch (Exception e){
            }
            return mostrar;
        
    }
    
    public int MayorPag(){
        double mayorPag = 0;
        int posicion = 0;
        for (int i = 0; i < Li.length; i++) {
            if (Li[i].getPaginas() > mayorPag){
                mayorPag = Li[i].getPaginas();
                posicion = i;            
            }                                     
        }
        return posicion;
    }
    
    
    
}
