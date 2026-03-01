package promedio.edad;


public class PromedioEdad {

    public static void main(String[] args) {
       PromedioClass num = new PromedioClass ();
        num.IngresaDatos();
        num.CalculaProm();
        System.out.println(num.MuestraDatos());   
    }
    
}
