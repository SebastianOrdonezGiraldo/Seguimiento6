package Ejercicio6;

public class Pelicula implements Producto{
    private String titulo;
    private String protagonista;
    private String director;
    private Float precio;
    public Pelicula(String titulo, String protagonista, String director, Float precio) {
        this.titulo = titulo;
        this.protagonista = protagonista;
        this.director = director;
        this.precio = precio;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public String getDirector() {
        return director;
    }

    public Float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Pelicula" +
                "titulo" + titulo + '\'' +
                "protagonista" + protagonista + '\'' +
                "director=" + director + '\'' +
                "precio" + precio;
    }
}
