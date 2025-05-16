public class Main {
    public static void main(String[] args) {
        Director director = Director.getInstancia("Juan druida");
        Academia academia = new Academia();

        Hechizo h1 = new Hechizo("Prender la luz", "básico", "luz");
        Hechizo h2 = new Hechizo("Tirar Agua", "intermedio", "Agua");
        Hechizo h3 = new Hechizo("Lanzar fuego", "avanzado", "fuego");

        academia.registrarHechizo(h1);
        academia.registrarHechizo(h2);
        academia.registrarHechizo(h3);

        Estudiante e1 = new Estudiante("Marga", 12, "principiante");
        Estudiante e2 = new Estudiante("Jose", 13, "intermedio");

        academia.registrarEstudiante(e1);
        academia.registrarEstudiante(e2);

        try {
            academia.intentoAprender(e1, h1);
            academia.intentoAprender(e1, h1); // Repetido intento de aprender mismo hechizo
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            academia.intentoAprender(e1, h3); // Nivel insuficiente
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            academia.intentoAprender(e2, h2); // va a dar que tiene el nivel para aprenderlo
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Mostrar reporte final
        academia.mostrarReporte();
    }
}

