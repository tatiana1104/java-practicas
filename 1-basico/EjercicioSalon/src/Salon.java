public class Salon {

    private String grado;
    private Persona profesor;
    private Persona[][] estudiantes;

    public Salon(String grado, Persona profesor, int filas, int columnas) {
        this.grado = grado;
        this.profesor = profesor;
        this.estudiantes = new Persona[filas][columnas];
    }

    public boolean ingresarEstudiante(Persona estudiante) {
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                if (estudiantes[i][j] == null) {
                    estudiantes[i][j] = estudiante;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean eliminarEstudiante(long id) {
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                if (estudiantes[i][j] != null && estudiantes[i][j].getId() == id) {
                    estudiantes[i][j] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public Persona buscarEstudiante(String criterio) {
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                if (estudiantes[i][j] != null && (estudiantes[i][j].getId() + "").equals(criterio) || (estudiantes[i][j].getNombre()).contains(criterio)) {
                    return estudiantes[i][j];
                }
            }
        }
        return null;
    }

    public String mostrarSalon(boolean tipo) {
        String salida = "";
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                if(tipo){
                    salida += (estudiantes[i][j] != null)?"[O]":"[_]";
                }else{
                    salida += (estudiantes[i][j]!=null)?estudiantes[i][j]:"CD\t"; 
                }
            }
            salida += "\n";
        }
        return salida;
    }
    


    public Persona[][] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Persona[][] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Persona getProfesor() {
        return profesor;
    }

    public void setProfesor(Persona profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return  grado + "\nProfesor: " + profesor + " Grafica salon: \n" + mostrarSalon(true) + "\nPlanilla salon: \n" + mostrarSalon(false) + '\n';
    }

}
