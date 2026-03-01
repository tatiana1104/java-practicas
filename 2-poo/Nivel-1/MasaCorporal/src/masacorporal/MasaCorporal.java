
package masacorporal;

public class MasaCorporal {

    public static void main(String[] args) {
        Persona dat= new Persona();
        System.out.println("Ingrese la altura en metros");
        dat.IngreseAltura();
        System.out.println("Ingrese peso en kg");
        dat.IngresePeso();
        System.out.println("Indice de Masa Corporal: " + dat.CalculaMasa());
        System.out.println("Atendiendo al IMC, tiene: " + dat.IMC());
    }

  
      
}
