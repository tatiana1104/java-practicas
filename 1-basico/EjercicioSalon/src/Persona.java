public class Persona {

    private long id;
    private String nombre;
    private boolean sexo;

    public Persona(long id, String nombre, boolean sexo) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre " + nombre + " id: " + id + " Genero: " + (sexo ? "Masculino" : "Femenino") + "\n";
    }

}
