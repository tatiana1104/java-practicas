
package competenciadesalto;
//considere una competecnia de calto largo con N atletas. Cada atleta realizara 3 saltos 
//(aleatorio entre 250 cm - 450 cm)
//1. mostrar el mejor salto y el promedio de los tres saltos
//2. Ademas mostraran el promedio de todos los saltos de todos los atletas
//3. la distancia de los saltos que superaron el promedio de todos los saltos
//Ademas el mejor salto de entre los atletlas y el mejor promedio asi como a que atleta corresponde
import java.util.Scanner;

public class CompetenciaDeSalto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);       
        int Atle = 0;
        int Natle[] = new int [Atle], salto[] = new int [3];
        int acum, acum2 = 0, cont = 0;
        double prom = 0 ;

        System.out.println("Ingrese cantidad de atletlas");
        Atle = entrada.nextInt();
        
        System.out.println("1. Mostrar el salto y el promedio de los tres saltos");
         
        for (int i = 0; i < Atle; i++) {
            acum = 0;
            System.out.println("Atleta " + (i+1) + ":");
            for (int j = 0; j < 3; j++) {
                salto[j] = (int) (Math.random() * 200) + 250;
                acum = acum + salto[j];
                acum2 = acum2 + salto[j];
                cont = cont + 1;
                prom = acum / 3;
                System.out.println("Salto " + (j+1) + ": " + salto[j]);
            }
            System.out.println("Promedio: " + prom);
        }
        
        
        System.out.println("2. Promedio de todos los saltos de todos los atletas");
        System.out.println(acum2/cont);
         for (int i = 0; i < Atle; i++) {
             
        }
        
    }
    
}
