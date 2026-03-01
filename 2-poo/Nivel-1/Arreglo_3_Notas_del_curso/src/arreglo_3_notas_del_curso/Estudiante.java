package arreglo_3_notas_del_curso;

import java.io.*;

public class Estudiante {

    double nota1, nota2, nota3, nota4, nota5;
    String codigo="", nombre="";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Estudiante(double nota35, double nota20_1, double nota15, double nota20_2, double nota10) {
        nota1 = nota35;
        nota2 = nota20_1;
        nota3 = nota15;
        nota4 = nota20_2;
        nota5 = nota10;
    }

    public String getIngreseNombre() throws IOException {
        return nombre;
    }
    
    public void setIngreseNombre() throws IOException {
        nombre = br.readLine();
    }
    
     public String getIngresecodigo() throws IOException {
        return codigo;
    }

    public void setIngreseCodigo() throws IOException {
        codigo = br.readLine();
    }

    void IngresaNotas70() throws IOException {
        nota1 = Double.parseDouble(br.readLine());
        while (nota1 > 5 || nota1 < 0) {
            nota1 = Double.parseDouble(br.readLine());
        }
        nota2 = Double.parseDouble(br.readLine());
        while (nota2 > 5 || nota2 < 0) {
            nota2 = Double.parseDouble(br.readLine());
        }
        nota3 = Double.parseDouble(br.readLine());
        while (nota3 > 5 || nota3 < 0) {
            nota3 = Double.parseDouble(br.readLine());
        }
    }

    void IngresaNotas30() throws IOException {
        nota4 = Double.parseDouble(br.readLine());
        while (nota4 > 5 || nota4 < 0) {
            nota4 = Double.parseDouble(br.readLine());
        }
        nota5 = Double.parseDouble(br.readLine());
        while (nota5 > 5 || nota5 < 0) {
            nota5 = Double.parseDouble(br.readLine());
        }
    }

    double Nota70() {

        double prom1;
        prom1 = (nota1 * 0.35) + (nota2 * 0.2) + (nota3 * 0.15);
        return prom1;
    }

    double Nota30() {

        double prom2;
        prom2 = (nota4 * 0.2) + (nota5 * 0.1);
        return prom2;
    }

    public double NotaFinal() {
        double NotaFinal = (Nota70() + Nota30());
        return NotaFinal;
    }
}
