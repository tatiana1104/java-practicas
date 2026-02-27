public class Principal {

    public static void main(String[] args) {

        Colegio a, b;
        a = new Colegio("ITI", new Persona(12345, "Dayron", true), 5);
        b = new Colegio("Andes", new Persona(54321, "Dayana", false), 5);

        for (int i = 0; i < a.getBloque().length; i++) {
            a.getBloque()[i] = new Salon("Grado " + (i + 1), new Persona(i, "Wilmer " + i, true), (i + 2), 5);
            b.getBloque()[i] = new Salon("Grado " + (i + 1), new Persona(i, "Urquina " + i, false), (i + 2), 5);
            for (int j = 0; j < 10; j++) {
                a.getBloque()[i].ingresarEstudiante(new Persona(j, "Estudiante " + j, true));
                b.getBloque()[i].ingresarEstudiante(new Persona(j, "Estudiante " + j, false));
            }
        }

        System.out.println(a);
        System.out.println("\n////////////////////////////////////////////////////\n");
        System.out.println(b);

        a.trasladar(b, "Estudiante 0",2);
        System.out.println("\n\n-----------------------------------------------------");
        System.out.println(a);
        System.out.println("\n////////////////////////////////////////////////////\n");
        System.out.println(b);
    }

}
