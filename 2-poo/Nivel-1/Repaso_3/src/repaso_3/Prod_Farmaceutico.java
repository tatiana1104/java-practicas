
package repaso_3;

public class Prod_Farmaceutico {
    String Nombre_Medicamento, Nombre_Gerenerico;
    int Precio,Contenido,Fec_Elaboracion, Fec_Vencimiento;

    public Prod_Farmaceutico(String Nombre_Medicamento, String Nombre_Gerenerico, int Precio, int Contenido, int Fec_Elaboracion, int Fec_Vencimiento) {
        this.Nombre_Medicamento = Nombre_Medicamento;
        this.Nombre_Gerenerico = Nombre_Gerenerico;
        this.Precio = Precio;
        this.Contenido = Contenido;
        this.Fec_Elaboracion = Fec_Elaboracion;
        this.Fec_Vencimiento = Fec_Vencimiento;
    }

    public String getNombre_Medicamento() {
        return Nombre_Medicamento;
    }

    public String getNombre_Gerenerico() {
        return Nombre_Gerenerico;
    }

    public int getPrecio() {
        return Precio;
    }

    public int getContenido() {
        return Contenido;
    }

    public int getFec_Elaboracion() {
        return Fec_Elaboracion;
    }

    public int getFec_Vencimiento() {
        return Fec_Vencimiento;
    }

    public void setNombre_Medicamento(String Nombre_Medicamento) {
        this.Nombre_Medicamento = Nombre_Medicamento;
    }

    public void setNombre_Gerenerico(String Nombre_Gerenerico) {
        this.Nombre_Gerenerico = Nombre_Gerenerico;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public void setContenido(int Contenido) {
        this.Contenido = Contenido;
    }

    public void setFec_Elaboracion(int Fec_Elaboracion) {
        this.Fec_Elaboracion = Fec_Elaboracion;
    }

    public void setFec_Vencimiento(int Fec_Vencimiento) {
        this.Fec_Vencimiento = Fec_Vencimiento;
    }

    public int Precio_RE(){
        int Prec = 0;
        Prec = (Precio * 20)/100;
        return Prec;
    }
    
    @Override
    public String toString() {
        return "Prod_Farmaceutico{" + "Nombre_Medicamento=" + Nombre_Medicamento + ", Nombre_Gerenerico=" + Nombre_Gerenerico + ", Precio=" + Precio + ", Contenido=" + Contenido + ", Fec_Elaboracion=" + Fec_Elaboracion + ", Fec_Vencimiento=" + Fec_Vencimiento + '}';
    }
    
    
}
