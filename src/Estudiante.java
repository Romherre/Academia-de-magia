import java.util.ArrayList; //importo para usar el arraylist

public class Estudiante {
    private String nombre;
    private int edad;
    private String nivel;
    // arraylist
    private ArrayList<Hechizo> hechizosAprendidos = new ArrayList<>();

    public Estudiante(String nombre, int edad, String nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public boolean yaAprendio(Hechizo hechizo) {
        for (Hechizo h : hechizosAprendidos) {
            if (h.getNombre().equalsIgnoreCase(hechizo.getNombre())) {
                return true;
            }
        }
        return false;
    }

    public void aprenderHechizo(Hechizo hechizo) {
        hechizosAprendidos.add(hechizo);
    }

    public ArrayList<Hechizo> getHechizosAprendidos() {
        return hechizosAprendidos;
    }
}
