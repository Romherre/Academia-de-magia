import java.util.ArrayList;
import Exceptions.NivelInsuficienteException;
import Exceptions.HechizoYaAprendidoException;

public class Academia {
    private ArrayList<Hechizo> hechizos = new ArrayList<>();
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private ArrayList<AprendizajeDeHechizos> aprendizajes = new ArrayList<>();

    // Método para registrar un nuevo hechizoooo
    public void registrarHechizo(Hechizo hechizo) {
        hechizos.add(hechizo);
    }

    // Método para registrar un estudiante
    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Intenta que un estudiante aprenda un hechizo
    public void intentoAprender(Estudiante estudiante, Hechizo hechizo)
            throws NivelInsuficienteException, HechizoYaAprendidoException {

        if (estudiante.yaAprendio(hechizo)) {
            throw new HechizoYaAprendidoException("El estudiante ya hizo este hechizo.");
        }

        if (!nivelCompatible(estudiante.getNivel(), hechizo.getDificultad())) {
            throw new NivelInsuficienteException("El estudiante no tiene el nivel suficiente para aprender este hechizo.");
        }

        estudiante.aprenderHechizo(hechizo);
        aprendizajes.add(new AprendizajeDeHechizos(estudiante, hechizo));
        System.out.println(estudiante.getNombre() + " aprendió el hechizo " + hechizo.getNombre() + "!");
    }

    // Verifica si el nivel del estudiante es compatinle con la dificultad del hechizo
    private boolean nivelCompatible(String nivelEstudiante, String dificultadHechizo) {
        if (nivelEstudiante.equals("experto")) return true;
        if (nivelEstudiante.equals("intermedio") && !dificultadHechizo.equals("avanzado")) return true;
        return nivelEstudiante.equals("principiante") && dificultadHechizo.equals("básico");
    }

    // Reporte completo de aprendizajes
    public void mostrarReporte() {
        System.out.println("\n REPORTE DE LA ACADEMIA DE MAGIA");
        System.out.println("Director de la academia: " + Director.getInstancia("").getNombre());
        System.out.println("----------------------------------------------");

        if (aprendizajes.isEmpty()) {
            System.out.println("No se registraron aprendizajes.");
        } else {
            System.out.println("Cantidad total de aprendizajes: " + aprendizajes.size());
            System.out.println("\n Detalle de aprendizajes:\n");

            int i = 1;
            for (AprendizajeDeHechizos a : aprendizajes) {
                Hechizo hechizo = a.getHechizo();
                Estudiante estudiante = a.getEstudiante();

                System.out.println(i++ + ". Estudiante: " + estudiante.getNombre());
                System.out.println("Nivel del estudiante: " + estudiante.getNivel());
                System.out.println("Hechizo: " + hechizo.getNombre());
                System.out.println("Dificultad: " + hechizo.getDificultad());
                System.out.println("Elemento: " + hechizo.getElemento());
                System.out.println("-------------------------------------");
            }
        }
    }
}
