
package arreglo02;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Principal {

    public static void main(String[] args) throws IOException {
        Capturar tec = new Capturar();
        Nota a = null;
        int op = 0;
        double not = 0;
        boolean v = false;
        do {
            System.out.println(" 1. Crear arreglo de notas...\n");
            System.out.println("2. Salir...\n");
            while (v == false) {
                try {
                    op = Integer.parseInt(tec.solicitar("Digite la opcion deseada...\n"));
                    v = true;
                } catch (NumberFormatException n) {
                    System.out.println("Debe elegir una opcion\n");
                } catch (IOException e) {
                    System.out.println("ERROR DIGITE DE NUEVO....\n");
                }
            }
            v = false;
            switch (op) {
                case 1:
                    while (v == false) {
                        try {
                            op = Integer.parseInt(tec.solicitar("Digite el numero de notas...\n"));
                            a = new Nota(new double[op]);
                            v = true;
                        } catch (NumberFormatException n) {
                            System.out.println("No digitaste el numero de notas...\n");
                        } catch (NoSuchElementException ex) {
                            System.out.println("Fraccion Incompleta...\n");
                        }
                    }
                    v = false;
                    for (int i = 0; i < op; i++) {
                        while (v == false) {
                            try {
                                if (a.ingresarNotas(not = Double.parseDouble(tec.solicitar("Digite la nota " + (i + 1))), i) == true) {
                                    v = true;
                                }
                            } catch (NumberFormatException n) {
                                System.out.println("No digitaste una nota...\n");
                            }
                        }
                        v = false;
                    }
                    System.out.println("");
                    while (v == false) {
                        System.out.println("1.    Mostrar arreglo...\n"
                                + "2.   Promedio nota...\n"
                                + "3.   Mayor nota...\n"
                                + "4.   Menor nota..\n"
                                + "5.   Notas por encima del promedio...\n"
                                + "6.   Salir...");
                        while (v == false) {
                            try {
                                op = Integer.parseInt(tec.solicitar("Digite la opcion deseada..."));
                                v = true;
                            } catch (NumberFormatException n) {
                                System.out.println("\n...Debe elegir una opcion...\n");
                            } catch (IOException e) {
                                System.out.println("ERROR DIGITE DE NUEVO....\n");
                            }
                        }
                        v = false;
                        switch (op) {
                            case 1:
                                System.out.println("\n" + a.mostrarNotas());
                                break;
                            case 2:
                                System.out.println("\nEl promedio de las notas es: " + a.promedioNotas() + "\n");
                                break;
                            case 3:
                                System.out.println("\nLa nota meyor es: " + a.retDato(a.posMayor()) + " y pertenece a la nota: " + (a.posMayor() + 1) + "\n");
                                break;
                            case 4:
                                System.out.println("\nLa nota menor es: " + a.retDato(a.posMenor()) + " y pertence a la nota: " + (a.posMenor() + 1) + "\n");
                                break;
                            case 5:
                                System.out.println("\nLas notas superiores al promedio son: " + a.mayoresPromedio() + "\n");
                                break;
                            case 6:
                                System.out.println("\nHasta luego...\n");
                                v = true;
                                break;
                            default:
                                System.out.println("\n...Opcion no valida...\n");
                        }
                    }
                    v = false;
                    break;
                case 2:
                    System.out.println("\nHasta luego...");
                    v = true;
                    break;
                default:
                    System.out.println("\n...Opcion no valida...\n");
            }
        } while (v == false);
    }

}
