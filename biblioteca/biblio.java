package biblioteca;

public class biblio {

    public static void programa(){
        System.out.println("Bibliteca");

        libro libro1 = new libro("libro 11111","PEOE", "1994");
        libro libro2 = new libro("libro 222","Maria", "2002");

        System.out.println(libro1.getTitulo());
        System.out.println(libro2.getTitulo());

        //AUTORES
        System.out.println(libro1.getAutor());
        System.out.println(libro2.getAutor());

        //FECHAS
        System.out.println(libro1.getFecha());
        System.out.println(libro2.getFecha());
    }
}
