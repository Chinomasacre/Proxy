package com.example.proxy.Domains;


public class Libro implements ILibro{
    private String Id;
    private String Titulo;
    private String Autor;
    private String Contenido;

    public Libro() {
        this.Id = "1";
        this.Titulo = "Cronicas del Sr Gato";
        this.Autor = "Sandro Rinconces";
        this.Contenido =
                "En una tranquila ciudad, vivía el Sr. Gato, un felino con un ingenio afilado y un gusto por las gatas mayores. \n" +
                "Aunque era conocido por su independencia y elegancia, el Sr. Gato también lo llamaban el aguacero, " +
                "por que le caia a todo el mundo. Sin embargo un dia vio algo que no era de este mundo, que le llamo la atencion " +
                "y con valentia y solo diciendo en su frase celebre, 'El que perdona caminaba sobre las aguas y yo ni nadar se' se dirigio" +
                "a lo desconocido. \nSin saber que eso le cambiaria la vida para siempre...";
    }

    public Libro(String id, String titulo, String autor, String contenido) {
        Id = id;
        Titulo = titulo;
        Autor = autor;
        Contenido = contenido;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        Contenido = contenido;
    }

    @Override
    public String Leer() {
        return "Titulo: "+ this.Titulo + "\nEl contenido del libro es: \n\t" + this.Contenido;
    }

    @Override
    public String Descargar(String Pagina) {
        return "Descargando el libro de la pagina: " + Pagina;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Id='" + Id + '\'' +
                ", Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", Contenido='" + Contenido + '\'' +
                '}';
    }
}
