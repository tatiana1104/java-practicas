
package tallerpoo;

public class vendedor {
    private String nombre;
    private double valor1;
    private double valor2;
    private double valor3;
    private double valor4;
    private double valor5;
    private double valor6;
    double valor7;
    private double valor8;
    private double valor9;
    private double valor10;
    private double valor11;
    private double valor12;
    private double sumatotal;
    public vendedor(){
        
    }
    public vendedor(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double v10,double v11,double v12,String nom){
        nombre=nom;
        valor1=v1;
        valor2=v2;
        valor3=v3;
        valor4=v4;
        valor5=v5;
        valor6=v6;
        valor7=v7;
        valor8=v8;
        valor9=v9;
        valor10=v10;
        valor11=v11;
        valor12=v12;
    }
    public double sumatoriaporcliente(){
        double resultado=valor1+valor2+valor3+valor4+valor5+valor6+valor7+valor8+valor9+valor10+valor11+valor12;
        
        return resultado;
    }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getValor3() {
        return valor3;
    }

    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }

    public double getValor4() {
        return valor4;
    }

    public void setValor4(double valor4) {
        this.valor4 = valor4;
    }

    public double getValor5() {
        return valor5;
    }

    public void setValor5(double valor5) {
        this.valor5 = valor5;
    }

    public double getValor6() {
        return valor6;
    }

    public void setValor6(double valor6) {
        this.valor6 = valor6;
    }

    public double getValor7() {
        return valor7;
    }

    public void setValor7(double valor7) {
        this.valor7 = valor7;
    }

    public double getValor8() {
        return valor8;
    }

    public void setValor8(double valor8) {
        this.valor8 = valor8;
    }

    public double getValor9() {
        return valor9;
    }

    public void setValor9(double valor9) {
        this.valor9 = valor9;
    }

    public double getValor10() {
        return valor10;
    }

    public void setValor10(double valor10) {
        this.valor10 = valor10;
    }

    public double getValor11() {
        return valor11;
    }

    public void setValor11(double valor11) {
        this.valor11 = valor11;
    }

    public double getValor12() {
        return valor12;
    }

    public void setValor12(double valor12) {
        this.valor12 = valor12;
    }

    public double getSumatotal() {
        return sumatotal;
    }

    public void setSumatotal(double sumatotal) {
        this.sumatotal = sumatotal;
    }
    
}
