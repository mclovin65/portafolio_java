package biblioteca;

public class libro {
    private String titulo;
    private String autor;
    private String fecha;

    //metodo Constructor

    public libro(String titulo, String autor, String fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;

    }

    //METODOS DE TIPO GET (OBTENER)

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFecha() {
        return fecha;
    }

//METODOS DE TIPO SET (ESTRABLECER)

    public void setTitulo(String autor) {
        this.autor = autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    @Override
    public String toString() {
        return "Titulo:" + titulo + ",Autor: " + autor + "Fecha" + fecha;
    }

    libro libro1 = new libro("EL Padrino", "Mario puso", "10/3/1969");
    libro libro2 = new libro("El Principito", "Antonie", "6/4/1943");
    libro libro3 = new libro("El niño con el pijama de rayas", "John Boyne", "5/1/2006");
    libro libro4 = new libro("la calle donde tu vives", "Hector Gaitán", "1960");
    libro libro5 = new libro("El Nombre de la Rosa", "Umberto Eco", "1980");
    libro libro6 = new libro("Don quijote de la Mancha", "Miguel de  cervantes", "1605");
    libro libro7 = new libro("El código de Da Vinci", "Dan Brown", "18/3/2003");
    libro libro8 = new libro("Orgullo y prejuicio", "Jane Austen", "1813");
    libro libro9 = new libro("crimen y castigo", "Fiódor Dostoyevski", "1866");
    libro libro10 = new libro("En busca del tiempo perdido", "Marcel Proust", "1914");
}