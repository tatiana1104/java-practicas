package cadena;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Principal {

    public static void main(String[] args) {

        int opc = 0;
        int contador = 0;
        String cad = null;
        cadena cade;

        Scanner Sc = new Scanner(System.in);

        while (opc != 4) {
            System.out.println("MENU");
            System.out.println("1.  Digite cadena");
            System.out.println("2.  Contar vocales");
            System.out.println("3.  Contar palabras");
            System.out.println("4. Salir");
            opc = Sc.nextInt();

            switch (opc) {
                case 1:
                    try {
                        System.out.print("Digite una cadena ");
                        cad=Sc.next();
                        cad= cad.toLowerCase ();
                        System.out.println("");
                    } catch (InputMismatchException e) {
                        Sc.nextLine();
                        cad = "";
                        System.out.println("Debe introducir una cadena");
                    }
                    break;

                case 2:
                    contador = 0;
                    for (int i = 0; i < cad.length(); i++) {
                        if ((cad.charAt(i) == 'a') || (cad.charAt(i) == 'e') || (cad.charAt(i) == 'i') || (cad.charAt(i) == 'o') || (cad.charAt(i) == 'u')) {
                            contador++;
                        }
                    }
                    System.out.println("La cadena tiene " + contador + " vocales");
                    System.out.println("");
                    break;
                    
                case 3:
                    StringTokenizer st = new StringTokenizer(cad);
                    System.out.println("La cadena tiene " + st.countTokens() + " palabras");
                    System.out.println("");
                    break;
            }
        }
    }
}
