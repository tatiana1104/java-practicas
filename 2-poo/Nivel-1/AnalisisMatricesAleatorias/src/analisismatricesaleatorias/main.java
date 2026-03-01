
package analisismatricesaleatorias;

public class main {

    public static void main(String[] args) {
        
        //Determina el tamaño de la matriz
        int matriz1[][] = new int[3][5];
        int matriz2[][] = new int[3][5];
        //determina el numero que tomamos como mayor y menor 
        //debido al rango que utilizamos el menor sera el numero mas grande
        //mientras que el mayor sera el numero mas pequeño
        int men = 23, may = 15;
        //inicializamos las posiciones de las matrices
        //Xmat1 y Ymat1 son las posiciones en la matriz 1
        //Xmat2 y Ymat2 son las posiciones en la matriz 2
        int Xmat1 = 0, Ymat1 = 0, Xmat2 = 0, Ymat2 = 0;
        
        System.out.println("Matriz 1");
        //se inicia las filas de la matriz (3)
        for (int i = 0; i < 3; i++) {
            //se inicia las columnas de la matriz (5)
            for (int j = 0; j < 5; j++) {
                //se determina que la posicion de la matriz va cambiando
                //dependiendo del numero que tenga i y j
                //utilizamos mat.random para colocar numero al azar
                //se utiliza el 9 porque son 9 numero que hay entre el 15 y 23
                //contando a ellos mismo
                //Se utiliza el 15 debido a que es desde ese numero que se calcula el ramdom
                matriz1[i][j] =  (int) (Math.random() * 9) + 15;
                //se muestra el numero escogido al azar
                System.out.println(matriz1[i][j] + "|");
                //Se utiliza el condicional para que vea si el numero 
                //en la posicion actual es el menor hasta el momento
                 if (men > matriz1[i][j]) {
                     //si lo es el numero sera actualizado
                    men = matriz1[i][j];
                    //se guarda la posicion de i 
                    Xmat1 = i;
                    //se guarda la posicion de j
                    Ymat1 = j;
                    //es la posicion donde se encontre el nuevo numero menor
                }
            }
        }
        System.out.println("-----------------------------");
        System.out.println("Matriz 2");
        //se inicia las filas de la matriz (3)
        for (int i = 0; i < 3; i++) {
            //se inicia las columnas de la matriz (5)
            for (int j = 0; j < 5; j++) {
                //se determina que la posicion de la matriz va cambiando
                //dependiendo del numero que tenga i y j
                //utilizamos mat.random para colocar numero al azar
                //se utiliza el 9 porque son 9 numero que hay entre el 15 y 23
                //contando a ellos mismo
                //Se utiliza el 15 debido a que es desde ese numero que se calcula el ramdom
                matriz2[i][j] =  (int) (Math.random() * 9) + 15;
                //se muestra el numero escogido al azar
                System.out.println(matriz2[i][j] + "|");
                //Se utiliza el condicional para que vea si el numero 
                //en la posicion actual es el mayor hasta el momento
                if (may < matriz2[i][j]) {
                //si lo es el numero sera actualizado    
                    may = matriz2[i][j];
                    //se guarda la posicion de i 
                    Xmat2 = i;
                    //se guarda la posicion de j
                    Ymat2 = j;
                    //es la posicion donde se encontre el nuevo numero menor
                }
            }
        }
        
        //se muestran los datos anteriormente calculados
        System.out.println("La menor edad de la matriz 1 es: " + men);
        System.out.println("Esta en la posicion: [" + Xmat1 + "][" + Ymat1 + "]");
        System.out.println("-------------------------------------");
        System.out.println("La mayor edad de la matriz 2 es: " + may);
        System.out.println("Esta en la posicion: [" + Xmat2 + "][" + Ymat2 + "]");
    }
    
}
