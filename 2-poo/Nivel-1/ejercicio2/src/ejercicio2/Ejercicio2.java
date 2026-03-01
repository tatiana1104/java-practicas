package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
            System.out.println("Ingrese un numero de dos cifras");
            int a=q.nextInt();
            
            int b=a/10;
            int c=a%10;
            int d= (c*10)+b;
            System.out.println(" El numero invertido es: "+d);
                    
    }
    
}
