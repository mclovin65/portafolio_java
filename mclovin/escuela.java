package mclovin;

public class escuela {
    public static void main(String[] args){

        estudiantes estudiante1 = new estudiantes("Pepe", "pepe@gmail.com", 8, true);
        estudiantes estudiante2 = new estudiantes("Juan", "juan@gmail.com", 8, true);
        estudiantes estudiante3 = new estudiantes("Luis", "luis@gmail.com", 9, false);
        estudiantes estudiante4 = new estudiantes("Wuicho", "wuicho@gmail.com", 7, false);
        estudiantes estudiante5 = new estudiantes("Jose", "jose@gmail.com", 7, true);


        cursos curso1 = new cursos("Sociales", "Historia", 2);
        cursos curso2 = new cursos("Naturales", "Biología", 1);
        cursos curso3 = new cursos("Matemática", "Razonamiento", 2);
        cursos curso4 = new cursos("Informática", "Programación", 3);


        System.out.println("Listado de Alumnos:");
        System.out.println(estudiante1.getNombre() + ", " + estudiante1.getCorreo()+","+estudiante1.getEdad()+","+ estudiante1.isSolvencia());
        System.out.println(estudiante2.getNombre() + ", " + estudiante2.getCorreo()+","+estudiante2.getEdad()+","+ estudiante2.isSolvencia());
        System.out.println(estudiante3.getNombre() + ", " + estudiante3.getCorreo()+","+estudiante3.getEdad()+","+ estudiante3.isSolvencia());
        System.out.println(estudiante4.getNombre() + ", " + estudiante4.getCorreo()+","+estudiante4.getEdad()+","+ estudiante4.isSolvencia());
        System.out.println(estudiante5.getNombre() + ", " + estudiante5.getCorreo()+","+estudiante5.getEdad()+","+ estudiante5.isSolvencia());


        System.out.println("\nListado de Cursos:");
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(curso4);
    }
}









