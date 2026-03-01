
package notas;

import java.io.*;

public class capDato {
    public String solicitar (String m) {
        String dato = null;
        try {
            System.out.println(m);
            BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
            dato = leer.readLine();
        }catch (IOException e) {
        }
        return dato;
        
}
}
