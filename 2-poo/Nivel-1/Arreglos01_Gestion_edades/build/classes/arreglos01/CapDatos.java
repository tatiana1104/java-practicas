
package arreglos01;

import java.io.*;

public class CapDatos {
    public String solicitar (String m) {
        String dato = null;
        try {
            System.out.println(m);
            BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
            dato = leer.readLine();
        }catch (IOException e) {
        }
        return dato;
        
}}
