package tallerpoo;

import java.util.Scanner;

public class Tallerpoo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        double cantidadtotal = 0;
        String nombre;
        double v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12;
        do {
            System.out.println("escriba el nombre");
            nombre=leer.next();
            System.out.println("escriba el valor 1");
            v1 = leer.nextDouble();
            System.out.println("escriba el valor 2");
            v2 = leer.nextDouble();
            System.out.println("escriba el valor 3");
            v3 = leer.nextDouble();
            System.out.println("escriba el valor 4");
            v4 = leer.nextDouble();
            System.out.println("escriba el valor 5");
            v5 = leer.nextDouble();
            System.out.println("escriba el valor 6");
            v6 = leer.nextDouble();
            System.out.println("escriba el valor 7");
            v7 = leer.nextDouble();
            System.out.println("escriba el valor 8");
            v8 = leer.nextDouble();
            System.out.println("escriba el valor 9");
            v9 = leer.nextDouble();
            System.out.println("escriba el valor 10");
            v10 = leer.nextDouble();
            System.out.println("escriba el valor 11");
            v11 = leer.nextDouble();
            System.out.println("escriba el valor 12");
            v12 = leer.nextDouble();
            vendedor v=new vendedor(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, nombre);
            System.out.println(" Nombre :"+v.getNombre());
            System.out.println("totalidad de ventas :"+v.sumatoriaporcliente());
            cantidadtotal=cantidadtotal+v.sumatoriaporcliente();
            
            System.out.println("si desea salir,ingrese 0,\n si no desea salir ingrese cualquier otra tecla");
            n = leer.nextInt();
        } while (n != 0);
        System.out.println("cantidad total:"+ cantidadtotal);
    }

}
