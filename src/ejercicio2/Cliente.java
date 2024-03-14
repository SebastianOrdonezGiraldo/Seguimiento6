package ejercicio2;

import java.util.ArrayList;

public class Cliente {
    private ArrayList<ProductoFinanciero> productos;

    public Cliente() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(ProductoFinanciero producto) {
        this.productos.add(producto);
    }
    public double getSaldoTotal() {
        double total = 0;
        for (ProductoFinanciero producto : this.productos) {
            total += producto.getSaldo();
        }
        return total;
    }
}


