public class Hechizo {
    private String nombre;
    private String dificultad;
    private String elemento;

    public Hechizo(String nombre, String dificultad, String elemento) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.elemento = elemento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDificultad() {
        return dificultad;
    }

    public String getElemento() {
        return elemento;
    }
}
