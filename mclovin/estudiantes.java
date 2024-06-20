package mclovin;

public class estudiantes {
    private String nombre;
    private String correo;
    private int edad;
    private boolean solvencia;

    public estudiantes(String nombre, String correo, int edad, boolean solvencia) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.solvencia = solvencia;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isSolvencia() {
        return solvencia;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSolvencia(boolean solvencia) {
        this.solvencia = solvencia;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", edad=" + edad +
                ", solvencia=" + solvencia +
                '}';
    }
}


