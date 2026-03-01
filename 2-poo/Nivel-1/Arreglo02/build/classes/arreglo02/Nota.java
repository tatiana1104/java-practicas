package arreglo02;

public class Nota {

    private double[] notas;

    public Nota(double[] notas) {
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean ingresarNotas(double nota, int pos) {
        boolean r = false;
        if (nota >= 0 && nota <= 5) {
            notas[pos] = nota;
            r = true;
        }
        return r;
    }

    public String mostrarNotas() {
        String mostrar = "";
        for (int i = 0; i < notas.length; i++) {
            mostrar += "Nota " + (i + 1) + " - [" + notas[i] + "]\n";
        }
        return mostrar;
    }

    public double promedioNotas() {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public int posMayor() {
        double notMay = notas[0];
        int pos = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notMay) {
                notMay = notas[i];
                pos = i;
            }
        }
        return pos;
    }

    public int posMenor() {
        double notMen = notas[0];
        int pos = 0;
        for (int j = 1; j < notas.length; j++) {
            if (notas[j] < notMen) {
                notMen = notas[j];
                pos = j;
            }
        }
        return pos;
    }

    public double retDato(int pos) {
        return notas[pos];
    }

    public int mayoresPromedio() {
        int cont = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > this.promedioNotas()) {
                cont++;
            }
        }
        return cont;
    }
}
