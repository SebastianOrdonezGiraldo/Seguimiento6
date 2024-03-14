package Ejercicio6;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        String[] opciones = {"Agregar libro", "Agregar película", "Listar libros", "Listar películas", "Registrar venta", "Ver total de ventas", "Salir"};

        while (true) {
            int opcion = JOptionPane.showOptionDialog(null, "Elige una opción:", "Tienda Virtual", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
            switch (opcion) {
                case 0:
                    String autor = JOptionPane.showInputDialog("Ingresa el autor del libro:");
                    String tituloLibro = JOptionPane.showInputDialog("Ingresa el título del libro:");
                    Float precioLibro = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio del libro:"));
                    tienda.agregarProducto(new Libro(autor, tituloLibro, precioLibro));
                    break;
                case 1:
                    String tituloPelicula = JOptionPane.showInputDialog("Ingresa el título de la película:");
                    String protagonista = JOptionPane.showInputDialog("Ingresa el protagonista de la película:");
                    String director = JOptionPane.showInputDialog("Ingresa el director de la película:");
                    Float precioPelicula = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio de la película:"));
                    tienda.agregarProducto(new Pelicula(tituloPelicula, protagonista, director, precioPelicula));
                    break;
                case 2:
                    tienda.listarProductos("Libro");
                    break;
                case 3:
                    tienda.listarProductos("Pelicula");
                    break;
                case 4:
                    String tituloVenta = JOptionPane.showInputDialog("Ingresa el título del producto que se vendió:");
                    tienda.registrarVenta(tituloVenta);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Total de ventas: " + tienda.getTotalVentas());
                    break;
                case 6:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elige una opción del 1 al 7.");
            }
        }
    }
}