
package repaso_2;

import java.io.IOException;

public class Repaso_2 {

    public static void main(String[] args) throws IOException {
        
        Libro L;
        Libros Li = new Libros();
                
        Li.Li[1] = new Libro(958040945, 128, "Aventuras de un niño de la calle", "Julia Mercedes Castilla");
        Li.Li[2] = new Libro(978379200, 96, "El principito", " Antoine de Saint-Exupéry");
        
//        L = new Libro(958040945, 128, "Aventuras de un niño de la calle", "Julia Mercedes Castilla");
//        L = new Libro(978379200, 96, "El principito", " Antoine de Saint-Exupéry");
        
//        System.out.println(L.toString());


        System.out.println("\n" + Li.MostrarLibro());
        
        System.out.println("El libro con mas paginas es: " + Li.MayorPag());
    }
    
}
