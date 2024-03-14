package Ejercicio6;

import javax.swing.*;
import java.util.ArrayList;

class Tienda {
    private ArrayList<Producto> productos = new ArrayList<>();
    private Float totalVentas = 0.0f;

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }


    public void listarProductos(String tipo) {
        StringBuilder productosStr = new StringBuilder();
        for (Producto producto : productos) {
            if (producto.getClass().getSimpleName().equals(tipo)) {
                productosStr.append(producto.toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, productosStr.toString());
    }

    public void registrarVenta(String titulo) {
        for (Producto producto : productos) {
            if (producto.getTitulo().equals(titulo)) {
                totalVentas += producto.getPrecio();
                productos.remove(producto);
                break;
            }
        }
    }
    public Float getTotalVentas() {
        return totalVentas;
    }
}
