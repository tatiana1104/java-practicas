public class Colegio {

    private String nombre;
    private Persona rector;
    private Salon[] bloque;

    public Colegio(String nombre, Persona rector, int n) {
        this.nombre = nombre;
        this.rector = rector;
        this.bloque = new Salon[n];
    }

    public boolean trasladar(Colegio traslado, String criterio) {
        for (int i = 0; i < bloque.length; i++) {
            if (bloque[i] != null) {
                Persona temp = bloque[i].buscarEstudiante(criterio);
                if (temp != null) {
                    traslado.getBloque()[i].ingresarEstudiante(temp);
                    this.getBloque()[i].eliminarEstudiante(temp.getId());
                    return true;
                }
            }
        }
        return false;
    }

    public boolean trasladar(Colegio traslado, String criterio, int s) {
        if (bloque[s] != null) {
            Persona temp = bloque[s].buscarEstudiante(criterio);
            if (temp != null) {
                traslado.getBloque()[s].ingresarEstudiante(temp);
                this.getBloque()[s].eliminarEstudiante(temp.getId());
                return true;
            }
        }
        return false;
    }

    public String mostrarCurso(String grado) {
        for (int i = 0; i < bloque.length; i++) {
            if (bloque[i] != null && bloque[i].getGrado().equals(grado)) {
                return bloque[i].toString();
            }
        }
        return "Curso no encontrado.";
    }

    public String mostrarCursos() {
        String salida = "";
        for (int i = 0; i < bloque.length; i++) {
            if (bloque[i] != null) {
                salida += "======================================\n" + bloque[i];
            }
        }
        return salida;
    }

    public Salon[] getBloque() {
        return bloque;
    }

    public void setBloque(Salon[] bloque) {
        this.bloque = bloque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getRector() {
        return rector;
    }

    public void setRector(Persona rector) {
        this.rector = rector;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nRector: " + rector + "\n\t\tCURSOS\n" + mostrarCursos() + '\n';
    }

}
