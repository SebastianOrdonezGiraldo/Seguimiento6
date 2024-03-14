package Ejercicio6;

public class Libro implements Producto{
    private String autor;
    private String titulo;
    private Float precio;

    public Libro(String autor, String titulo, Float precio) {
        this.autor = autor;
        this.titulo = titulo;
        this.precio = precio;
    }
    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Libro" +"\n" +
                "autor:" + autor + "\n" +
                "titulo:" + titulo + "\n" +
                "precio:" + precio;
    }
}
