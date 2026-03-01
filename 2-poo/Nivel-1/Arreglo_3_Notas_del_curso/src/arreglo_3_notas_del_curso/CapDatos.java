
package arreglo_3_notas_del_curso;

import java.io.*;

public class CapDatos {
public String solicitar(String tex) throws IOException {
        BufferedReader tec1 = new BufferedReader(new InputStreamReader(System.in));
        String entrada = "";
        System.out.println(tex);
        entrada = tec1.readLine();
        return entrada;
    }
    
}
