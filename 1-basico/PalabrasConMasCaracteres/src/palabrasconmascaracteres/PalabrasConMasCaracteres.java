
package palabrasconmascaracteres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PalabrasConMasCaracteres {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        
        //DEFINICIÓN DE VARIABLES
        //Parrafo = Parafo, donde se ingresa lo que se desea digitar
        //sCad = SubCadena, donde se toma palabra por palabra del parrafo
        //PalLar = Palabra Larga, donde se guarda la palabra mas larga del parrafo
        String Parrafo, sCad, PalLar = null;
        //TotPal = Total Palabras, donde se cuentan cuantas palabras tiene en total el parrafo
        //LetPalLar = Letras Palabra Larga, donde se guarda la cantidad de letras que tiene la PAlabra Larga
        int TotPal, LetPalLar = 0;
        
        //Enunciado 
        System.out.println("Ingrese parrafo");
        //Guarda el parrafo en 'Parrafo'
        Parrafo = bufEntrada.readLine();
        
        //Se utilza debido a se permite partir el parrafo por palabras
        StringTokenizer st = new StringTokenizer(Parrafo);
        //Se cuentan cuantas palabras tiene el parrafo
        TotPal = st.countTokens();
        
        //Para i desde 0 hasta el total de palabras se repitira el ciclo
        for (int i = 0; i < TotPal; i++) {
            //se guarda la siguente palabra del texto
            sCad = st.nextToken();
            
            //si 'total letras de cadena' es mayor a 'letras palabra larga' entonces
            if (sCad.length() > LetPalLar) {
                //Palabra largas se reemplaza por la SubCadena
                PalLar = sCad;
                //'Letra Palabra Larga' se reempalza por el total de letras de la SubCadena
                LetPalLar = sCad.length();
            }
            
        }
        
        //Se muestra los resultados
        System.out.println("");
        System.out.println("La palabra más larga es: " + PalLar);
        System.out.println("Número de letras: " + LetPalLar);
        
    }
    
}
