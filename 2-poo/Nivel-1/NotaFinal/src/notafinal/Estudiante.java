package notafinal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Estudiante {

    double nota1, nota2, nota3, nota4, nota5;
    String codigo;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Estudiante(double nota30, double nota25, double nota15, double nota20, double nota10) {
        nota1 = nota30;
        nota2 = nota25;
        nota3 = nota15;
        nota4 = nota20;
        nota5 = nota10;
    }

    void IngreseCodigo() throws IOException {
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

    double Promedio70() {

        double prom1;
        prom1 = (nota1 * 0.3)+(nota2 * 0.25)+(nota3 * 0.15);
        return prom1;
    }

    double Promedio30() {

        double prom2;
        prom2 = (nota4 * 0.2)+(nota5 * 0.1);
        return prom2;
    }

    public double PromedioFinal() {
        double promFinal = (Promedio70() + Promedio30());
        return promFinal;
    }

}
