
package arreglo_3_2;

import java.io.*;

public class CapturarDatos {
    public String solicitar(String tex) throws IOException {
        BufferedReader tec1 = new BufferedReader(new InputStreamReader(System.in));
        String entrada = "";
        System.out.println(tex);
        entrada = tec1.readLine();
        return entrada;
    }
}
