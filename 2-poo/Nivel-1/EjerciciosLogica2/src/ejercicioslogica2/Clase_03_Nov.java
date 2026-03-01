
import java.util.Scanner;


public class Clase_03_Nov {

    public static void main(String[] args) {
       
        Scanner x = new Scanner(System.in);
        
        float a,b,c,d;
        
        a = x.nextFloat();
        b = x.nextFloat();
        c = x.nextFloat();
        
        d = ((a+b+c)/3);
        
        if (d >= 3){
            System.out.println("Aprobado");
        }else{
            System.out.println("No aprobado");
        }
    }
    
}
