package mclovin;

public class cursos {
    private String nombre;
    private String categoria;
    private int periodo;

    public cursos(String nombre, String categoria, int periodo) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.periodo = periodo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPeriodo() {
        return periodo;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", periodo=" + periodo +
                '}';
    }
}
