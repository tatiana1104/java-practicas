package arreglos01;

public class Edad {

    int edad[] = new int[5];

    public Edad() {
        for (int i = 1; i < 5; i++) {
            edad[i] = (int) Math.floor(Math.random() * 120);
        }
    }

    public int MostrarEdad() {
        for (int i = 1; i < 5; i++) {
            return (edad[i]);
        }
        return 0;
    }

    public double PromedioEdad() {
        double edadtot = 0;
        double edadprom = 0;
        for (int i = 1; i < 5; i++) {
            edadtot = edadtot+ edad[i];
        }
        edadprom = edadtot / 5;
        return edadprom;
    }

    public int PosicionMenor() {
        int men = edad[0];
        int posmen = 0;
        for (int i = 1; i < 5; i++) {
            if (edad[i] < men) {
                posmen = i;
            }
        }
        return posmen;
    }

    public int PosicionMayor() {
        int may = edad[0];
        int posmay = 0;
        for (int i = 1; i < 5; i++) {
            if (edad[i] > may) {
                posmay = i;
            }
        }
        return posmay;
    }

    public int MayorPromedio() {
        int mayprom = 0;
        int edadprom = (int) this.PromedioEdad();
        for (int i = 1; i < 5; i++) {
            if (edad[i] > edadprom) {
                mayprom++;
            }
        }
        return mayprom;
    }

}
