package arreglo_3_notas_del_curso;

import java.io.*;

public class Curso {

    Estudiante Est[];

    public Curso() {
    }

    public Curso(Estudiante[] Est) {
        this.Est = Est;
    }

    public Estudiante[] getEstudiantes() {
        return Est;
    }

    public void setEstudiantes(Estudiante[] Est) {
        this.Est = Est;
    }
    
    public String mostrarEstudiantes() throws IOException {
        String mostrar = "";
        for (int i = 0; i < Est.length; i++) {
            mostrar += "Estudiante " + (i + 1) + "Nombre - [" + Est[i].getIngreseNombre() + "] \n"+ "Indentificacion  - [" + Est[i].getIngresecodigo() + "] \n" + "Nota - [" + Est[i].NotaFinal() + "]\n\n";
        }
        return mostrar;
    }
    
    public int Aprobaron () {
        int Apro = 0;
        for (int i = 0; i < Est.length; i++) {
            if (Est[i].NotaFinal()>2.9) {
                Apro ++;
            }
        }
        return Apro;
    }
     
    public int Reprobaron () {
        int Repro = 0;
        for (int i = 0; i < Est.length; i++) {
            if (Est[i].NotaFinal()>3.0) {
                Repro ++;
            }
        }
        return Repro;
    }
    
    public int MejorNota () {
        double MejorNota=0;
         int Pos = 0;
        for (int i = 0; i < Est.length; i++) {
            if (Est[i].NotaFinal()>MejorNota) {
                MejorNota = Est[i].NotaFinal();
                Pos = i;
            }
        }
        return Pos;
    }
    public int MejorNota70 () {
        double MejorNota70=0;
         int Pos = 0;
        for (int i = 0; i < Est.length; i++) {
            if (Est[i].Nota70()>MejorNota70) {
                MejorNota70 = Est[i].Nota70();
                Pos = i;
            }
        }
        return Pos;
    }
    
    public int MejorNota30 () {
        double MejorNota30=0;
         int Pos = 0;
        for (int i = 0; i < Est.length; i++) {
            if (Est[i].Nota30()>MejorNota30) {
                MejorNota30 = Est[i].Nota30();
                Pos = i;
            }
        }
        return Pos;
    }
    
    public int PeorNota () {
        double PeorNota = 5.0;
         int Pos = 0;
        for (int i = 0; i < Est.length; i++) {
            if (Est[i].NotaFinal()<PeorNota) {
                PeorNota = Est[i].NotaFinal();
                Pos = i;
            }
        }
        return Pos;
    }
    
    public int PeorNota70 () {
        double PeorNota70 = 5.0;
         int Pos = 0;
        for (int i = 0; i < Est.length; i++) {
            if (Est[i].Nota70()<PeorNota70) {
                PeorNota70 = Est[i].Nota70();
                Pos = i;
            }
        }
        return Pos;
    }
    
    public int PeorNota30 () {
        double PeorNota30 = 5.0;
         int Pos = 0;
        for (int i = 0; i < Est.length; i++) {
            if (Est[i].Nota30()<PeorNota30) {
                PeorNota30 = Est[i].Nota30();
                Pos = i;
            }
        }
        return Pos;
    }
    
     public Estudiante retDato(int pos) {
        return Est[pos];
    }
    
    public double PromedioCurso (){
        double Promedio = 0;
        for (int i = 0; i < Est.length; i++) {
            Promedio += Est[i].NotaFinal();
        }
        return Promedio/Est.length;
    }

}
