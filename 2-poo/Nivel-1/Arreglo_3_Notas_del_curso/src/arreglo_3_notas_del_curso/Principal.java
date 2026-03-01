package arreglo_3_notas_del_curso;

import java.io.*;
import java.util.*;

public class Principal {

    public static void main(String[] args) throws IOException {
        CapDatos tec = new CapDatos();
        Curso a = null;
        Estudiante Dat = null;
        int op = 1;
        double not = 0;
        boolean v = false;
        do {
            System.out.println(" 1. Crear curso...");
            System.out.println("2. Salir...");
            while (v == false) {
                try {
                    op = Integer.parseInt(tec.solicitar("Digite la opcion deseada..."));
                    v = true;
                } catch (NumberFormatException n) {
                    System.out.println("Debe elegir una opcion");
                } catch (IOException e) {
                    System.out.println("ERROR DIGITE DE NUEVO....");
                }
            }
            v = false;
            switch (op) {
                case 1:
                    while (v == false) {
                        try {
                            op = Integer.parseInt(tec.solicitar("Digite el numero de estudiantes..."));
                            a = new Curso(new Estudiante[op]);
                            v = true;
                        } catch (NumberFormatException n) {
                            System.out.println("No digitaste el numero de estudiantes...");
                        } catch (NoSuchElementException ex) {
                            System.out.println("Numero de estudiantes incorrecto...");
                        }
                    }
                    v = false;
                    for (int i = 0; i < op; i++) {
                        while (v == false) {
                            System.out.println("ESTUDIANTE " + (i+1));
                            try {
                                Dat.nombre = (tec.solicitar("Digite el nombre del estudiante..."));
                            } catch (NumberFormatException n) {
                                System.out.println("No digitaste el nombre...");
                            }
                            try {
                                Dat.codigo = tec.solicitar("Digite el codigo del estudiante:");
                            } catch (NumberFormatException n) {
                                System.out.println("No digitaste el codigo...");
                            }
                            System.out.println("NOTAS DEL 70%");
                            try {
                                String nota1;
                                nota1 = tec.solicitar("Digite la nota 1 del estudiante:");
                            } catch (NumberFormatException n) {
                                System.out.println("No digitaste la nota 1...");
                            }
                             try {
                                String nota2;
                                nota2 = tec.solicitar("Digite la nota 2 del estudiante");
                            } catch (NumberFormatException n) {
                                System.out.println("No digitaste la nota 2...");
                            }
                              try {
                                String nota3;
                                nota3 = tec.solicitar("Digite la nota 3 del estudiante:");
                            } catch (NumberFormatException n) {
                                System.out.println("No digitaste la nota 3...");
                            }
                              System.out.println("NOTAS DEL 30%");
                                try {
                                String nota4;
                                nota4 = tec.solicitar("Digite la nota 4 del estudiante:");
                            } catch (NumberFormatException n) {
                                System.out.println("No digitaste la nota 4...");
                            }
                                  try {
                                String nota5;
                                nota5 = tec.solicitar("Digite la nota 5 del estudiante:");
                            } catch (NumberFormatException n) {
                                System.out.println("No digitaste la nota 5...\n");
                            }
                                  v=true;
                        }
                        v = false;
                    }
                    System.out.println("");
                    while (v == false) {
                        System.out.println("1.    Mostrar arreglo...\n"
                                + "2.   Cuantos estudiantes aprobaron...\n"
                                + "3.   Cuantos estudiantes reprobaron...\n"
                                + "4.   Mejor nota del curso..\n"
                                + "5.   Mejor nota del 70 del curso..\n"
                                + "6.   Mejor nota del 30 del curso..\n"
                                + "7.   Peor nota del curso...\n"
                                + "8.   Promedio del curso...\n"
                                + "9. SALIR...");
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
                                System.out.println("\n" + a.mostrarEstudiantes());
                                break;
                            case 2:
                                System.out.println("\nAproveron : " + a.Aprobaron() + "estudiantes");
                                break;
                            case 3:
                                System.out.println("\nReprovaron: " + a.Reprobaron() + "estudiantes");
                                break;
                            case 4:
                                System.out.println("La mejor nota final es: " + a.retDato(a.MejorNota()) + " y pertenece al estudiante: " + (a.MejorNota()+ 1));
                                break;
                                case 5:
                                System.out.println("La mejor nota del 70 es: " + a.retDato(a.MejorNota70()) + " y pertenece al estudiante: " + (a.MejorNota70()+ 1));
                                break;
                                case 6:
                                System.out.println("La mejor nota del 30 es: " + a.retDato(a.MejorNota30()) + " y pertenece al estudiante: " + (a.MejorNota30()+ 1));
                                break;
                            case 7:
                                System.out.println("\nLa nota menor es: " + a.retDato(a.PeorNota()) + " y pertence al estudiante: " + (a.PeorNota() + 1) + "\n");
                                break;
                            case 8:
                                System.out.println("\nLas notas superiores al promedio son: " + a.PromedioCurso() + "\n");
                                break;
                            case 9:
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
