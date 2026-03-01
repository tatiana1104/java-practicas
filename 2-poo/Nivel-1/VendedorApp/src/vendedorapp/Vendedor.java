
package vendedorapp;

public class Vendedor {
    //Atributos 
    String nombre;
    int venta1, venta2, venta3, venta4, venta5, venta6, venta7, venta8, venta9, venta10;
    
    // constructor 11 parametros
    public Vendedor(String nombre, int venta1, int venta2, int venta3, int venta4, int venta5, int venta6, int venta7, int venta8, int venta9, int venta10) {
        this.nombre = nombre;
        this.venta1 = venta1;
        this.venta2 = venta2;
        this.venta3 = venta3;
        this.venta4 = venta4;
        this.venta5 = venta5;
        this.venta6 = venta6;
        this.venta7 = venta7;
        this.venta8 = venta8;
        this.venta9 = venta9;
        this.venta10 = venta10;
    }
    
    //Métodos publicos
    //Modifica el nombre de la persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Modifica las ventas de la persona
    public void setVenta1(int venta1) {
        this.venta1 = venta1;
    }
    public void setVenta2(int venta2) {
        this.venta2 = venta2;
    }
    public void setVenta3(int venta3) {
        this.venta3 = venta3;
    }
    public void setVenta4(int venta4) {
        this.venta4 = venta4;
    }
    public void setVenta5(int venta5) {
        this.venta5 = venta5;
    }
    public void setVenta6(int venta6) {
        this.venta6 = venta6;
    }
    public void setVenta7(int venta7) {
        this.venta7 = venta7;
    }
    public void setVenta8(int venta8) {
        this.venta8 = venta8;
    }
    public void setVenta9(int venta9) {
        this.venta9 = venta9;
    }
    public void setVenta10(int venta10) {
        this.venta10 = venta10;
    }
    
    //Calcula la venta
    public int calcularVenta() {
    int ventaTotal = venta1+venta2+venta3+venta4+venta5+venta6+venta7+venta8+venta9+venta10;
    return ventaTotal;
    }
}
