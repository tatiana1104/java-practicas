
package clase_19_Nov;

import java.util.Scanner;

public class Cine {
    
    public static Scanner tec = new Scanner(System.in);
    

    public static void main(String[] args) {        
        int fil, sillas;
        System.out.println("Filas?");
        fil = tec.nextInt();
        System.out.println("Sillas?");
        sillas = tec.nextInt();
        int[][] cine = new int[fil][sillas];
        for (int i = 0; i < cine.length; i++) {
            for (int j = 0; j < cine[i].length; j++) {
                cine[i][j] = (int) (Math.random() * 5);
            }
        }

        int op;
        do {
            
            op = menu();
            switch (op) {
                case 0:
                    System.out.println("\n\nSILLAS VACIAS");
                    mostrarCine(cine, 0);                    
                    break;

                case 1:
                    System.out.println("\n\nSILLAS OCUPADAS POR HOMBRES");
                    mostrarCine(cine, 1);
                    break;

                case 2:
                    System.out.println("\n\nSILLAS OCUPADAS POR MUJERES");
                    mostrarCine(cine, 2);
                    break;

                case 3:
                    System.out.println("\n\nSILLAS OCUPADAS POR NIÑOS");
                    mostrarCine(cine, 3);
                    break;

                case 4:
                    System.out.println("\n\nSILLAS OCUPADAS POR NIÑAS");
                    mostrarCine(cine, 4);
                    break;
                case 5:
                    System.out.println("\n\nCINE COMPLETO");
                    for (int i = 0; i < cine.length; i++) {
                        for (int j = 0; j < cine[i].length; j++) {                            
                           System.out.print("["+cine[i][j] + "] ");                            
                        }
                        System.out.println("");
                    }
                    break;
                case 6:
                    System.out.println("Cerrando....");
                    break;
                default:
                    System.out.println("=== OPCIÓN INVALIDA ===");                
            }
        } while (op != 6);
      }        
    

    public static void mostrarCine(int[][] cine, int op) {
        for (int i = 0; i < cine.length; i++) {
            for (int j = 0; j < cine[i].length; j++) {
                if (cine[i][j] == op) {
                    System.out.print("[▓" + "] ");
                } else {
                    System.out.print("[_] ");
                }
            }
            System.out.println("");
        }
    }

    public static int menu(){
            System.out.println("╔══════════════════════════════════╗");
            System.out.println("║               MENU               ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println("║ 0....Sillas Vacias               ║");
            System.out.println("║ 1....Sillas ocupadas por Hombres ║");
            System.out.println("║ 2....Sillas ocupadas por Mujeres ║");
            System.out.println("║ 3....Sillas ocupadas por Niños   ║");
            System.out.println("║ 4....Sillas ocupadas por Niñas   ║");
            System.out.println("║ 5....ver Todo el cine            ║");
            System.out.println("║ 6....Salir                       ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.print("Ingrese su opción-->");
            return tec.nextInt();
    }
    
}
