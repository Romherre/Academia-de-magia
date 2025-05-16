public class AprendizajeDeHechizos {
    private Estudiante estudiante;
    private Hechizo hechizo;

    public AprendizajeDeHechizos(Estudiante estudiante, Hechizo hechizo) {
        this.estudiante = estudiante;
        this.hechizo = hechizo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Hechizo getHechizo() {
        return hechizo;
    }

    @Override
    public String toString() {
        return "Estudiante: " + estudiante.getNombre() + " aprendió el hechizo: " + hechizo.getNombre();
    }
}
