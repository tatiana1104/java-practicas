
package arreglo02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Capturar {
     public String solicitar(String tex) throws IOException {
        BufferedReader tec1 = new BufferedReader(new InputStreamReader(System.in));
        String entrada = "";
        System.out.println(tex);
        entrada = tec1.readLine();
        return entrada;
    }
}
